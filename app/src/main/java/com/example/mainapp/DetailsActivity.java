package com.example.mainapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mainapp.adapter.ViewPagerAdapter;
import com.example.mainapp.model.Jewellery;

public class DetailsActivity extends AppCompatActivity {

    private ImageView ivCoverImage, backBtn;
    private TextView tvTitle, tvCost, tvDetail, tvViews;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Hooks
//        ivCoverImage = findViewById(R.id.item_main_image);
        tvTitle = findViewById(R.id.item_name);
        tvCost = findViewById(R.id.item_cost);
        tvDetail = findViewById(R.id.item_details);
        tvViews = findViewById(R.id.item_views);
        viewPager = findViewById(R.id.view_pager);

        //Use the jewellery to populate the data into our views
        Intent thisIntent = getIntent();
        Jewellery jewellery = (Jewellery)
                thisIntent.getSerializableExtra(ListActivity.JEWELLERY_DETAIL_KEY);
        loadJewellery(jewellery);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, jewellery.getImagesAdder());
        viewPager.setAdapter(viewPagerAdapter);

        //Back button functionality
        backBtn = findViewById(R.id.back_pressed);
        backBtn.setOnClickListener(v -> DetailsActivity.super.onBackPressed());
    }

    private void loadJewellery(Jewellery jewellery) {
        //Change Activity title
        this.setTitle(jewellery.getName());
        tvTitle.setText(jewellery.getName());
        tvCost.setText(jewellery.getCost());
        tvDetail.setText(jewellery.getDescription());
        jewellery.incrementClickNum();
        tvViews.setText("Views: "+ jewellery.getClickNum());

//        int resID = jewellery.getCoverAdder();
//        ivCoverImage.setImageResource(resID);
    }
}