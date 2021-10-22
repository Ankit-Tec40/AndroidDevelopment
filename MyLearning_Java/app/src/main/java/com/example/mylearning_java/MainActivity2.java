package com.example.mylearning_java;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText n1=findViewById(R.id.n1);
        EditText n2=findViewById(R.id.n2);
        TextView ans=findViewById(R.id.ans);
        Button b1=findViewById(R.id.sum);
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                ans.setText(Double.toString(Double.parseDouble(n1.getText().toString())+Double.parseDouble(n2.getText().toString())));
            }
        });




    }
}