package com.example.BorgerKongIvan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainAdapter.OnItemClickListener {
    List<Food> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();


        list.add(new Food(1,"fried chicken", R.drawable.friedchicken, "Succulent Chicken Freshly Cooked For Everyone. It's Finger Lickin' Good. Finger Lickin' Good. ", 3.50));
        list.add(new Food(2,"burger", R.drawable.burger, "It starts with two 100% Aussie beef patties. Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun. ", 6.00));
        list.add(new Food(3,"double cheeseburger", R.drawable.doublecheeseburger, "You really will be seeing double. Two 100%  Aussie beef patties, melted cheese, tangy pickles, mustard and sweet ketchup. Delicious. ", 6.50));
        list.add(new Food(4,"fish burger", R.drawable.fishburger, "Dive in and enjoy our Filet-o-Fish. Sourced for its succulent and fresh flavour, we cook tender portions of fish and enhance their great taste with zesty tartar sauce and cheese. ", 5.50));
        list.add(new Food(5,"BBQ chicken burger", R.drawable.bbqchicken, "Enjoy fish from some of the world’s cleanest waters & 100% Australian chicken breast for a juicier, more succulent flavour.  ", 6.50));
        list.add(new Food(6,"onion rings", R.drawable.oninonrings, "The best onion rings in the Sydney! Buy 2 get 1 free!", 5.50));
        list.add(new Food(7,"chicken meatball", R.drawable.chickenmeatball, "Deliciously simple Oven Baked Thai Chicken Meatballs served in lettuce leaves with a sweet chilli dipping sauce", 5.00));
        list.add(new Food(8,"chicken nuggets", R.drawable.chickennuggets, "Everything's better when it's bite-sized. Like our nuggets made with tender juicy 100% Aussie Chicken McNuggets in a crisp tempura coating, with no artificial colours, flavours or preservatives!", 10.00));
        list.add(new Food(9,"fish and chips", R.drawable.fishandchips, "The result is a succulent, flaky flesh that holds up well in the deep-fryer. Opt for kumara chips (as our Kiwi cousins like to call them), and you’ll get deliciously sweet batons on the side", 11.00));
        list.add(new Food(10,"fries", R.drawable.fries, "Get them while they're hot. Our legendary, super-tasty French fries are the perfect side to any meal. We only use the highest quality potatoes to create those delicious strands of crispy fluffiness that you love, now fried in a superior and healthier blend including canola and sunflower oils.", 2.00));
        list.add(new Food(11,"hot dog", R.drawable.hotdog, " The hot dog is absolutely amazing & the tacos are good", 3.00));
        list.add(new Food(12,"pizza", R.drawable.pizza, "Eat the best Italian pizza in Sydney in our restaurant or order a pizza online through our useful takeaway service! ", 13.00));
        list.add(new Food(13,"baked chicken breast", R.drawable.bakedchickenbreast, "This baked chicken breast is a healthy and delicious option for your whole family.", 10.00));
        list.add(new Food(14,"hash brown", R.drawable.hashbrown, "Get 'em hot. A crunchy, golden brown crust with steaming, fluffy potato inside.", 1.50));
        list.add(new Food(15,"ice cream", R.drawable.icecream, "Our signature soft serve, layered on a crispy cone for one very cool price.", 0.99));
        list.add(new Food(16,"apple pie", R.drawable.pie, "Crisp pastry, lovingly filled with aussie apples for that extra sweet taste. Served piping hot.", 7.00));
        list.add(new Food(17,"water", R.drawable.water, "600ml water, Refreshing natural spring water, bottled so you can keep it for later.", 1.50));
        list.add(new Food(18,"orange juice", R.drawable.orangejuice, "Go for a classic with some cold O.J. Sweet, with a bit of that delicious tang.", 3.00));
        list.add(new Food(19,"apple juice", R.drawable.applejuice, "Get refreshed with a bottle of Pop Tops Apple Juice, pop and drink!", 3.00));
        list.add(new Food(20,"cappuccino", R.drawable.cappuccino, "All your favourites in one: espresso, full cream milk, a generous layer of froth and a sprinkle of chocolate powder.", 4.50));


        RecyclerView recyclerView = findViewById(R.id.RecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MainAdapter mainAdapter = new MainAdapter(list);
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.setItemClickListener(this);
    }

    public void viewOrder(View view) {
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, FoodDetailActivity.class);
        intent.putExtra("food",list.get(position));
        startActivity(intent);

    }
}
