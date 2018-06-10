package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Profile extends AppCompatActivity {
    private Button home,profile,fav,cart,submit;
    private EditText nameET,addressET,contactET;
    public String name, address, contactNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }



    //Buttons
    public void profToHome(View view) {
        home=(Button)findViewById(R.id.Profhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Home.class);
                startActivity(intent);
            }
        });
    }

    public void profToProf(View view) {
        profile=(Button)findViewById(R.id.PrProf);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Profile.class);
                startActivity(intent);
            }
        });
    }

    public void profToFav(View view) {
        fav=(Button)findViewById(R.id.ProfFav);
        fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Favourite.class);
                startActivity(intent);
            }
        });
    }

    public void profToCart(View view) {
        cart=(Button)findViewById(R.id.ProfCart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, Cart.class);
                startActivity(intent);
            }
        });
    }


    public void DetailsStored(View view) {

        submit=(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast2= Toast.makeText(getApplicationContext(),"Your Details are registered",Toast.LENGTH_SHORT);
                toast2.show();
            }
        });
       nameET=(EditText) findViewById(R.id.ETFirstName);
       name=nameET.getText().toString();

       addressET=(EditText)findViewById(R.id.ETaddress);
       address= addressET.getText().toString();

       contactET=(EditText)findViewById(R.id.ETContact);
       contactNo=contactET.getText().toString();


    }
}
