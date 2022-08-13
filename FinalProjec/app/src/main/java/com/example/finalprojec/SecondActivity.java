package com.example.finalprojec;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button getBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textViewActivitySecond);
        imageView = findViewById(R.id.imageViewActivitySecond);
        getBackButton = findViewById(R.id.buttonActivitySecond);

        Bundle extra = getIntent().getExtras();
        String chosen = extra.getString("chosenButton");
        Log.d("chosen", chosen);
        //textView.setText(chosen);

        if(chosen.equalsIgnoreCase("1")){
            textView.setText("Gloves:\nGloves were found to fit a male hand. The gloves fit individuals between 5 ft. 6 in. - 6 ft. 4 in.");
            imageView.setImageResource(R.drawable.gloves);
        }

        if(chosen.equalsIgnoreCase("2")) {
            textView.setText("Knife:\nKnife was found to have blood. Knife contained no fingerprints or additional information.");
            imageView.setImageResource(R.drawable.knife);
        }

        if(chosen.equalsIgnoreCase("4")){
            textView.setText("No viable information was able to be retrieved from this piece of evidence.");
            imageView.setImageResource(R.drawable.noviableinfo);
        }

        if(chosen.equalsIgnoreCase("5")) {
            textView.setText("Medicine:\nMedicine was used to treat a headache that either the victim or suspect was having.");
            imageView.setImageResource(R.drawable.medicine);
            //data visualization of how this medicine is used : headaches leg aghes, etc.
        }

        if(chosen.equalsIgnoreCase("6")) {
            textView.setText("Laptop:\nLaptop was used to retrieve information from the victim. The laptop had information that the suspect wanted.");
            imageView.setImageResource(R.drawable.laptop);
        }

        if(chosen.equalsIgnoreCase("8")) {
            textView.setText("No viable information was able to be retrieved from this piece of evidence.");
            imageView.setImageResource(R.drawable.noviableinfo);
        }

        if(chosen.equalsIgnoreCase("9")) {
            textView.setText("Blood:\nThis blood was not the victim's. The blood showed signs that there the victim put on a fight with the suspect. The suspect must be taller, and larger than the victim. However, DNA was not able to be withdrawn.");
            imageView.setImageResource(R.drawable.blood);
        }

        if(chosen.equalsIgnoreCase("21")) {
            textView.setText("No viable information was able to be retrieved from this piece of evidence.");
            imageView.setImageResource(R.drawable.noviableinfo);
        }

        if(chosen.equalsIgnoreCase("22")) {
            textView.setText("Hair:\nThis hair was not the victim's. The hair was brown in color short. However, DNA was not able to be withdrawn.");
            imageView.setImageResource(R.drawable.hair);
        }

        if(chosen.equalsIgnoreCase("23")) {
            textView.setText("Blood:\nThis was the victim's blood.");
            imageView.setImageResource(R.drawable.blood);
        }

        getBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeSecondActivity(view);
            }
        });

    }

    public void closeSecondActivity(View view)
    {
        Intent sendBack = new Intent();
        setResult(RESULT_OK, sendBack);
        finish();
    }

}