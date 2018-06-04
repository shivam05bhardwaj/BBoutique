package com.example.shivam.blossomboutiquev1;

public class Clothes {
    private String mName;
    private int mPrice;
    private String mColor;
    private String mStyle;
    private boolean mInStock;
    private String mDescription;

   public static final Clothes[] clothes={
     new Clothes("Chanderi Silk Saree1",123,"Orange","Saaree",true,"Hand Work Done"),
     new Clothes("Chanderi Silk Saree2",113,"Yellow","Saaree",true,"Hand Work Done"),
     new Clothes("Chanderi Silk Saree3",155,"Blue","Saree",true,"Hand Work Done")
   };

   public Clothes(String name, int Price, String color, String style, boolean inStock, String description){
       mName= name;
       mPrice=Price;
       mColor=color;
       mStyle=style;
       mInStock=inStock;
       mDescription=description;
   }

    public String getmName() {
        return mName;
    }

    public int getmPrice() {
        return mPrice;
    }

    public String getmColor() {
        return mColor;
    }

    public String getmStyle() {
        return mStyle;
    }

    public boolean ismInStock() {
        return mInStock;
    }

    public String getmDescription() {
        return mDescription;
    }
    public String toString()
    {

        return this.mName;
    }


}
