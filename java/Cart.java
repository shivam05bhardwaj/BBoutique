package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cart extends AppCompatActivity {
    private Button home,profile,cart,favourite;
//    public static final String PRICE="price";
//    public static final String NAME="name";
//
//    private TextView mName,mPrice;
//    private String getName;
//    private int getPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

//        Intent intent= getIntent();
//        getName=intent.getStringExtra(NAME);
//        getPrice= intent.getIntExtra(PRICE,0);
//
//        mName=(TextView)findViewById(R.id.)
    }

    public void toHome(View view) {
        home=(Button) findViewById(R.id.CartHome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this, Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile= (Button)findViewById(R.id.CartProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this,Profile.class);
                startActivity(intent);
            }
        });
    }

    public void toFav(View view) {
        favourite= (Button)findViewById(R.id.CartFav);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this,Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void toCart(View view) {
        cart= (Button) findViewById(R.id.CAcart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cart.this, Cart.class);
                startActivity(intent);
            }
        });
    }
}
