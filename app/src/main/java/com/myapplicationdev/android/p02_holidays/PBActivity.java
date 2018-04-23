package com.myapplicationdev.android.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PBActivity extends AppCompatActivity {

    ListView lvpb;
    ArrayAdapter aa;
    ArrayList<PublicHoliday> publicHolidays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pb);
        lvpb = (ListView) findViewById(R.id.lvPb);
        publicHolidays = new ArrayList<PublicHoliday>();

        aa = new PublicHolidayAdapter(this, R.layout.row, publicHolidays);
        lvpb.setAdapter(aa);

        Intent i = getIntent();
        int choice = i.getIntExtra("choice",0);
        if (choice == 0){
            publicHolidays.add(new PublicHoliday("New Year's Day", "1 Jan 2018",R.drawable.newyear));
            publicHolidays.add(new PublicHoliday("Labour Day", "1 May 2018",R.drawable.labourday));
            publicHolidays.add(new PublicHoliday("National Day", "9 August 2018",R.drawable.nationalday));

        }else{
            publicHolidays.add(new PublicHoliday("Chineese New Year", "16 Feb 2018",R.drawable.cny));
            publicHolidays.add(new PublicHoliday("Good FriDay", "30 March 2018",R.drawable.goodfriday));
            publicHolidays.add(new PublicHoliday("Vesak Day", "29 May 2018",R.drawable.vesakday));
            publicHolidays.add(new PublicHoliday("Hari Raya Puasa", "15 June 2018",R.drawable.harirayapuasa));
            publicHolidays.add(new PublicHoliday("Hari Raya Haji", "22 August 2018",R.drawable.harirayahaji));
            publicHolidays.add(new PublicHoliday("Deepavali", "6 November 2018",R.drawable.deepavali));
            publicHolidays.add(new PublicHoliday("Christmas Day", "25 December 2018",R.drawable.christmas));

        }

        lvpb.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PublicHoliday selectedPb = publicHolidays.get(position);

                Toast.makeText(PBActivity.this, selectedPb.getName()+ " Date: "+selectedPb.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}
