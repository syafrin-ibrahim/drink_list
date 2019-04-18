package com.syafrin.drinklist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;



public class CardDrinksAdapter extends RecyclerView.Adapter<CardDrinksAdapter.CardViewViewHolder> {
    private Context context;
    private ArrayList<Drinks> listDrink;

    public ArrayList<Drinks> getListDrink() {
        return listDrink;
    }

    public void setListDrink(ArrayList<Drinks> listDrink) {
        this.listDrink = listDrink;
    }

    public CardDrinksAdapter(Context ctx) {
        this.context = ctx;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_drink, viewGroup, false);
        return new CardViewViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder card, int i) {
        Drinks drk =getListDrink().get(i);
        card.t_kateg.setText(drk.getKategori());
        card.t_nama.setText(drk.getNama());
        card.photo.setImageResource(Integer.valueOf(drk.getPhoto()));
        card.btn_beli.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemCLickCallBack() {
            @Override
            public void onItemClicked(View v, int position) {
                Toast.makeText(context, "Buy " + getListDrink().get(position).getNama(), Toast.LENGTH_LONG).show();
            }
        }));

        card.btn_suka.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemCLickCallBack() {
            @Override
            public void onItemClicked(View v, int position) {
                Toast.makeText(context, "Like " + getListDrink().get(position).getNama(), Toast.LENGTH_LONG).show();
            }
        }));
        card.photo.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemCLickCallBack() {
            @Override
            public void onItemClicked(View v, int position) {
                Intent x = new Intent(context, DetailDrinkActivity.class);
                x.putExtra(DetailDrinkActivity.extra_name, getListDrink().get(position).getNama());
                x.putExtra(DetailDrinkActivity.extra_category, getListDrink().get(position).getKategori());
                x.putExtra(DetailDrinkActivity.extra_photo, getListDrink().get(position).getPhoto());
                x.putExtra(DetailDrinkActivity.extra_glass, getListDrink().get(position).getGlass());
                x.putExtra(DetailDrinkActivity.extra_price, getListDrink().get(position).getHarga());
                x.putExtra(DetailDrinkActivity.extra_method, getListDrink().get(position).getMetode());
                x.putExtra(DetailDrinkActivity.extra_description, getListDrink().get(position).getDeskripsi());
                context.startActivity(x);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListDrink().size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder{
        Button btn_suka, btn_beli;
        TextView t_kateg, t_nama;
        ImageView photo;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            photo = itemView.findViewById(R.id.img_drinks);
            t_kateg = itemView.findViewById(R.id.txt_category);
            t_nama =  itemView.findViewById(R.id.txt_name);
            btn_suka = itemView.findViewById(R.id.btn_like);
            btn_beli = itemView.findViewById(R.id.btn_buy);

        }
    }
}
