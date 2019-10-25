package com.example.BorgerKongIvan;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;




public class FoodDetailActivity extends AppCompatActivity  {
    private Food food;
    private TextView name,price,num,des;
    private ImageView img;
    private int orderNum =1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        food = (Food) getIntent().getSerializableExtra("food");
        name = findViewById(R.id.name);
        des = findViewById(R.id.des);
        price = findViewById(R.id.price);
        img = findViewById(R.id.image);
        num = findViewById(R.id.num);
        name.setText(food.getName());
        des.setText(food.getNote());
        price.setText(food.getPrice()+"");
        img.setImageResource(food.getImg());
    }



    public void subNum(View view) {
        if (orderNum-1>=1){
                orderNum--;
            num.setText((orderNum)+"");
        }
    }

    public void increaseNum(View view) {
        orderNum++;
        num.setText((orderNum)+"");
    }

    public void buyFood(View view) {
        MyOrder.addFood(food,orderNum);
        Toast.makeText(this,"Added successfully",Toast.LENGTH_SHORT).show();
    }
}
