package com.example.amtis2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class HospitalAdapter extends RecyclerView.Adapter<HospitalAdapter.CardViewViewHolder> {
    private ArrayList<Hospital> listHospital;
    private Context context;

    public HospitalAdapter(ArrayList<Hospital> listHospital, Context context) {
        this.listHospital = listHospital;
        this.context = context;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView hospitalImage;
        TextView hospitalName, hospitalAddress;
        RecyclerView recyclerView;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.rv_hospital);
            hospitalImage = itemView.findViewById(R.id.iv_hospital);
            hospitalName = itemView.findViewById(R.id.tv_hospital_name);
            hospitalAddress = itemView.findViewById(R.id.tv_hospital_address);
        }
    }

    @NonNull
    @Override
    public HospitalAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_hospital, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalAdapter.CardViewViewHolder holder, int position) {
        Hospital hospital = listHospital.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hospital.getImage())
                .apply(new RequestOptions().override(350, 180))
                .into(holder.hospitalImage);
        holder.hospitalName.setText(hospital.getName());
        holder.hospitalAddress.setText(hospital.getAddress());
    }

    @Override
    public int getItemCount() {
        return listHospital.size();
    }
}
