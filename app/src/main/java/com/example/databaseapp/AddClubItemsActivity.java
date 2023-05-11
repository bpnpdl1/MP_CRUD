package com.example.databaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddClubItemsActivity extends AppCompatActivity {

    EditText etClubname,etClubtype,etClubaddress,etClubEntryfee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_club_items);

        Button btSave=findViewById(R.id.btSave);
        etClubname=findViewById(R.id.etClubname);
        etClubaddress=findViewById(R.id.etClubaddress);
        etClubtype=findViewById(R.id.etClubtype);
        etClubEntryfee=findViewById(R.id.etClubEntryFee);

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name,address,type,entryfee;

                name=etClubname.getText().toString();
                address=etClubaddress.getText().toString();
                type=etClubaddress.getText().toString();
                entryfee=etClubEntryfee.getText().toString();



                ClubDBOpenHelper clubdb=new ClubDBOpenHelper(AddClubItemsActivity.this);

                clubdb.insertCLubDetail(name,address,type,entryfee);
                Toast.makeText(getApplicationContext(),"Data Inserted Successfully",Toast.LENGTH_SHORT).show();

            }
        });


    }
}