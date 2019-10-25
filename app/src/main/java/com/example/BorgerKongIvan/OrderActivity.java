package com.example.BorgerKongIvan;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class OrderActivity extends AppCompatActivity  {
    List<Food> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        list = MyOrder.getFoods();


        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        TextView Total = findViewById(R.id.total);
        double total=0;
        for (int i = 0; i < list.size(); i++) {
            total +=list.get(i).getNum()*list.get(i).getPrice();
        }
        Total.setText("Total ：$"+total);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        OrderAdapter orderAdapter = new OrderAdapter(list);
        recyclerView.setAdapter(orderAdapter);
    }




}
