package com.example.testapp;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;


public class User extends BaseObservable {

    private String name;
    private String phoneNumber;
    private String avatar;


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        notifyPropertyChanged(BR.phoneNumber);
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        notifyPropertyChanged(BR.avatar);
    }

    @BindingAdapter("bind:img")
    public static void setAvatar(ImageView imageView, String avatar) {
        Glide.with(imageView.getContext()).load(avatar).into(imageView);
        Log.i("bzl", "avatar>>>" + avatar);
    }
}
