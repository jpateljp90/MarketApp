package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.telephony.ims.ImsMmTelManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //1 - AdapterView
    RecyclerView recyclerView;
    List<Item> itemList;

   // 3 adapter
    MyAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AdapterView

        recyclerView= findViewById(R.id.recycler_View);

        itemList = new ArrayList<>();

        Item item1= new Item(R.drawable.fruit,"Fruits","Fresh Fruits from the garden");
        Item item2= new Item(R.drawable.vegitables,"Vegeables","Delicious and fresh  Veggies");
        Item item3= new Item(R.drawable.bread,"Bakery","Whole wheat bread/multigrain Bread");
        Item item4= new Item(R.drawable.beverage,"Beverage","Juice, Tea, Coffee and soda");
        Item item5= new Item(R.drawable.milk,"Milk","Milk,Shakes and Yogurt");
        Item item6= new Item(R.drawable.popcorn,"Snacks","Popcorn,Donat and Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);



        myAdapter =  new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter) ;





















    }
}