package com.example.amtis2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HospitalList extends AppCompatActivity {
    private RecyclerView rvHospital;
    private ArrayList<Hospital> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);

        rvHospital = findViewById(R.id.rv_hospital);
        rvHospital.setLayoutManager(new LinearLayoutManager(this));
        HospitalAdapter hospitalAdapter = new HospitalAdapter(list, this);
        rvHospital.setAdapter(hospitalAdapter);
    }
}
