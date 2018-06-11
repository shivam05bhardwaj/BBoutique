package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private ListView listView;
    private TextView name;
    public static final String  NAME2="username";
    private Button profile, home,cart,favourite;
    private CardView mSaree,mSuit,mTops,mBaby,mDress,mLehenga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // For the User name
        name= (TextView) findViewById(R.id.username);
        Intent intent = getIntent();
        String name1= intent.getStringExtra(NAME2);
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
        //listView= (ListView) findViewById(R.id.ClothesList);
        //listView.setOnItemClickListener(itemClickListener);
//

    }





    //Buttons in the tab bar

    public void toHome(View view) {
        home=(Button)findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Home.class);
                startActivity(intent);
            }
        });
    }

    public void toProfile(View view) {
        profile= (Button)findViewById(R.id.profileButton);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Profile.class);
                startActivity(intent);
            }
        });
    }
    public void toFav(View view) {
        favourite= (Button)findViewById(R.id.favButton);
        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Favourite.class);
                startActivity(intent);
            }
        });
    }
    public void toCart(View view) {
        cart= (Button) findViewById(R.id.cartButton);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Cart.class);
                startActivity(intent);
            }
        });
    }



    public void toSarees(View view) {
        mSaree =(CardView) findViewById(R.id.saree);
        mSaree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Sarees.class);
                startActivity(intent);
            }
        });
    }

    public void toSuits(View view) {
        mSuit =(CardView) findViewById(R.id.suits);
        mSuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Suits.class);
                startActivity(intent);
            }
        });
    }

    public void toTops(View view) {
        mTops =(CardView) findViewById(R.id.tops);
        mTops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Tops_Blouse.class);
                startActivity(intent);
            }
        });
    }

    public void toBaby(View view) {
        mBaby =(CardView) findViewById(R.id.baby);
        mBaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,BabyDress.class);
                startActivity(intent);
            }
        });
    }

    public void toDress(View view) {
        mDress =(CardView) findViewById(R.id.dress);
        mDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Dress.class);
                startActivity(intent);
            }
        });
    }

    public void toLehanga(View view) {
        mLehenga =(CardView) findViewById(R.id.lehenga);
        mLehenga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Lehenga.class);
                startActivity(intent);
            }
        });
    }
}
