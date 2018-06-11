package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Lehenga extends AppCompatActivity {
    private Button home, profile,favourite,cart;
    private ImageButton firsLehenga,secLehenga;
    private Clothes cloth,cloth1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lehenga);
        cloth= new Clothes("Pink Lehenga",5000,"Pink","Lehenga",true,"Indian Handmade");
        cloth1= new Clothes("Bridal Red Lehenga",8000,"Red","Lehenga",true,"Indian Handmade");

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
    public void toFirstLehenga(View view) {
        firsLehenga =(ImageButton) findViewById(R.id.firstLehenga);
        firsLehenga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.lehenga1;

                Intent intent = new Intent (Lehenga.this,Product.class);
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

    public void toSecondLehenga(View view) {
        secLehenga =(ImageButton) findViewById(R.id.secondLehenga);
        secLehenga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.lehenga2;

                Intent intent = new Intent (Lehenga.this,Product.class);
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
