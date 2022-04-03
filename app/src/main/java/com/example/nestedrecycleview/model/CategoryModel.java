package com.example.nestedrecycleview.model;

import java.util.ArrayList;

public class CategoryModel {

    String categoryTitle;
    ArrayList<String> sub_category =new ArrayList<>();

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public ArrayList<String> getSub_category() {
        return sub_category;
    }

    public void setSub_category(ArrayList<String> sub_category) {
        this.sub_category = sub_category;
    }

    public CategoryModel(String categoryTitle, ArrayList<String> sub_category) {
        this.categoryTitle = categoryTitle;
        this.sub_category = sub_category;
    }
}
