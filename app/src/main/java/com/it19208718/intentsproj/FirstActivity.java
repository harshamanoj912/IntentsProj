package com.it19208718.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button button;
    public static final String EXTRA_NUMB1 = "com.it19208718.inentproj.EXTRA_NUMB1";
    public static final String EXTRA_NUMB2 = "com.it19208718.inentproj.EXTRA_NUMB2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = (Button) findViewById(R.id.okBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });


        }

    public void openSecondActivity() {

        EditText editText1 = (EditText) findViewById(R.id.num1val);
        EditText editText2 = (EditText) findViewById(R.id.num2val);

        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_NUMB1, number1);
        intent.putExtra(EXTRA_NUMB2, number2);
        startActivity(intent);





    }



}








