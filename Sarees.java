package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Sarees extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarees);
        ArrayAdapter<com.example.shivam.blossomboutiquev1.Clothes> listAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, com.example.shivam.blossomboutiquev1.Clothes.clothes);
        listView = (ListView) findViewById(R.id.saree);
        listView.setAdapter(listAdapter);
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lv, View view, int position, long id) {
                Intent intent = new Intent(Sarees.this,Home.class );
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);

    }
}
