package com.example.hywoman.a20170912_216230084;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NestScene( View aaa ) {

        Intent i = new Intent( this, Main2Activity.class ):
        this.startActivity( i);

        Toast toast = Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG);
        toast.show();

    }
}
