package com.example.helloworld.recycleview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListCategoryResponse {

@SerializedName("status")
@Expose
public Integer status;
@SerializedName("code")
@Expose
public Integer code;
@SerializedName("result")
@Expose
public CategoryResult result;
@SerializedName("message")
@Expose
public String message;

}