//package com.example.shivam.bboutique;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.GridLayout;
//import android.widget.GridView;
//import android.widget.ImageView;
//
//public class ImageAdapter extends BaseAdapter{
//    private Context mContext;
//
//    // Constructor
//    public ImageAdapter(Context c){
//      mContext=c;
//    }
//    @Override
//    public int getCount() {
//        return 0;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//        if(convertView==null){
//            imageView= new ImageView(mContext);
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
//           imageView.setPadding(8,8,8,8);
//        }
//        else{
//            imageView=(ImageView) convertView;
//        }
//        imageView.setImageResource(Sarees[position]);
//        return imageView;
//    }
//
//    public Integer[] Sarees ={
//      R.drawable.logo,
//      R.drawable.saree3,
//      R.drawable.saree2,
//      R.drawable.saree3
//    };
//}
