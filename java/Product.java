package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Product extends AppCompatActivity {
    public static final String ID="id";
    public static final String NAME="name";
    public static final String PRICE="price";
    public static final String COLOR="color";
    public static final String STYLE="style";
    public static final String INSTOCK="inStock";
    public static final String DESCRIPTION="description";

    private TextView TVname,TVprice,TVcolor,TVdesc, TVstyle;
    private ImageView IVProduct;
    private int id;
    private String name;
    private int price;
    private String color;
    private String style;
    private String description;
    private boolean inStock;

    private Button addToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Intent intent = getIntent();
        id=intent.getIntExtra(ID,0);
        name= intent.getStringExtra(NAME);
        price=intent.getIntExtra(PRICE,0);
        color=intent.getStringExtra(COLOR);
        style=intent.getStringExtra(STYLE);
        description=intent.getStringExtra(DESCRIPTION);
        intent.getBooleanExtra(INSTOCK,inStock);

        //Text View
        IVProduct=(ImageView) findViewById(R.id.PRimage);
        IVProduct.setImageResource(id);

        TVname=(TextView) findViewById(R.id.PRname);
        TVname.setText(name);

        TVprice=(TextView)findViewById(R.id.PRprice);
        TVprice.setText("Rs."+price);

        TVcolor=(TextView) findViewById(R.id.PRcolor);
        TVcolor.setText(color);


        TVdesc=(TextView) findViewById(R.id.PRdesc);
        TVdesc.setText(description);
    }

    public void AddToCart(View view) {
        addToCart=(Button)findViewById(R.id.AddToCart);
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Product.this,Cart.class);
                intent.putExtra(NAME,name);
                intent.putExtra(PRICE,price);
                startActivity(intent);
            }
        });

    }
}
