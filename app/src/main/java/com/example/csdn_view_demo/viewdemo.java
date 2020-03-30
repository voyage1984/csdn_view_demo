package com.example.csdn_view_demo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewdemo extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdemo);
        Button register = (Button)findViewById(R.id.button);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if (view.getId()==R.id.button){
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
        }
    }
}
