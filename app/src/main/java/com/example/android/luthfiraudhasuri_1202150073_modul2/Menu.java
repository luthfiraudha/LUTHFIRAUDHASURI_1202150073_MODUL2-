package com.example.android.luthfiraudhasuri_1202150073_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("CheeseBurger");
            foods.add("Crispy Fried Chicken");
            foods.add("French Fries");
            foods.add("Caffe Latte");
            foods.add("lemon Tea");
            foods.add("Pepperoni Pizza");
            foods.add("Spahetti Bolognaise");
            foods.add("Strawberry Milkshake");
            foods.add("Vanilla Milkshake");

            // mamanggil harga
            priceses.add(20000);
            priceses.add(18000);
            priceses.add(15000);
            priceses.add(12000);
            priceses.add(8000);
            priceses.add(40000);
            priceses.add(25000);
            priceses.add(10000);
            priceses.add(10000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.cheeseburger);
            photos.add(R.drawable.friedchicken);
            photos.add(R.drawable.kentanggoreng);
            photos.add(R.drawable.latte);
            photos.add(R.drawable.lemontea);
            photos.add(R.drawable.pizza);
            photos.add(R.drawable.spaghetti);
            photos.add(R.drawable.strawberry);
            photos.add(R.drawable.vanilla);
        }
    }
}
