package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listviewexample.adapter.MyCustomAdapter;
import com.example.listviewexample.model.Bikemodel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Bikemodel> bikemodelArrayList;
    private static MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        bikemodelArrayList = new ArrayList<>();


        bikemodelArrayList.add(new Bikemodel("a", "150000", R.drawable.a));
        bikemodelArrayList.add(new Bikemodel("b", "150000", R.drawable.b));
        bikemodelArrayList.add(new Bikemodel("c", "150000", R.drawable.c));
        bikemodelArrayList.add(new Bikemodel("d", "150000", R.drawable.d));
        bikemodelArrayList.add(new Bikemodel("e", "150000", R.drawable.e));
        bikemodelArrayList.add(new Bikemodel("f", "150000", R.drawable.f));
        bikemodelArrayList.add(new Bikemodel("g", "150000", R.drawable.g));
        bikemodelArrayList.add(new Bikemodel("h", "150000", R.drawable.h));
        bikemodelArrayList.add(new Bikemodel("i", "150000", R.drawable.i));

        // Create an instance of MyCustomAdapter
        adapter = new MyCustomAdapter(this, bikemodelArrayList);


        listView.setAdapter(adapter);
    }
}