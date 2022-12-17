package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected void displayMessage(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        String sum1 = ((EditText) findViewById(R.id.EditText1)).getText().toString();
        String sum2 = ((EditText) findViewById(R.id.EditText2)).getText().toString();

        int result = Integer.parseInt(sum1) + Integer.parseInt(sum2);

        displayMessage(Integer.toString(result));
    }
}