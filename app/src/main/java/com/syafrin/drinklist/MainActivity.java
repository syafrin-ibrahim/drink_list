package com.syafrin.drinklist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDrinks;
    private ArrayList<Drinks> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvDrinks = findViewById(R.id.rv_drink);
        rvDrinks.setHasFixedSize(true);
        data = new ArrayList<>();
        data.addAll(Dataset_Drinks.getDrinks());
        showRecyclerCard();
        setUpToolbar();
    }

    private void setUpToolbar(){
        Toolbar bar = findViewById(R.id.toolbar);
        setSupportActionBar(bar);
        getSupportActionBar().setTitle("Drink List");


    }

    private void showRecyclerCard() {
            rvDrinks.setLayoutManager(new LinearLayoutManager(this));
            CardDrinksAdapter card = new CardDrinksAdapter(this);
            card.setListDrink(data);
            rvDrinks.setAdapter(card);


    }


}
