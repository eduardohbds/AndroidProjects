package com.count.marketapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ItemViewHolder> {
    int listItemLayout;
    private final List<Item> items;
    public ItemArrayAdapter(List<Item> items,int listItemLayout){
        this.items = items;
        this.listItemLayout = listItemLayout;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = items.get(position);
        holder.imgMarketItem.setImageResource(item.getImgResource());
        holder.tvMarketDescription.setText(item.getDescription());
        holder.tvMarketName.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return items == null ? 0 : items.size();
    }


    public static class ItemViewHolder extends RecyclerView.ViewHolder{
        ImageView imgMarketItem;
        TextView tvMarketName;
        TextView tvMarketDescription;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMarketItem = itemView.findViewById(R.id.imgMarketItem);
            tvMarketName = itemView.findViewById(R.id.tvMarketName);
            tvMarketDescription = itemView.findViewById(R.id.tvMarketDescription);
        }
    }
}
