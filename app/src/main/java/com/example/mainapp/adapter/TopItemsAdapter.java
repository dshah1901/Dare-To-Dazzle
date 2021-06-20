package com.example.mainapp.adapter;

import com.example.mainapp.DetailsActivity;
import com.example.mainapp.model.Jewellery;
import com.example.mainapp.R;
import com.example.mainapp.model.JewelleryProvider;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.mainapp.ListActivity.JEWELLERY_DETAIL_KEY;

public class TopItemsAdapter extends RecyclerView.Adapter<TopItemsAdapter.ViewHolder> {

    // To make your view item clickable ensure that the view holder class implements View.OnClickListener and it has the onClick(View v) method.
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // Declare objects of all the views to be manipulated in item_contact.xml
        public TextView tvJewelleryName, tvJewelleryCost;
        public ImageView ivJewelleryImage;

        public ViewHolder(View v) {
            super(v);

            // Initialize the view objects
            tvJewelleryName = v.findViewById(R.id.top_items_name);
            ivJewelleryImage = v.findViewById((R.id.top_items_image));
            tvJewelleryCost = v.findViewById((R.id.top_items_cost));
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // What to do when the view item is clicked
            Context context = v.getContext();
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra(JEWELLERY_DETAIL_KEY, topItemsList.get(getAdapterPosition()));
            context.startActivity(intent);
            JewelleryProvider.sortByClicks(topItemsList);
        }
    }

    // Declare the data collection object that holds the data to be populated in the RecyclerView
    private ArrayList<Jewellery> topItemsList;
    private Context mContext;

    // Pass in the contact array object into the constructor
    public TopItemsAdapter(ArrayList<Jewellery> jewelleries) {
        // The contacts object is sent via the activity that creates this adaptor
        topItemsList = jewelleries;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public TopItemsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        // Inflate the custom layout
        View itemView = inflater.inflate(R.layout.topproducts_row_items, parent, false);

        // Return a new holder instance
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    // This method populates the data from mContacts to the view items
    @Override
    public void onBindViewHolder(@NonNull TopItemsAdapter.ViewHolder holder, int position) {
        // Get the data object for the item view in this position
        Jewellery thisJewellery = topItemsList.get(position);
        holder.tvJewelleryName.setText(thisJewellery.getName());
        holder.tvJewelleryCost.setText(thisJewellery.getCost());
        holder.ivJewelleryImage.setImageResource(thisJewellery.getCoverAdder());
    }

    @Override
    public int getItemCount() {
        return topItemsList.size();
    }


}