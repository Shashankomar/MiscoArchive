
package com.example.android.architecture.blueprints.todoapp.discoversearch;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HashtagSearchModel implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("views")
    @Expose
    private Integer views;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

}
