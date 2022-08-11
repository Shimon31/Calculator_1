package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    TextView textView;
    String number1,number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);

    }

    public void add(View view) {

        getTextFromEditText();
        checkNull(0);



    }


    private void checkNull(int i) {
        if (number1.isEmpty()){
            Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show();
        }
        else if (number2.isEmpty()){
            Toast.makeText(this, "Enter a Number", Toast.LENGTH_SHORT).show();
        }
        else{

            switch (i){
                case 0:
                    double result = Double.parseDouble(number1) + Double.parseDouble(number2);
                    textView.setText(String.valueOf(result));
                    break;

                case 1:
                    double result1 = Double.parseDouble(number1) - Double.parseDouble(number2);
                    textView.setText(String.valueOf(result1));
                    break;

                case 2:
                    double result2 = Double.parseDouble(number1) * Double.parseDouble(number2);
                    textView.setText(String.valueOf(result2));
                    break;
                case 3:
                    double result3 = Double.parseDouble(number1) / Double.parseDouble(number2);
                    textView.setText(String.valueOf(result3));
                    break;


            }
        }

    }

    private void getTextFromEditText() {

        number1 = editText1.getText().toString();
        number2 = editText2.getText().toString();

    }

    public void sub(View view) {
        getTextFromEditText();
        checkNull(1);
    }

    public void mul(View view) {
        getTextFromEditText();
        checkNull(2);
    }

    public void div(View view) {
        getTextFromEditText();
        checkNull(3);
    }
}