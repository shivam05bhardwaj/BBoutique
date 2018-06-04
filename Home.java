package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private ListView listView;
    private TextView name;
    private String NAME2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // For the User name
        name= (TextView) findViewById(R.id.username);
        Intent intent = getIntent();
        String name1= intent.getStringExtra("Username");
        name.setText(name1);

        // For the ListView
        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(Home.this, Sarees.class);
                    startActivity(intent);
                }
            }
        };
        listView= (ListView) findViewById(R.id.ClothesList);
        listView.setOnItemClickListener(itemClickListener);


    }
}
