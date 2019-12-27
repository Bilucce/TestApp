package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;
    private Work work;

    //这是我加的这些代码 我就是来测试的
    private User user1;
    private Work work2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.setName("bruce");
        user.setPhoneNumber("18937210725");
        user.setAvatar("http://img3.imgtn.bdimg.com/it/u=1485208754,3121192343&fm=26&gp=0.jpg");
        dataBinding.setUser(user);
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                user.setName("bzl");
                user.setPhoneNumber("17796760437");
                user.setAvatar("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3887737891,2623429027&fm=26&gp=0.jpg");
            }
        }, 5000);

        work = new Work();
        work.getWorkName().set("Coder");
        work.getWorkDesc().set("This is a work of computer");
        dataBinding.setWork(work);
        work.getWorkAvatar().set("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3887737891,2623429027&fm=26&gp=0.jpg");
        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                work.getWorkName().set("Teacher");
                work.getWorkDesc().set("A person whose job is teaching,especially in a school");
                work.getWorkAvatar().set("http://img3.imgtn.bdimg.com/it/u=1485208754,3121192343&fm=26&gp=0.jpg");
            }
        }, 8000);

        findViewById(R.id.btn_go).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListViewActivity.class));
            }
        });
    }
}
