package com.example.listviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewexample.R;
import com.example.listviewexample.model.Bikemodel;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Bikemodel> {

    ArrayList<Bikemodel> bikemodelArrayList;
    Context context;

    public MyCustomAdapter(Context context, ArrayList<Bikemodel> bikemodelArrayList) {
        super(context, R.layout.mylistitem, bikemodelArrayList);
        this.context = context;
        this.bikemodelArrayList = bikemodelArrayList;
    }

    private static class MyViewHolder {
        TextView Name, Price;
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Bikemodel bikemodel = getItem(position);
        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null) {

            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.mylistitem, parent, false);

            myViewHolder.Name = convertView.findViewById(R.id.Name);
            myViewHolder.Price = convertView.findViewById(R.id.Price);
            myViewHolder.imageView = convertView.findViewById(R.id.imageview);

            result = convertView;
            convertView.setTag(myViewHolder);

        } else {

            myViewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }
        myViewHolder.Name.setText(bikemodel.getName());
        myViewHolder.Price.setText(bikemodel.getPrice());
        myViewHolder.imageView.setImageResource(bikemodel.getImage());

        return convertView;
    }
}