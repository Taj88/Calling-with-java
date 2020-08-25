package com.example.callingwithjavafile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
private TextView variable;
private TextView varage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        variable= (TextView)findViewById(R.id.Name);
        variable.setText("Taj");

      varage=(TextView) findViewById(R.id.Name2nd);
      varage.setText("22");




    }
}