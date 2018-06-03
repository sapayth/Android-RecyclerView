package com.sapayth.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView personRecyclerView;
    private RecyclerView.Adapter adapter;

    private List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personRecyclerView = findViewById(R.id.itemRecyclerView);
        personRecyclerView.setHasFixedSize(true);
        personRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        personList = new ArrayList<>();

        personList.add(new Person("John Doe", 99, R.mipmap.ic_launcher));
        personList.add(new Person("Jane Dane", 92, R.mipmap.ic_launcher_round));
        personList.add(new Person("Richard Roe", 86, R.mipmap.ic_launcher));
        personList.add(new Person("John Doe", 99, R.mipmap.ic_launcher));
        personList.add(new Person("Jane Dane", 92, R.mipmap.ic_launcher_round));
        personList.add(new Person("Richard Roe", 86, R.mipmap.ic_launcher));
        personList.add(new Person("John Doe", 99, R.mipmap.ic_launcher));
        personList.add(new Person("Jane Dane", 92, R.mipmap.ic_launcher_round));
        personList.add(new Person("Richard Roe", 86, R.mipmap.ic_launcher));

        adapter = new PersonAdapter(personList, this);
        personRecyclerView.setAdapter(adapter);
    }
}