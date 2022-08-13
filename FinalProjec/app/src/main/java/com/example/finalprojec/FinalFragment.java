package com.example.finalprojec;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.finalprojec.ThirdFragment.winOrLose;
import static com.example.finalprojec.BeginningFragment.name;

public class FinalFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    String output;
    Button button;
    ImageView imageView;
    TextView textView, textView2;
    String userName;
    SharedPreferences pref;


    public FinalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_final, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);
        output = winOrLose;
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        imageView = view.findViewById(R.id.imageView);
        button = view.findViewById(R.id.button);
        userName = name;
        pref = getActivity().getSharedPreferences("MY_PREFERENCES", 0);

        if(output == "win") {
            output = "won!";
            imageView.setImageResource(R.drawable.injail);
            textView.setText("Congratulations, you win! You successfully jailed the criminal. Thank you for helping Garcia!");
        }

        else if(output == "lose") {
            output = "lost :(";
            imageView.setImageResource(R.drawable.criminalopen);
            textView.setText("You lose. The killer is still on the loose. You let Garcia down :(");
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("Detective "+userName +" "+output);
                String indexStatus = pref.getString("winOrLose", "hi");  // false is the default value if nothing is returned.
                if(!indexStatus.equalsIgnoreCase("hi")) {
                    textView2.append("\n"+indexStatus);
                }

                pref.edit().putString("winOrLose", String.valueOf(textView2.getText())).apply();
            }
        });

    }

}