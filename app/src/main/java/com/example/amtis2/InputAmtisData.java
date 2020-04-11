package com.example.amtis2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InputAmtisData extends AppCompatActivity implements View.OnClickListener {
    public static final String DATABASE_NAME = "amtis";

    SQLiteDatabase database;
    EditText  etName, etAddress, etDate, etDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_amtis_data);

        findViewById(R.id.btn_add).setOnClickListener(this);

        database = openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);


        etName = findViewById(R.id.et_name);
        etAddress = findViewById(R.id.et_address);
        etDate = findViewById(R.id.et_date);
        etDestination = findViewById(R.id.et_destination);
    }

    @Override
    public void onClick(View v) {
        addAmtis();
    }
    private void addAmtis(){
        String name = etName.getText().toString().trim();
        String address = etAddress.getText().toString().trim();
        String date = etDate.getText().toString().trim();
        String destination = etDestination.getText().toString().trim();

        if(name.isEmpty()){
            etName.setError("Nama tidak boleh kosong");
            etName.requestFocus();
            return;
        }
        if(address.isEmpty()){
            etAddress.setError("Alamat tidak boleh kosong");
            etAddress.requestFocus();
            return;
        }
        if(date.isEmpty()){
            etDate.setError("Tanggal tidak boleh kosong");
            etDate.requestFocus();
            return;
        }
        if(destination.isEmpty()){
            etDestination.setError("Tujuan tidak boleh kosong");
            etDestination.requestFocus();
            return;
        }

        String sql = "INSERT INTO amtis (name, address, date, destination)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        database.execSQL(sql, new String[]{name, address, date, destination});
        startActivity(new Intent(this, AmtisList.class));
    }
}
