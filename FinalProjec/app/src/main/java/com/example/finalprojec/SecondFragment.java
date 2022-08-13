package com.example.finalprojec;

import android.graphics.Typeface;
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

import static com.example.finalprojec.MainActivity.crim1;
import static com.example.finalprojec.MainActivity.crim2;
import static com.example.finalprojec.MainActivity.crim3;
import static com.example.finalprojec.MainActivity.crim4;

public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ImageView imageView;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView tvSuspect1, tVSuspect1Desc, tvSuspect2, tVSuspect2Desc, tvSuspect3, tVSuspect3Desc, tvSuspect4, tVSuspect4Desc;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        final NavController navController = Navigation.findNavController(view);
        tvSuspect1 = view.findViewById(R.id.tvSuspect1);
        tvSuspect2 = view.findViewById(R.id.tvSuspect2);
        tvSuspect3 = view.findViewById(R.id.tvSuspect3);
        tvSuspect4 = view.findViewById(R.id.tvSuspect4);
        tVSuspect1Desc = view.findViewById(R.id.tvSuspect1Desc);
        tVSuspect2Desc = view.findViewById(R.id.tvSuspect2Desc);
        tVSuspect3Desc = view.findViewById(R.id.tvSuspect3Desc);
        tVSuspect4Desc = view.findViewById(R.id.tvSuspect4Desc);

        tvSuspect1.setText(crim1.getName());
        tvSuspect2.setText(crim2.getName());
        tvSuspect3.setText(crim3.getName());
        tvSuspect4.setText(crim4.getName());

        tVSuspect1Desc.setText("Age: "+crim1.getAge()+"\nHeight: "+crim1.getHeight()+"\nWeight: "+crim1.getWeight()+"\nDescription: "+crim1.getDesc());
        tVSuspect2Desc.setText("Age: "+crim2.getAge()+"\nHeight: "+crim2.getHeight()+"\nWeight: "+crim2.getWeight()+"\nDescription: "+crim2.getDesc()+"\n"+"\n");
        tVSuspect3Desc.setText("Age: "+crim3.getAge()+"\nHeight: "+crim3.getHeight()+"\nWeight: "+crim3.getWeight()+"\nDescription: "+crim3.getDesc());
        tVSuspect4Desc.setText("Age: "+crim4.getAge()+"\nHeight: "+crim4.getHeight()+"\nWeight: "+crim4.getWeight()+"\nDescription: "+crim4.getDesc());
    }
}