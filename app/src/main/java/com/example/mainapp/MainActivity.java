package com.example.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mainapp.adapter.TopItemsAdapter;
import com.example.mainapp.model.Jewellery;
import com.example.mainapp.model.JewelleryProvider;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView topItemsRecycler;

    class ViewHolder {
        private final CardView cvRings, cvEarrings, cvNecklaces, cvBracelets;

        //Hooks
        public ViewHolder() {
            cvRings = findViewById(R.id.ring_category);
            cvEarrings = findViewById(R.id.earring_category);
            cvNecklaces = findViewById(R.id.necklace_category);
            cvBracelets = findViewById(R.id.bracelet_category);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Search Activity
        RelativeLayout searchView = (RelativeLayout) findViewById(R.id.search_View_rel);
        searchView.setOnClickListener(v -> {
            InputMethodManager im = ((InputMethodManager) getSystemService(INPUT_METHOD_SERVICE));
            im.showSoftInput(searchView, 0);
            Intent intent = new Intent(getBaseContext(), Searchable.class);
            startActivity(intent);

        });

        //Top Items Recycler View
        topItemsRecycler = findViewById(R.id.top_items_recycler);
        topItemsRecycler();

        //On Click events for the card to open List Activity
        ViewHolder vh = new ViewHolder();
        vh.cvRings.setOnClickListener(v -> {
            Intent rings = new Intent(getBaseContext(), ListActivity.class);
            rings.putExtra("Category", "Rings");
            startActivity(rings);
        });
        vh.cvEarrings.setOnClickListener(v -> {
            Intent earrings = new Intent(getBaseContext(), ListActivity.class);
            earrings.putExtra("Category", "Earrings");
            startActivity(earrings);
        });
        vh.cvBracelets.setOnClickListener(v -> {
            Intent bracelets = new Intent(getBaseContext(), ListActivity.class);
            bracelets.putExtra("Category", "Bracelets");
            startActivity(bracelets);
        });
        vh.cvNecklaces.setOnClickListener(v -> {
            Intent necklaces = new Intent(getBaseContext(), ListActivity.class);
            necklaces.putExtra("Category", "Necklaces");
            startActivity(necklaces);
        });

    }

    private void topItemsRecycler() {
        topItemsRecycler.setHasFixedSize(true); //Loads the views that are visible to the user
        topItemsRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<Jewellery> topItems = JewelleryProvider.generateTopData();
        RecyclerView.Adapter adapter = new TopItemsAdapter(topItems);
        topItemsRecycler.setAdapter(adapter);
    }


}