package com.example.android.myaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.android.myaplication.MESSAGE";

    private EditText txtFirstName = findViewById(R.id.txtFirstName);
    private EditText txtLastName = findViewById(R.id.txtLastName);
    private EditText txtEmail = findViewById(R.id.txtEmail);
    private EditText txtPassword = findViewById(R.id.txtPassword);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Accept Button to
    public void aceptAccion(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        String message = R.string.str_welcome + " " + txtFirstName.getText().toString() + " " + txtLastName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void cancelAccion(View view){
        txtFirstName.setText("");
        txtFirstName.setHint(R.string.str_first_name);

        txtLastName.setText("");
        txtLastName.setHint(R.string.str_last_name);

        txtEmail.setText("");
        txtEmail.setHint(R.string.str_email);

        txtPassword.setText("");
        txtPassword.setHint(R.string.str_password);
    }

}