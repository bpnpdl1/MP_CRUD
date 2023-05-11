package com.example.databaseapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.Nullable;

public class ClubDBOpenHelper extends SQLiteOpenHelper {


    public ClubDBOpenHelper(Context context) {
        super(context, "clubdb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createStatement="Create table club(name text, address text,clubType text,clubEntryfee text)";
        sqLiteDatabase.execSQL(createStatement);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


        public void insertCLubDetail(String name, String address,String type,String entryfee){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("name",name);
        cv.put("address",address);
        cv.put("type",type);
        cv.put("entryfee",entryfee);

        db.insert("club",null,cv);
        db.close();
    }

    public Cursor readClubDetail(){
        SQLiteDatabase sqLiteDatabase=getReadableDatabase();
        String readQuery="Select*from club";
        Cursor cursor=sqLiteDatabase.rawQuery(readQuery,null);

        return cursor;
    }
}
