package com.example.convertcurrency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Create objects for all the widgets
    TextView tv_to,tv_from,tv_result;
    EditText edt_amount;
    Button btnusd,btngbp,btnaus,btncan,btneuro,btnjpy;
    String amount;
    float pkr;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Clicklisteners();
    }
    //Initialize all the widgets and do view binding
    public void init(){
        tv_to=findViewById(R.id.tv_to);
        tv_from=findViewById(R.id.tv_from);
        tv_result=findViewById(R.id.tvresult);
        edt_amount=findViewById(R.id.edt_amount);
        btnusd=findViewById(R.id.btnusd);
        btngbp=findViewById(R.id.btngbp);
        btnaus=findViewById(R.id.btnaus);
        btncan=findViewById(R.id.btncan);
        btneuro=findViewById(R.id.btneur);
        btnjpy=findViewById(R.id.btnjpy);
    }

    //Now We will create click listeners for each button
    public void Clicklisteners(){
        btnusd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we get user input into this variable
                amount=edt_amount.getText().toString();
                pkr=83.92F;
                //integer.parse used to convert string value into integer for calculation purpose
                result=Integer.parseInt(amount)*(pkr);
                //again converted integer value into string because android system works with strings
                tv_result.setText(String.valueOf(result));
                tv_to.setText("USD");
                tv_from.setText("US$ = 83.92INR");
            }
        });
        btngbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=108.25F;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("GBP");
                tv_from.setText("GBP = 108.75INR");
            }
        });
        btnaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=92.66F;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("AUS");
                tv_from.setText("AUS$ = 92.66INR");
            }
        });
        btncan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=56.08F;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("CAN");
                tv_from.setText("CAN$ = 56.08INR");
            }
        });
        btneuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=61.39F;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("EURO");
                tv_from.setText("EURO = 61.39INR");
            }
        });
        btnjpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                //here we used double data type instead of int bcz the value is in float form
                double pkrr=0.58;
                double resultt=Double.parseDouble(amount)*(pkrr);
                tv_result.setText(String.valueOf(resultt));
                tv_to.setText("JPY");
                tv_from.setText("JPY = 0.58INR");
            }
        });
    }


}