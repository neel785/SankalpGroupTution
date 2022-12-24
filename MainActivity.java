package com.example.sankalpgrouptution;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Student_name = (EditText) findViewById(R.id.edit_name);
        TextView Password = (EditText) findViewById(R.id.editTextPassword);
        Button Login = (Button) findViewById(R.id.button);
        Login.setOnClickListener(view -> {
            if (Student_name.getText().toString().isEmpty() && Password.getText().toString().isEmpty()){
                Toast.makeText(MainActivity.this,"Enter name or password to login",Toast.LENGTH_LONG).show();
            }else if (!Student_name.getText().toString().matches("[A-Za-z]+")){
                Toast.makeText(MainActivity.this,"Enter correct name",Toast.LENGTH_LONG).show();
            }else if (!Password.getText().toString().matches("[a-zA-Z0-9]{6,10}+")){
                Toast.makeText(MainActivity.this,"Enter correct password",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(MainActivity.this,"Login is successful",Toast.LENGTH_LONG).show();
                openhome();
            }
        });
        button = (ImageButton) findViewById(R.id.btncontect);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencontect();
            }
        });

    }
    public void openhome(){
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);
    }
    public void opencontect(){
        Intent intent = new Intent(MainActivity.this, Contact_us.class);
        startActivity(intent);
    }
}