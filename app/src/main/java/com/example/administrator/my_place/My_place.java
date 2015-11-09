package com.example.administrator.my_place;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class My_place extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_place);
        String[] names = new String[]{"iphone6s", "Samsung6S","htc"};
        ListView listView = (ListView)findViewById(R.id.list);

        final My_place3 iphone6s = new My_place3("iphone6s","Tk_82000",R.drawable.images1);
        My_place3 samsungS6 = new My_place3("SamsungS6","Tk_55000",R.drawable.images);
        My_place3 htc = new My_place3("htc","Tk_40000",R.drawable.index);
        final ArrayList<My_place3> personItems = new ArrayList<>();
        personItems.add(iphone6s);
        personItems.add(samsungS6);
        personItems.add(htc);

        final My_place2 nameAdapter =
                new My_place2(this, personItems);

        listView.setAdapter(nameAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                My_place3 personItem = personItems.get(i);
                String name = personItem.name;
                if (name == "iphone6s") {
                    String url = "https://www.google.com/search?q=iphone+6s&ie=utf-8&oe=utf-8";
                    Intent n = new Intent(Intent.ACTION_VIEW);
                    n.setData(Uri.parse(url));
                    startActivity(n);
                }
                if (name == "SamsungS6") {
                    String url = "https://www.google.com/search?q=samsungS6&ie=utf-8&oe=utf-8";
                    Intent n = new Intent(Intent.ACTION_VIEW);
                    n.setData(Uri.parse(url));
                    startActivity(n);
                }
                if (name == "htc") {
                    String url = "https://www.google.com/search?q=htc&ie=utf-8&oe=utf-8";
                    Intent n = new Intent(Intent.ACTION_VIEW);
                    n.setData(Uri.parse(url));
                    startActivity(n);
                }
                personItem.name = "Clicked";
                nameAdapter.notifyDataSetChanged();
            }
        });
    }
    public void onClick(View view) {


    }
}


