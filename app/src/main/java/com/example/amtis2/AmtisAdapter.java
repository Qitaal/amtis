package com.example.amtis2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AmtisAdapter extends RecyclerView.Adapter<AmtisAdapter.CardViewViewHolder> {
    private ArrayList<Amtis> listAmtis;
    private Context context;

    public AmtisAdapter(ArrayList<Amtis> listAmtis, Context context) {
        this.listAmtis = listAmtis;
        this.context = context;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView amtisName, amtisAddress, amtisDate, amtisDestination;
        RecyclerView recyclerView;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView =  itemView.findViewById(R.id.rv_amtis);
            amtisName = itemView.findViewById(R.id.tv_amtis_name);
            amtisAddress = itemView.findViewById(R.id.tv_amtis_adddress);
            amtisDate = itemView.findViewById(R.id.tv_amtis_date);
            amtisDestination = itemView.findViewById(R.id.tv_amtis_destination);
        }
    }

    @NonNull
    @Override
    public AmtisAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_amtis, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AmtisAdapter.CardViewViewHolder holder, int position) {
        Amtis amtis = listAmtis.get(position);
        holder.amtisName.setText(amtis.getName());
        holder.amtisAddress.setText(amtis.getAddress());
        holder.amtisDate.setText(amtis.getDate());
        holder.amtisDestination.setText(amtis.getDestination());
    }

    @Override
    public int getItemCount() {
        return listAmtis.size();
    }
}
