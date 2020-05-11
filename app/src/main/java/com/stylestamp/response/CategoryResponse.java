package com.stylestamp.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.stylestamp.model.Category;

import java.util.List;

public class CategoryResponse {
    @SerializedName("categories")
    @Expose
    public List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
