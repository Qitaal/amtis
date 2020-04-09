package com.example.amtis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_hospital).setOnClickListener(this);
        findViewById(R.id.btn_operational).setOnClickListener(this);
        findViewById(R.id.btn_amtis).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_hospital :{
                startActivity(new Intent(MainActivity.this, HospitalList.class));
                break;
            }
            case R.id.btn_operational :{
                Toast.makeText(MainActivity.this, "Operational", Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.btn_amtis :{
                Toast.makeText(MainActivity.this, "Amtis", Toast.LENGTH_SHORT).show();
                break;
            }
        }
    }
}
