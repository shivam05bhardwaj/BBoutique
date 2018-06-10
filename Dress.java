package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Dress extends AppCompatActivity {
    private Button home,profile,cart,favourite;
    private ImageButton firsDress,secDress;
    private Clothes cloth, cloth1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dress);
        cloth= new Clothes("Ladies Gown",3131,"Blue","Dress",true,"Indian Handmade");
        cloth1= new Clothes("Elegant Maroon",2000,"Maroon","Dress",true,"Indian Handmade");

    }
    public void toHome(View view) {
        home=(Button) findViewById(R.id.DressHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dress.this,Home.class);
                startActivity(intent);

            }
        });
    }

    public void toProfile(View view) {
        profile=(Button) findViewById(R.id.DressProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dress.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite=(Button) findViewById(R.id.DressFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dress.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart=(Button) findViewById(R.id.DressCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dress.this,Cart.class);
                startActivity(intent);
            }
        });
    }

    public void toFirstDress(View view) {
        firsDress =(ImageButton) findViewById(R.id.firstDress);
        firsDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.dress1;

                Intent intent = new Intent (Dress.this,Product.class);
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

    public void toSecondDress(View view) {
        secDress =(ImageButton) findViewById(R.id.secondDress);
        secDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.dress2;

                Intent intent = new Intent (Dress.this,Product.class);
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
