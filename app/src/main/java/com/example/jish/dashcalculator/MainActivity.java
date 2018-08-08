package com.example.jish.dashcalculator;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.String;

import static android.support.v4.widget.TextViewCompat.setTextAppearance;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView result;
    Button add,sub,prod,div;

    float result_num;
    int number1,number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       num1=(EditText)findViewById(R.id.num1);
       num2=(EditText)findViewById(R.id.num2);
       result=findViewById(R.id.result);

       add=(Button)findViewById(R.id.buttonAdd);
       sub=(Button)findViewById(R.id.buttonSub);
       prod=(Button)findViewById(R.id.buttonProd);
       div=(Button)findViewById(R.id.buttonDiv);


       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

              number1=Integer.parseInt(num1.getText().toString());
               number2=Integer.parseInt(num2.getText().toString());
              result_num= number1 + number2;

              result.setText(String.valueOf(result_num));
           }
       });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                result_num= number1 - number2;

                result.setText(String.valueOf(result_num));

            }
        });
        prod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                result_num= number1 * number2;

                result.setText(String.valueOf(result_num));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number1=Integer.parseInt(num1.getText().toString());
                number2=Integer.parseInt(num2.getText().toString());
                result_num= number1/number2;

                result.setText(String.valueOf(result_num));

            }
        });


    }

}