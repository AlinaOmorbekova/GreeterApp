package com.example.andoid.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button btn;
    TextView text1;

    public void displayTOast(View v){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.et1);

        btn=(Button) findViewById(R.id.btn);

        text1=(TextView) findViewById(R.id.text1);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(et1.getText())) {
                    Toast.makeText(MainActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                    et1.requestFocus();
                } else {
                    String a = et1.getText().toString();
                    text1.setText("Hello, " + a);
                }
            }
        });

    }
}
