package com.example.finalprojec;

import android.content.Intent;
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
import android.widget.Button;
import android.widget.ImageView;

public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    static final int NUMBER_CODE = 1234;
    ImageView imageView;
    Button button2, button6, button22, button5, button1, button8, button23, button4, button21, button9;
    int chosenButton = 0;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final NavController navController = Navigation.findNavController(view);
        imageView = view.findViewById(R.id.imageViewFragment1);

        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);
        button21 = view.findViewById(R.id.button21);
        button22 = view.findViewById(R.id.button22);
        button23 = view.findViewById(R.id.button23);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("buttonClicked", "buttonClicked");
                chosenButton = 1;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 2;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 4;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 5;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 6;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 8;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 9;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 21;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 22;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chosenButton = 23;
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                intent.putExtra("chosenButton", String.valueOf(chosenButton));
                startActivity(intent);
            }
        });



    }
}