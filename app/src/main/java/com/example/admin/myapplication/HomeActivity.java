package com.example.admin.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ArrayList<Coffee> words = new ArrayList<Coffee>();
        words.add(new Coffee(R.drawable.latte, "Café Latte", R.drawable.icon));
        words.add(new Coffee(R.drawable.espresso, "Espresso", R.drawable.icon));
        words.add(new Coffee(R.drawable.cappucino, "Cappuccino", R.drawable.icon));
        words.add(new Coffee(R.drawable.images, "Long Black", R.drawable.icon));
        words.add(new Coffee(R.drawable.tea, "Macchiato", R.drawable.icon));


        CoffeeAdapter adapter = new CoffeeAdapter(this, words, R.color.colorAccent);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.activity_list);
        listView.setAdapter(adapter);


    }


    public void submitOrder(View view) {
        Intent i = new Intent(HomeActivity.this, Order.class);
        startActivity(i);

    }

}
