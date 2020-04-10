package com.example.amtis2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HospitalList extends AppCompatActivity {
    private ArrayList<Hospital> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);

        list.addAll(HospitalData.getListData());

        RecyclerView rvHospital = findViewById(R.id.rv_hospital);
        HospitalAdapter hospitalAdapter = new HospitalAdapter(list, this);

        rvHospital.setHasFixedSize(true);
        rvHospital.setAdapter(hospitalAdapter);
        rvHospital.setLayoutManager(new LinearLayoutManager(this));
    }
}
