# Ex.No:4 To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## AIM:

To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## EQUIPMENTS REQUIRED:

Latest Version Android Studio

## ALGORITHM:

1. Start a new project in Android Studio.

2. Design a simple layout(.xml File) with two buttons as EXPLICIT.

3. By clicking Explicit Intent button open second page using Explicit Intents in MainActivity file.

## PROGRAM:
```
/*
Program to print the text “ExplicitIntent”.
Developed by: Smriti M
Registeration Number : 212221040157
*/

XML CODE:

FIRST ACTIVITY:

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/numberEditText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:inputType="number"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/calculateButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="16dp"
        android:onClick="calculateFactorial"
        android:text="Calculate Factorial"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/numberEditText" />

</androidx.constraintlayout.widget.ConstraintLayout>

SECOND ACTIVITY:

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    tools:context=".SecondActivity">

    <TextView
        android:id="@+id/factorialTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:textStyle="bold"
        android:padding="16dp"
        android:textColor="@android:color/black"
        android:text="Factorial will be calculated here"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        />

</androidx.constraintlayout.widget.ConstraintLayout>

JAVA CODE:

FIRST ACTIVITY:
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


SECOND ACTIVITY:

package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);

        TextView factorialTextView = findViewById(R.id.factorialTextView);
        factorialTextView.setText("Factorial of " + number + " is " + factorial(number));
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

```

## OUTPUT

FIRST ACTIVITY


<img width="248" alt="e2" src="https://github.com/SmritiManikand/ExplicitIntent-MAD/assets/113674204/b57d88f5-242d-49cd-89a7-b32018abd458">


SECOND ACTIVITY


<img width="250" alt="e3" src="https://github.com/SmritiManikand/ExplicitIntent-MAD/assets/113674204/23431b01-442c-472f-b75c-17fe7fa400a0">


## RESULT

Thus a Simple Android Application create a Explicit Intents using Android Studio is developed and executed successfully.


