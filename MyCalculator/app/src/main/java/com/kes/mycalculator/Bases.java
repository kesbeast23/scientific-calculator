package com.kes.mycalculator;//activity_bases

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Bases extends AppCompatActivity implements View.OnClickListener {

    Calculation calculations = new Calculation(this);


    private TextView sub;
    private TextView main;
    private Button clear,b7,b8,b9,b4,b5,b6,b1,b2,b3,b0,decimal,binary,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bases);
        sub =  findViewById(R.id.et);
        main = findViewById(R.id.result);
        binary = findViewById(R.id.binary);
        clear =findViewById(R.id.clear);
        back =findViewById(R.id.back);
        decimal =  findViewById(R.id.decimal);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b0 = findViewById(R.id.b0);


        back.setOnClickListener(this);
        clear.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        decimal.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        binary.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b0.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.b0:
                calculations.numberClicked("0");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b1:
                calculations.numberClicked("1");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b2:
                calculations.numberClicked("2");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b3:
                calculations.numberClicked("3");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b4:
                calculations.numberClicked("4");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b5:
                calculations.numberClicked("5");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b6:
                calculations.numberClicked("6");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b7:
                calculations.numberClicked("7");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b8:
                calculations.numberClicked("8");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.b9:
                calculations.numberClicked("9");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.clear:
                calculations.clear();
                main.setText("0");
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.back:
                calculations.bs();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.decimal:

                main.setText(calculations.getCurrentNumber());
                String string =main.getText().toString();
                calculations.toDecimal(string);
                main.setText(calculations.answer);
                sub.setText("");
                Toast toast =Toast.makeText(this,"Conversion Complete",Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.binary:
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                toast =Toast.makeText(this,"Calculation Complete",Toast.LENGTH_SHORT);
                toast.show();
                break;

        }
    }
}
