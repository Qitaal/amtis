package com.example.amtis2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.EditText;

import java.util.ArrayList;

public class AmtisList extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<Amtis> list;
    private RecyclerView rvAmtis;
    private AmtisAdapter amtisAdapter;
    private SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtis_list);

        findViewById(R.id.btn_add).setOnClickListener(this);
        rvAmtis = findViewById(R.id.rv_amtis);
        list = new ArrayList<>();

        database = openOrCreateDatabase(InputAmtisData.DATABASE_NAME, MODE_PRIVATE, null);
        createTable();
        showList();
    }

    protected void createTable() {
        database = openOrCreateDatabase(InputAmtisData.DATABASE_NAME, MODE_PRIVATE, null);
        String sql = "CREATE TABLE IF NOT EXISTS amtis (\n" +
                " id INTEGER NOT NULL CONSTRAINT amtis_pk PRIMARY KEY AUTOINCREMENT, \n" +
                " name varchar(200) NOT NULL, \n" +
                " address varchar (200) NOT NULL, \n" +
                " date date NOT NULL, \n" +
                " destination varchar (200) NOT NULL \n" +
                ");";

        database.execSQL(sql);

    }

    private void showList() {
        @SuppressLint("Recycle") Cursor cursor = database.rawQuery("SELECT * FROM amtis", null);

        if (cursor.moveToFirst()) {
            do {
                list.add(new Amtis(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4)
                ));
            } while (cursor.moveToNext());
        }
        cursor.close();

        amtisAdapter = new AmtisAdapter(list, this);
        rvAmtis.setHasFixedSize(true);
        rvAmtis.setAdapter(amtisAdapter);
        rvAmtis.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, InputAmtisData.class));
    }
}
