package com.example.testapp;

import android.view.View;
import android.widget.Toast;

import androidx.databinding.ObservableField;

public class Student {

    private ObservableField<String> name = new ObservableField<>();
    private ObservableField<String> gender = new ObservableField<>();
    private ObservableField<String> avatar = new ObservableField<>();

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
    }

    public ObservableField<String> getGender() {
        return gender;
    }

    public void setGender(ObservableField<String> gender) {
        this.gender = gender;
    }

    public ObservableField<String> getAvatar() {
        return avatar;
    }

    public void setAvatar(ObservableField<String> avatar) {
        this.avatar = avatar;
    }

    public void click(View view){
        Toast.makeText(view.getContext(),getName().get(),Toast.LENGTH_LONG).show();
    }
}
