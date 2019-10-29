package com.kes.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class Trigonmentry extends AppCompatActivity {

    Calculation calculations = new Calculation(this);


    private boolean INV = false;

    private TextView sub;
    private TextView main;

    private Button mc;
    private Button mr;
    private Button madd;
    private Button msub;
    private Button ms;
    private ToggleButton inv;

    private Button sin,cos,tan;

    private Button ten_raisedto_x;
    private Button e_raisedto_x;
    private Button one_div_x;
    private Button parent_open;
    private Button parent_close;
    private Button mod;

    private Button sq;
    private Button e;
    private Button c;
    private Button bs;
    private Button div;

    private Button cb;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button mul;

    private Button indice;
    private Button four;
    private Button five;
    private Button six;
    private Button plus;

    private Button sqrt;
    private Button ln;
    private Button one;
    private Button two;
    private Button three;
    private Button minus;

    private Button root;
    private Button log;
    private Button negate;
    private Button zero;
    private Button decimal;
    private Button equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonmentry);

        sub = findViewById(R.id.et);
        main = findViewById(R.id.result);
        inv = findViewById(R.id.inverse);
        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                INV = !INV;
                if (INV){
                    sin.setText("sin-1");
                    cos.setText("cos-1");
                    tan.setText("tan-1");

                } else {
                    sin.setText("sin");
                    cos.setText("cos");
                    tan.setText("tan");
                }
            }
        });
        sin = findViewById(R.id.sin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INV){
                    calculations.operatorClicked("sin-1");
                } else {
                    calculations.operatorClicked("sin");
                }
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        cos = findViewById(R.id.cos);
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INV){
                    calculations.operatorClicked("cos-1");
                } else {
                    calculations.operatorClicked("cos");
                }
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        tan = findViewById(R.id.tan);
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (INV){
                    calculations.operatorClicked("tan-1");
                } else {
                    calculations.operatorClicked("tan");
                }
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        ten_raisedto_x = findViewById(R.id.tenPowX);
        ten_raisedto_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("10^x");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        e_raisedto_x = findViewById(R.id.e_raisedto_x);
        e_raisedto_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("e^x");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        one_div_x = findViewById(R.id.oneX);
        one_div_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("1/x");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        parent_open = findViewById(R.id.butbra);
        parent_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.parent_openClicked();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        parent_close = findViewById(R.id.butbraClose);
        parent_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.parent_closeClicked();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        mod = findViewById(R.id.mod);
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("mod");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        sq = findViewById(R.id.pow2);
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("sq");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        e = findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("e");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        c = findViewById(R.id.clear);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.clear();
                main.setText("0");
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        bs = findViewById(R.id.back);
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.bs();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("/");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        cb = findViewById(R.id.pow3);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("cb");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        seven = findViewById(R.id.b7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("7");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        eight = findViewById(R.id.b8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("8");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        nine = findViewById(R.id.b9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("9");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        mul = findViewById(R.id.multiply);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("*");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        indice = findViewById(R.id.powY);
        indice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("^");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        four = findViewById(R.id.b4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("4");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        five = findViewById(R.id.b5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("5");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        six = findViewById(R.id.b6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("6");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        plus = findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("+");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        sqrt = findViewById(R.id.sqrt);
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("sqrt");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        ln = findViewById(R.id.ln);
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("ln");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        one = findViewById(R.id.b1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("1");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        two = findViewById(R.id.b2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("2");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        three = findViewById(R.id.b3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("3");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        minus = findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("-");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        root = findViewById(R.id.yrt);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("rt");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        log = findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("log");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        negate = findViewById(R.id.plus_minus);
        negate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.operatorClicked("±");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });
        zero = findViewById(R.id.b0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.numberClicked("0");
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        decimal = findViewById(R.id.dot);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculations.decimalClicked();
                main.setText(calculations.getCurrentNumber());
                sub.setText(calculations.calc(calculations.numbers));
            }
        });

        equal = findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> expression = calculations.numbers;
                calculations.evaluateAnswer();
                main.setText(calculations.answer);
                sub.setText("");
                Toast toast =Toast.makeText(Trigonmentry.this,"Calculation Complete",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
