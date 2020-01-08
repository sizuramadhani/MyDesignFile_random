package com.sizura.mydesignfile_random;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_images = {
//            R.drawable.page_1,
//            R.drawable.page_2
    };

    public SliderAdapter(BoardingScreen boardingScreen) {
    }


    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (LinearLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

//        View view = layoutInflater.inflate(R.layout.image_slide,container,false);
//
//        ImageView slideImage = view.findViewById(R.id.img_screen1);

//        slideImage.setImageResource(slide_images[position]);
//
//        container.addView(view);
//
//        return view;
//    }

//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        container.removeView((RelativeLayout)object);
        return null;
    }
}
