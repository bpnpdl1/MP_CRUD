package com.example.databaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ViewClubItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_club_items);


        ListView myList=findViewById(R.id.listviewItems);
        String[] Clubname={"LOD","PRIME"};
        String[] Clubaddress={"Pokhara","Chitwan"};
        String[] Clubtype={"Bar","Musical Club"};
        String[] CLubEntryfee={"2000","1500"};

        ClubAdapter myadapter=new ClubAdapter(ViewClubItemsActivity.this,Clubname,Clubaddress,Clubtype,CLubEntryfee);

        myList.setAdapter(myadapter);
    }
}