package com.example.shivam.bboutique;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;

public class Sarees extends AppCompatActivity {
    private Button home,profile,cart,favourite;
    private ImageButton firsSaree,secSaree;
    private Clothes cloth,cloth1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarees);
        Log.d("saree","In Sarees");
       cloth= new Clothes("Orange Silk Saree",2130,"Orange","Saree",true,"Indian Handmade");
        cloth1= new Clothes("Black Silk Saree",3100,"Black","Saree",true,"Indian Handmade");

    }

    public void toHome(View view) {
        home=(Button) findViewById(R.id.SareeHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sarees.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile=(Button) findViewById(R.id.SareeProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sarees.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite=(Button) findViewById(R.id.SareeFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sarees.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart=(Button) findViewById(R.id.SareeCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sarees.this,Cart.class);
                startActivity(intent);
            }
        });
    }

    public void toFirstSaree(View view) {
        firsSaree =(ImageButton) findViewById(R.id.firstSaree);
       firsSaree.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int id=R.drawable.saree1;

               Intent intent = new Intent (Sarees.this,Product.class);
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

    public void toSecondSaree(View view) {
        secSaree =(ImageButton) findViewById(R.id.secoSaree);
        secSaree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.saree2;

                Intent intent = new Intent (Sarees.this,Product.class);
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
