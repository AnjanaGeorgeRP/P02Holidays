package com.myapplicationdev.android.p02_holidays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
}
