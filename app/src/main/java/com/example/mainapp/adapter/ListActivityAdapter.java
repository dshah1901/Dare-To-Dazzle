package com.example.mainapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mainapp.model.Jewellery;
import com.example.mainapp.R;

import java.util.ArrayList;

public class ListActivityAdapter extends ArrayAdapter<Jewellery> {

    private static class ViewHolder {
        private ImageView ivItemImage;
        private TextView tvItemTitle, tvItemCost;
    }

    public ListActivityAdapter(@NonNull Context context, ArrayList<Jewellery> aJewellery) {
        super(context, 0, aJewellery);
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Jewellery jewellery = getItem(position);

        ViewHolder viewHolder;
        viewHolder = new ViewHolder();
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_item, parent, false);
        viewHolder.ivItemImage = convertView.findViewById(R.id.item_main_image);
        viewHolder.tvItemTitle = convertView.findViewById(R.id.item_name);
        viewHolder.tvItemCost = convertView.findViewById(R.id.item_cost);

        viewHolder.tvItemTitle.setText(jewellery.getName());
        viewHolder.tvItemCost.setText(jewellery.getCost());

        int resID = jewellery.getCoverAdder();
        viewHolder.ivItemImage.setImageResource(resID);
        return convertView;
    }
}
