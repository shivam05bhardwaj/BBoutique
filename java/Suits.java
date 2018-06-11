package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Suits extends AppCompatActivity {
    private Button home,profile,cart,favourite;
    private ImageButton firsSuit;
    private Clothes cloth, cloth1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suits);
        cloth= new Clothes("Classic White ",1500,"White","Suit",true,"Indian Handmade");
        cloth1= new Clothes("Orange Patiala",1500,"Orange","Suit",true,"Indian Handmade");

    }

    public void toHome(View view) {
        home=(Button) findViewById(R.id.SuitHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Suits.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile=(Button) findViewById(R.id.SuitProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Suits.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite=(Button) findViewById(R.id.SuitFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Suits.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart=(Button) findViewById(R.id.SuitCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Suits.this,Cart.class);
                startActivity(intent);
            }
        });
    }

    public void toFirstSuit(View view) {
        firsSuit =(ImageButton) findViewById(R.id.firstSuit);
        firsSuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.suit1;

                Intent intent = new Intent (Suits.this,Product.class);
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
    public void toSecondSuit(View view) {
        firsSuit =(ImageButton) findViewById(R.id.secondSuit);
        firsSuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.suit2;

                Intent intent = new Intent (Suits.this,Product.class);
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
