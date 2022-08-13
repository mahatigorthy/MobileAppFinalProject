package com.example.finalprojec;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import static com.example.finalprojec.BeginningFragment.name;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ArrayList<String> criminals, hint;
    Spinner spinner;
    TextView textView, textView2, textView3;
    String chosenCriminal;
    Button guessButton, giveUpButton, hintButton;
    int tries = 3;
    static String winOrLose;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);;
        spinner = view.findViewById(R.id.spinner);
        textView = view.findViewById(R.id.tvThirdFragment);
        textView2 = view.findViewById(R.id.textViewHint);
        textView3 = view.findViewById(R.id.textViewGuess);
        criminals = new ArrayList<String>();
        hint = new ArrayList<String>();
        giveUpButton = view.findViewById(R.id.giveUpButton);
        hintButton = view.findViewById(R.id.hintButton);
        guessButton = view.findViewById(R.id.guessButton);
        guessButton.setEnabled(false);


        criminals.add(" ");
        criminals.add("George Foyet");
        criminals.add("Ian Doyle");
        criminals.add("Niall Lewis");
        criminals.add("Spencer Reid");
        hint.add("The criminal has dark brown hair.");
        hint.add("The criminal does not come from a good family.");
        hint.add("The suspect has had a criminal history");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<String>(this.getContext(), R.layout.support_simple_spinner_dropdown_item, criminals);
        spinner.setAdapter(spinnerAdapter);
        spinner.setSelection(0, false);
        TextView selectedView = (TextView) spinner.getSelectedView();
        if (selectedView != null) {
            selectedView.setTextColor(getResources().getColor(R.color.white));
        }
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                chosenCriminal = criminals.get(i);
                if(i != 0)
                {
                    guessButton.setEnabled(true);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chosenCriminal.equalsIgnoreCase("George Foyet")) {
                    winOrLose = "win";
                    navController.navigate(R.id.action_thirdFragment_to_finalFragment);
                }
                else {
                    if(tries > 0)
                    {
                        textView.setText("Incorrect, you have "+tries+"more tries left");
                        tries--;
                    }
                    else {
                        winOrLose = "lose";
                        navController.navigate(R.id.action_thirdFragment_to_finalFragment);

                    }

                }
            }
        });

        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hint.size()>0){
                    Log.d("here", "here");
                    textView3.setText(hint.get(0));
                    hint.remove(0);
                }
                else {
                    textView3.setText("No more hints available");
                }
            }
        });

        giveUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                winOrLose = "lose";
                navController.navigate(R.id.action_thirdFragment_to_finalFragment);
            }
        });

    }

}


