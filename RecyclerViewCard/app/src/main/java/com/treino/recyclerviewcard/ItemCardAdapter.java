package com.treino.recyclerviewcard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemCardAdapter extends RecyclerView.Adapter<ItemCardAdapter.ItemCardHolder> {
    private final List<ItemCardModel> itemCardsList;

    public ItemCardAdapter(List<ItemCardModel> itemCardsList){
        this.itemCardsList = itemCardsList;
    }

    @NonNull
    @Override
    public ItemCardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_view, parent, false);
        return new ItemCardHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCardHolder holder, int position) {
        ItemCardModel news = itemCardsList.get(position);
        holder.tvCardTitulo.setText(news.getTitle());
        holder.tvCardSubTitulo.setText(news.getDescription());
        holder.cardLayout.setBackgroundResource(news.getimageBackground());
    }

    @Override
    public int getItemCount() {
        return itemCardsList.size();
    }
    static class ItemCardHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCardTitulo,tvCardSubTitulo;
        ConstraintLayout cardLayout;
        ItemCardHolder(@NonNull View itemView){
            super(itemView);
            tvCardTitulo = itemView.findViewById(R.id.tvCardTitulo);
            tvCardSubTitulo = itemView.findViewById(R.id.tvCardSubTitulo);
            cardLayout = itemView.findViewById(R.id.cardLayout);

            tvCardTitulo.setOnClickListener(this);
            tvCardSubTitulo.setOnClickListener(this);
            cardLayout.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "Você clicou no item: " + tvCardTitulo.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
