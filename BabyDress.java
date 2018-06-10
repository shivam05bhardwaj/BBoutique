package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BabyDress extends AppCompatActivity {
    private Button home,profile,cart,favourite;
    private ImageButton firsBaby,secBaby;
    private Clothes cloth,cloth1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baby_dress);
        cloth= new Clothes("Navy Style White",1000,"White & Blue","BabyDress",true,"Indian Handmade");
        cloth1= new Clothes("Classic White",1200,"White","BabyDress",true,"Indian Handmade");

    }
    public void toHome(View view) {
        home=(Button) findViewById(R.id.BabyDrHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BabyDress.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile=(Button) findViewById(R.id.BabyDrProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BabyDress.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite=(Button) findViewById(R.id.BabyDrFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BabyDress.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart=(Button) findViewById(R.id.BabyDrCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BabyDress.this,Cart.class);
                startActivity(intent);
            }
        });
    }
    public void toFirstBaby(View view) {
        firsBaby =(ImageButton) findViewById(R.id.firstBaby);
        firsBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.baby1;

                Intent intent = new Intent (BabyDress.this,Product.class);
                intent.putExtra(Product.ID,id);
                intent.putExtra(Product.NAME,cloth.getmName());
                intent.putExtra(Product.COLOR,cloth.getmColor());
                intent.putExtra(Product.PRICE,cloth.getmPrice());
                intent.putExtra(Product.STYLE,cloth.getmStyle());
                intent.putExtra(Product.INSTOCK,cloth.ismInStock());
                intent.putExtra(Product.DESCRIPTION,cloth.getmDescription());
                startActivity(intent);
            }
        });
    }

    public void toSecondBaby(View view) {
        secBaby =(ImageButton) findViewById(R.id.seconBaby);
        secBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.baby2;

                Intent intent = new Intent (BabyDress.this,Product.class);
                intent.putExtra(Product.ID,id);
                intent.putExtra(Product.NAME,cloth1.getmName());
                intent.putExtra(Product.COLOR,cloth1.getmColor());
                intent.putExtra(Product.PRICE,cloth1.getmPrice());
                intent.putExtra(Product.STYLE,cloth1.getmStyle());
                intent.putExtra(Product.INSTOCK,cloth1.ismInStock());
                intent.putExtra(Product.DESCRIPTION,cloth1.getmDescription());
                startActivity(intent);
            }
        });
    }
}
