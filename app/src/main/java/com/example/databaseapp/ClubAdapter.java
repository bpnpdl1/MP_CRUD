package com.example.databaseapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ClubAdapter extends ArrayAdapter<String> {

    Context context;
    String[] Clubname,Clubaddress,Clubtype,ClubEntryfee;

    public ClubAdapter(@NonNull Context context, String[] Clubname,String[] Clubtype,String[] Clubaddress,String[] ClubEntryfee) {
        super(context, R.layout.clubitems,Clubname);
        this.context=context;
        this.Clubname=Clubname;
        this.Clubaddress=Clubaddress;
        this.Clubtype=Clubtype;
        this.ClubEntryfee=ClubEntryfee;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        View v=((Activity)context).getLayoutInflater().inflate(R.layout.clubitems,null,false);


        TextView tvClubname=v.findViewById(R.id.tvClubname);
        TextView tvClubaddress=v.findViewById(R.id.tvClubaddress);
        TextView tvClubtype=v.findViewById(R.id.tvClubtype);
        TextView tvClubEntryfee=v.findViewById(R.id.tvClubentryfee);

        tvClubname.setText(Clubname[position]);
        tvClubaddress.setText(Clubaddress[position]);
        tvClubtype.setText(Clubtype[position]);
        tvClubEntryfee.setText((ClubEntryfee[position]));

        return v;


    }

}
