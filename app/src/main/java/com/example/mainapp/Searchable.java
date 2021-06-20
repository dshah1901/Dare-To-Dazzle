package com.example.mainapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mainapp.adapter.ListActivityAdapter;
import com.example.mainapp.model.Jewellery;
import com.example.mainapp.model.JewelleryProvider;

import java.util.ArrayList;

import static com.example.mainapp.ListActivity.JEWELLERY_DETAIL_KEY;

public class Searchable extends AppCompatActivity {

    SearchView searchView;
    ListView lvSearch;
    TextView tvSearch, tvSearchNoResults;
    ArrayList<Jewellery> filteredList;
    private ListActivityAdapter adapter;
    private ImageView ivBackBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);
        searchView = findViewById(R.id.search_view);
        lvSearch = findViewById(R.id.search_list_view);
        tvSearch = findViewById(R.id.search_name);
        tvSearchNoResults = findViewById(R.id.search_result);

        searchView.onActionViewExpanded();

        //Back button functionality
        ivBackBtn = findViewById(R.id.back_pressed);
        ivBackBtn.setOnClickListener(v -> Searchable.super.onBackPressed());

        initSearchWidget();
    }

    public void setupJewellerySelectedListener() {
        lvSearch.setOnItemClickListener((parent, view, position, id) -> {

            //Launch the detail view passing jewellery item as an extra
            Intent intent = new Intent(Searchable.this, DetailsActivity.class);
            intent.putExtra(JEWELLERY_DETAIL_KEY, adapter.getItem(position));
            startActivity(intent);
        });
    }


    private void initSearchWidget() {


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                filteredList = new ArrayList<>();
                ArrayList<Jewellery> all = JewelleryProvider.generateData();

                if (query != null) {
                    for (int i = 0; i < all.size(); i++) {
                        Jewellery jewellery = all.get(i);
                        if (all.get(i).getName().toLowerCase().contains(query.toLowerCase())) {
                            filteredList.add(all.get(i));
                        }
                        if (all.get(i).getDescription().toLowerCase().contains(query.toLowerCase())) {
                            if (filteredList.size() != 0) {
                                if (filteredList.get(filteredList.size() - 1) != jewellery) {
                                    filteredList.add(all.get(i));
                                }
                            }
                        }
                    }

                    tvSearch.setText(query);
                    adapter = new ListActivityAdapter(getApplicationContext(), filteredList);
                    lvSearch.setAdapter(adapter);
                    setupJewellerySelectedListener();

                    if (filteredList.size() == 0) {
                        tvSearchNoResults.setText("No results found");
                    } else {
                        tvSearchNoResults.setText(" ");
                    }
                }


                return false;
            }
        });
    }

}
