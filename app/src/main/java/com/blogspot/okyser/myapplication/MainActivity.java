package com.blogspot.okyser.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);

    }

    public void clicker(View v) {
        int rbtn = rg.getCheckedRadioButtonId();
        Toast.makeText(this, rb.getText(), Toast.LENGTH_SHORT).show();
    }



}
