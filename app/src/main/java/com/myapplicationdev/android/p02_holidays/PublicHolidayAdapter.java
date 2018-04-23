package com.myapplicationdev.android.p02_holidays;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PublicHolidayAdapter extends ArrayAdapter<PublicHoliday> {
    private ArrayList<PublicHoliday> pb;
    private Context context;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivImage;

    public PublicHolidayAdapter(Context context, int resource, ArrayList<PublicHoliday> objects) {
        super(context, resource, objects);
        pb = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvName = (TextView) rowView.findViewById(R.id.tvName);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        // Get the ImageView object
        ivImage = (ImageView) rowView.findViewById(R.id.ivImage);


        PublicHoliday current = pb.get(position);
        // Set the TextView to show the food

        tvName.setText(current.getName());
        tvDate.setText(current.getDate());

        int currentImg = current.getImage();
        ivImage.setImageResource(currentImg);

        return rowView;

    }
}
