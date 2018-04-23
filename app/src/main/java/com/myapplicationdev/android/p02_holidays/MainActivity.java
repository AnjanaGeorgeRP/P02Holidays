package com.myapplicationdev.android.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] pbArray = {"Secular","Ethnic & Religion"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);

        ArrayAdapter<String> aaPb;
        aaPb = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pbArray);
        lv.setAdapter(aaPb);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = pbArray[position];
                Intent intent = new Intent(MainActivity.this,PBActivity.class);
                intent.putExtra("choice", position);
                startActivity(intent);

            }
        });


    }
}
