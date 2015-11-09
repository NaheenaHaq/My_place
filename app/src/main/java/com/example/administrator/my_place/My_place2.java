package com.example.administrator.my_place;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class My_place2 extends ArrayAdapter<My_place3> {

    public My_place2(Context context, List<My_place3> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_my_place2, null, false);

        TextView nameTextView = (TextView)view.findViewById(R.id.item_name);
        TextView takaTextView = (TextView)view.findViewById(R.id.item_taka);
        ImageView imageView = (ImageView)view.findViewById(R.id.item_image);


        My_place3 My_place3 = getItem(position);

        nameTextView.setText(My_place3.name);
        takaTextView.setText(My_place3.taka);
        imageView.setImageResource(My_place3.imageResId);
        return view;
    }
}
