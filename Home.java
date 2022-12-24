package com.example.sankalpgrouptution;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    button = (ImageButton) findViewById(R.id.btninfo);
    button.setOnClickListener(new  View.OnClickListener(){
        @Override
        public void onClick(View view){
            openhome();
            }
        });
    }
    public void openhome(){
        Intent intent = new Intent(this, About_us.class);
        startActivity(intent);
    }
}