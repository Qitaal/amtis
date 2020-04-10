package com.example.amtis2;

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

public class OperationalAdapter extends RecyclerView.Adapter<OperationalAdapter.GridViewHolder> {
    private ArrayList<Operational> listOperational;

    public OperationalAdapter(ArrayList<Operational> listOperational) {
        this.listOperational = listOperational;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView operationalImage;
        TextView operationalName;
        TextView operationalNumber;
        TextView operationalRegion;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            operationalImage = itemView.findViewById(R.id.iv_operational);
            operationalName = itemView.findViewById(R.id.tv_operational_name);
            operationalNumber = itemView.findViewById(R.id.tv_operational_number);
            operationalRegion = itemView.findViewById(R.id.tv_operational_region);
        }
    }

    @NonNull
    @Override
    public OperationalAdapter.GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_operational, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OperationalAdapter.GridViewHolder holder, int position) {
        Operational operational = listOperational.get(position);
        Glide.with(holder.itemView.getContext())
                .load(operational.getImage())
                .apply(new RequestOptions().override(250, 250))
                .into(holder.operationalImage);
        holder.operationalName.setText(operational.getName());
        holder.operationalNumber.setText(operational.getNumber());
        holder.operationalRegion.setText(operational.getRegion());
    }

    @Override
    public int getItemCount() {
        return listOperational.size();
    }
}
