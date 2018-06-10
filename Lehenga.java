package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lehenga extends AppCompatActivity {
    private Button home, profile,favourite,cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehenga);
    }
    public void toHome(View view) {
        home=(Button) findViewById(R.id.LehengaHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lehenga.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile=(Button) findViewById(R.id.LehengaProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lehenga.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite=(Button) findViewById(R.id.LehengaFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lehenga.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart=(Button) findViewById(R.id.LehengaCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lehenga.this,Cart.class);
                startActivity(intent);
            }
        });
    }
}
