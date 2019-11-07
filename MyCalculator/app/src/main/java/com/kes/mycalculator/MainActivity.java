package com.kes.mycalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStart(View view){
        Intent intent = new Intent(this, Basic.class);
        startActivity(intent);
    }
    public void onTrig(View view){
        Intent intent = new Intent(this, Trigonmentry.class);
        startActivity(intent);
    }
    public void onBase(View view){
        Intent intent = new Intent(this, Bases.class);
        startActivity(intent);
    }
}
