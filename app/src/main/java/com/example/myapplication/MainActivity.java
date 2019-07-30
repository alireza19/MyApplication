package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // The Intent constructor takes two parameters:
        // A Context as its first parameter (this is used because the Activity class is a subclass of Context)
        // The Class of the app component to which the system should deliver the Intent
        // (in this case, the activity that should be started)
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
        // The putExtra() method adds the EditText's value to the intent.
        // An Intent can carry data types as key-value pairs called extras
        intent.putExtra(EXTRA_MESSAGE, message);
        // The startActivity() method starts an instance of the DisplayMessageActivity specified by the Intent.
        startActivity(intent);
    }
}
