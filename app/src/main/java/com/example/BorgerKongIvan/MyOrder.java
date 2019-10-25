package com.example.BorgerKongIvan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyOrder {
    private static Map<Integer, Food> map = new HashMap<>();

    public static void addFood(Food food, int orderNum) {
        Food data = map.get(food.getId());
        if (data!=null){
            data.setNum(data.getNum()+orderNum);
        }else{
            food.setNum(orderNum);
            map.put(food.getId(),food);
        }
    }

    public static ArrayList<Food> getFoods() {
        ArrayList<Food> foods = new ArrayList<>();
        for (Food food:
             map.values()) {
            foods.add(food);
        }
        return foods;
    }


}
