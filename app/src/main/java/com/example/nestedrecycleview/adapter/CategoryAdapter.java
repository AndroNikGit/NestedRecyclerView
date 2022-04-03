package com.example.nestedrecycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecycleview.activity.MainActivity;
import com.example.nestedrecycleview.R;
import com.example.nestedrecycleview.model.CategoryModel;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewholder> {

    MainActivity mainActivity;
    LayoutInflater inflater;
    ArrayList<CategoryModel> allCategoryList;

    public CategoryAdapter(MainActivity mainActivity, ArrayList<CategoryModel> allCategoryList) {
        this.mainActivity=mainActivity;
        this.allCategoryList=allCategoryList;
        this.inflater=LayoutInflater.from(mainActivity);
    }

    @NonNull
    @Override
    public CategoryAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.item_category,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.viewholder holder, int position) {
        holder.tv_title.setText(allCategoryList.get(position).getCategoryTitle());
        setrecycleview(holder,allCategoryList.get(position).getSub_category());

    }

    private void setrecycleview(viewholder holder, ArrayList<String> sub_category) {
        LinearLayoutManager manager =new LinearLayoutManager(mainActivity,RecyclerView.HORIZONTAL,false);
        Sub_CategoryAdapter nestedItemAdapter=new Sub_CategoryAdapter(mainActivity,sub_category);
        holder.rv_item_recycler.setLayoutManager(manager);
        holder.rv_item_recycler.setAdapter(nestedItemAdapter);
    }

    @Override
    public int getItemCount() {
        return allCategoryList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        private final RecyclerView rv_item_recycler;
        private final TextView tv_title;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            rv_item_recycler=(RecyclerView)itemView.findViewById(R.id.rv_item_recycler);
            tv_title=(TextView)itemView.findViewById(R.id.tv_title);
        }
    }
}
