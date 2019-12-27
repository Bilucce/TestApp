package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView listView;
    private List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.listview);
        for (int i = 0; i < 8; i++) {
            Student student = new Student();
            student.getName().set("Bruce" + i);
            student.getGender().set("Man");
            student.getAvatar().set("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3887737891,2623429027&fm=26&gp=0.jpg");
            students.add(student);
        }

        CommonAdapter<Student> adapter = new CommonAdapter<>(this,
                getLayoutInflater(),
                R.layout.item_for_student,
                BR.student,
                students);
        listView.setAdapter(adapter);
    }
}
