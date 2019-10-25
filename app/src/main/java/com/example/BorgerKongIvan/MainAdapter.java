package com.example.BorgerKongIvan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    private List<Food> list;


    public MainAdapter(List<Food> dates){
        this. list = dates;

    }





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).image.setImageResource(list.get(position).getImg());
        ((ViewHolder) holder).name.setText(list.get(position).getName());
        ((ViewHolder) holder).price.setText(list.get(position).getPrice()+"");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mItemClickListener!=null){
                    mItemClickListener.onItemClick(position);
                }
            }
        });
    }
    public void setItemClickListener(OnItemClickListener itemClickListener) {
        mItemClickListener = itemClickListener;
    }
    private OnItemClickListener mItemClickListener;
    @Override
    public int getItemCount() {

        return list.size();
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }



    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView name,price;

        public ViewHolder(View view){
            super(view);
            image = view.findViewById(R.id.image);
            name = view.findViewById(R.id.name);
            price = view.findViewById(R.id.price);


        }
    }

}
