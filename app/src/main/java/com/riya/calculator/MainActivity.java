package com.riya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    ImageView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    ImageView btn_allclear,btn_divide,btn_per,btn_dot,btn_clear,btn_equal,btn_plus,btn_minus,btn_multi;
    TextView inputtext,outputtext;

    String data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);


        btn_allclear = findViewById(R.id.btn_allclear);
        btn_divide = findViewById(R.id.btn_divide);
        btn_dot = findViewById(R.id.btn_dot);
        btn_per = findViewById(R.id.btn_per);
        btn_plus = findViewById(R.id.btn_plus);
        btn_clear = findViewById(R.id.btn_clear);
        btn_equal = findViewById(R.id.btn_equal);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multi = findViewById(R.id.btn_multi);

        inputtext = findViewById(R.id.inputtext);
        outputtext = findViewById(R.id.outputtext);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"3");
            }
        });


        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+".");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("/","/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResult = "";

                Scriptable scriptable = rhino.initStandardObjects();
                finalResult = rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();

                outputtext.setText(finalResult);
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"-");
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"/");
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"x");
            }
        });

        btn_per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText(data+"%");
            }
        });

        btn_allclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText("");
                outputtext.setText("");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtext.getText().toString();
                inputtext.setText("");
                outputtext.setText("");

            }
        });







    }
}