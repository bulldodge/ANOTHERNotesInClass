package com.example.notesinclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fabAdd = findViewById(R.id.fab);

        setUpRecyclerView();
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 System.out.println("The button works.");
            }
        });
    }



    private void setUpRecyclerView()
    {
        RecyclerView rv = findViewById(R.id.recycler_view);

        //NoteAdapter adapter = new NoteAdapter(getSupportFragmentManager(), Database.getData());
        //this sends a context to the Note Adapter
        NoteAdapter adapter = new NoteAdapter(this, notes); // for some reason notes stopped working
        rv.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        rv.setLayoutManager(layoutManager);

    }

}