package com.example.amtis2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class OperationalList extends AppCompatActivity {
    private ArrayList<Operational> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operational_list);

        list.addAll(OperationalData.getListData());

        RecyclerView rvOperational = findViewById(R.id.rv_operational);
        OperationalAdapter operationalAdapter = new OperationalAdapter(list);

        rvOperational.setHasFixedSize(true);
        rvOperational.setAdapter(operationalAdapter);
        rvOperational.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
