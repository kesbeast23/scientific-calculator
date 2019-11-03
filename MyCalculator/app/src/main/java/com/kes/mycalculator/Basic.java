package com.kes.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

@SuppressLint("NewApi")
public class Basic extends AppCompatActivity implements View.OnClickListener {


    Calculation calculations = new Calculation(this);


    private TextView sub;
    private TextView main;
    private Button clear,plus,minus,b7,b8,b9,multiply,b4,b5,b6,div,b1,b2,b3,
            equal,dot,b0,plusMinus,back,butBra,butBraClose,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        sub =  findViewById(R.id.et);
        main = findViewById(R.id.result);
        back = findViewById(R.id.back);
        clear =findViewById(R.id.clear);
        plus =  findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        multiply = findViewById(R.id.multiply);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        div = findViewById(R.id.div);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        b0 = findViewById(R.id.b0);
        plusMinus = findViewById(R.id.plus_minus);
        butBra = findViewById(R.id.butbra);
        butBraClose = findViewById(R.id.butbraClose);
        mod = findViewById(R.id.mod);

        back.setOnClickListener(this);
        clear.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        multiply.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        div.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        equal.setOnClickListener(this);
        dot.setOnClickListener(this);
        b0.setOnClickListener(this);
        plusMinus.setOnClickListener(this);
        butBra.setOnClickListener(this);
        butBraClose.setOnClickListener(this);
        mod.setOnClickListener(this);

        main.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {

                Basic.this.startActionMode(new ActionBarCallBack(
                        getApplicationContext()));
                return true;

            }
        });

    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
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
            case R.id.dot:
                calculations.decimalClicked();
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
            case R.id.plus:
                calculations.operatorClicked("+");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.minus:
                calculations.operatorClicked("-");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.multiply:
                calculations.operatorClicked("*");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.div:
                calculations.operatorClicked("/");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.butbra:
                calculations.parent_openClicked();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.butbraClose:
                calculations.parent_closeClicked();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.mod:
                calculations.operatorClicked("mod");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.plus_minus:
                calculations.operatorClicked("±");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
                break;
            case R.id.equal:
                ArrayList<String> expression = calculations.numbers;
                calculations.evaluateAnswer();
                main.setText(calculations.answer);
                sub.setText("");
                Toast toast = Toast.makeText(this, "Calculation Complete", Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"settings selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Help selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        
    }
}
