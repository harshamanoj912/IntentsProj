package com.it19208718.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();

        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();


        Intent intent = getIntent();
        int numb1 = intent.getIntExtra(FirstActivity.EXTRA_NUMB1, 0);
        int numb2 = intent.getIntExtra(FirstActivity.EXTRA_NUMB2, 0);

        final EditText number1 = (EditText) findViewById(R.id.enteredNumber1);
        final EditText number2 = (EditText) findViewById(R.id.enteredNumber2);

        number1.setText(String.valueOf(numb1));
        number2.setText(String.valueOf(numb2));


        Button btnPlus = (Button) findViewById(R.id.plus);
        Button btnDiv = (Button) findViewById(R.id.div);
        Button btnSubs = (Button) findViewById(R.id.subs);
        Button btnMulti = (Button) findViewById(R.id.multi);
        final TextView answer = (TextView) findViewById(R.id.answer);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int ans = num1+ num2;

                answer.setText(String.valueOf(ans));

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                Double ans = Double.parseDouble(String.valueOf(num1 / num2));

                answer.setText(String.valueOf(ans));

            }
        });


        btnSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                Double ans = Double.parseDouble(String.valueOf(num1 - num2));

                answer.setText(String.valueOf(ans));

            }
        });






        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());

                int ans = num1 * num2;

                answer.setText(String.valueOf(ans));

            }
        });





    }


}