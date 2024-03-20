package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateFactorial(View view) {
        EditText numberEditText = findViewById(R.id.numberEditText);
        int number = Integer.parseInt(numberEditText.getText().toString());

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("number", number);
        startActivity(intent);
    }
}
