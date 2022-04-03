package com.example.nestedrecycleview.adapter;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.nestedrecycleview.activity.MainActivity;
import com.example.nestedrecycleview.R;
import com.example.nestedrecycleview.activity.MainActivity2;
import com.example.nestedrecycleview.model.CategoryModel;

import java.util.ArrayList;

public class Sub_CategoryAdapter extends RecyclerView.Adapter<Sub_CategoryAdapter.viewholder> {

    MainActivity mainActivity;
    LayoutInflater inflater;
    ArrayList<String> allCategoryList;

    public Sub_CategoryAdapter(MainActivity mainActivity, ArrayList<String> allCategoryList) {
        this.mainActivity=mainActivity;
        this.allCategoryList=allCategoryList;
        this.inflater=LayoutInflater.from(mainActivity);
    }

    @NonNull
    @Override
    public Sub_CategoryAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.item_sub_category,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Sub_CategoryAdapter.viewholder holder, int position) {
        Glide.with(mainActivity).load(allCategoryList.get(position)).into(holder.iv_image);
        holder.iv_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mainActivity, MainActivity2.class);
                intent.putExtra("imgurl",allCategoryList.get(position));
                mainActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return allCategoryList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        private final ImageView iv_image;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            iv_image=(ImageView)itemView.findViewById(R.id.iv_image);
        }
    }
}
