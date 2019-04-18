package com.syafrin.drinklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailDrinkActivity extends AppCompatActivity {
    public static final String extra_name="Drinks";
    public static final String extra_category="Kategori";
    public static final String extra_price="Harga";
    public static final String extra_method="Metode";
    public static final String extra_description="Deskripsi";
    public static final String extra_glass="Gelas";
    public static final String extra_photo="Photo";
    TextView Drink, Category,Price,Description,Method,Glass;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_drink);
        img = findViewById(R.id.image_drink);
        Drink=findViewById(R.id.item_name);
        Category =findViewById(R.id.item_category);
        Price = findViewById(R.id.v_harga);
        Description = findViewById(R.id.deksripi);
        Method = findViewById(R.id.v_metode);
        Glass = findViewById(R.id.v_glass);

        setUpToolbar();
        getDataFromIntent();
    }

    private void getDataFromIntent(){
        String i_glass = getIntent().getStringExtra(extra_glass);
        String i_description = getIntent().getStringExtra(extra_description);
        String i_price = getIntent().getStringExtra(extra_price);
        String i_method = getIntent().getStringExtra(extra_method);
        String i_photo = getIntent().getStringExtra(extra_photo);
        String i_drink = getIntent().getStringExtra(extra_name);
        String i_category = getIntent().getStringExtra(extra_category);
        Drink.setText(i_drink);
        Category.setText(i_category);
        img.setImageResource(Integer.valueOf(i_photo));
        Price.setText(i_price);
        Description.setText(i_description);
        Method.setText(i_method);
        Glass.setText(i_glass);
    }
    private void setUpToolbar(){
        Toolbar bar = findViewById(R.id.toolbar);
        setSupportActionBar(bar);
        getSupportActionBar().setTitle("Detail Drink");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
