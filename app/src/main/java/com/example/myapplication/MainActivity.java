package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Log.d("fail","it's not working");
    }
        public void handleText (View v) {
            v.setEnabled(false);
//        EditText t=findViewById(R.id.source);
//        String input=t.getText().toString();
//        ((TextView)findViewById(R.id.output)).setText(input);
//            Toast.makeText(this,input,Toast.LENGTH_LONG).show();
            Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show();
//            Log.d("info",input);

        }
    }

    /*public void disable(View v) {

        View myView=findViewById(R.id.button11);
        myView.setEnabled(false);
        Button button=(Button) myView;
        button.setText("New Disabled");
        /*v.setEnabled(false);
        //Log.d("success","Button Disabled");
        Button button =(Button) v;
        button.setText("Disabled");
        */


