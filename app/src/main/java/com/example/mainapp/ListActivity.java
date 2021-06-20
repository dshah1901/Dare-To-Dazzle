package com.example.mainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mainapp.adapter.ListActivityAdapter;
import com.example.mainapp.model.Jewellery;
import com.example.mainapp.model.JewelleryProvider;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    private ListView lvJewellery;
    private ListActivityAdapter listActivityAdapter;
    private ArrayList<Jewellery> aJewellery;
    private TextView tvCategory;
    private ImageView ivBackBtn;

    public static final String JEWELLERY_DETAIL_KEY = "jewellery";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lvJewellery = findViewById(R.id.category_list_view);

        //Sets the title of the category to the category name from Main Activity
        Intent thisIntent = getIntent();
        String category = thisIntent.getStringExtra("Category");
        tvCategory = findViewById(R.id.category_name);
        tvCategory.setText(category);

        //Back button functionality
        ivBackBtn = findViewById(R.id.back_pressed);
        ivBackBtn.setOnClickListener(v -> ListActivity.super.onBackPressed());

        //Generates different list data based on category message from the Main Activity
        switch (category) {
            case "Rings":
                aJewellery = JewelleryProvider.generateRingsData();
                break;
            case "Necklaces":
                aJewellery = JewelleryProvider.generateNecklaceData();
                break;
            case "Earrings":
                aJewellery = JewelleryProvider.generateEarringData();
                break;
            case "Bracelets":
                aJewellery = JewelleryProvider.generateBraceletData();
                break;
        }

        listActivityAdapter = new ListActivityAdapter(this, aJewellery);
        lvJewellery.setAdapter(listActivityAdapter);
        setupJewellerySelectedListener();
    }

    public void setupJewellerySelectedListener() {
        lvJewellery.setOnItemClickListener((parent, view, position, id) -> {

            //Launch the detail view passing jewellery item as an extra
            Intent intent = new Intent(ListActivity.this, DetailsActivity.class);
            intent.putExtra(JEWELLERY_DETAIL_KEY, listActivityAdapter.getItem(position));
            startActivity(intent);
        });
    }
}