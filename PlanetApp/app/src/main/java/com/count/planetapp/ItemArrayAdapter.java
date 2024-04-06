package com.count.planetapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ItemViewHolder> {
    private final List<Item> items;
    private int listItemLayout;
    public ItemArrayAdapter(List<Item> items,int listItemLayout){
        this.items = items;
        this.listItemLayout = listItemLayout;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout,
                parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.imgPLanet.setImageResource(item.getImageResourceId());
        holder.tvMoons.setText(String.valueOf(item.getMoons()));
        holder.tvPlanetName.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return items == null ? 0: items.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imgPLanet;
        private final TextView tvPlanetName;
        private final TextView tvMoons;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPLanet = itemView.findViewById(R.id.imgPLanet);
            tvPlanetName = itemView.findViewById(R.id.tvPlanetName);
            tvMoons = itemView.findViewById(R.id.tvMoons);
        }
    }
}
