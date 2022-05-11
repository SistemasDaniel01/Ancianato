package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class historiaClinica extends AppCompatActivity {

    List<ListElement> elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_clinica);

        init();


    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#770077","Oscar Rodriguez","Bogota","Vivo"));
        elements.add(new ListElement("#885543","Antonia Florez","Ibague","Vivo"));
        elements.add(new ListElement("#124388","Juan Principado","Bogota","Vivo"));
        elements.add(new ListElement("#008755","Lola Jazmin","Bogota","Vivo"));
        elements.add(new ListElement("#445566","Kike Urtado","Ibague","Vivo"));

        ListAdapter listAdapter = new ListAdapter(elements,this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}