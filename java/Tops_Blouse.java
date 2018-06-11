package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tops_Blouse extends AppCompatActivity {
    private Button home,profile,cart,favourite;
    private ImageButton firsTop,secTop;
    private Clothes cloth, cloth1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tops__blouse);
        cloth= new Clothes("Golden Top",1000,"Golden","Tops",true,"Indian Handmade");
        cloth1= new Clothes("Orange Casual Top",1200,"Orange","Tops",true,"Indian Handmade");

    }

    // TabBar Buttons
    public void toHome(View view) {
        home=(Button) findViewById(R.id.TopsHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tops_Blouse.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile=(Button) findViewById(R.id.TopsProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tops_Blouse.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite=(Button) findViewById(R.id.TopsFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tops_Blouse.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart=(Button) findViewById(R.id.TopsCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tops_Blouse.this,Cart.class);
                startActivity(intent);
            }
        });
    }
    public void toFirstTop(View view) {
        firsTop =(ImageButton) findViewById(R.id.firstTop);
        firsTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.tops1;

                Intent intent = new Intent (Tops_Blouse.this,Product.class);
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

    public void toSecondTop(View view) {
        secTop =(ImageButton) findViewById(R.id.seconTop);
        secTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=R.drawable.tops2;

                Intent intent = new Intent (Tops_Blouse.this,Product.class);
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
