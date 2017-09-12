package com.example.hywoman.a20170912_216230084;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void onClick ( View v) {
        EditText aa = (EditText) findViewById(R.id.editText);
        //aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText( aa.getText());   }
}


