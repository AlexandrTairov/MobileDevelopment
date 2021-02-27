package com.example.mobile.database.connection;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseConnector extends SQLiteOpenHelper {

    final String LOG_TAG = "myLogs";

    public DatabaseConnector(Context context) {
        super(context, "mobileDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(LOG_TAG, "--- onCreate database ---");
        db.execSQL("create table user ("
                + "id integer primary key autoincrement,"
                + "email text,"
                + "userName text,"
                + "password text,"
                + "avatarImage text,"
                + "bonus double"+ ");");
        db.execSQL("create table product ("
                + "id integer primary key autoincrement,"
                + "productName text,"
                + "description text,"
                + "Image text,"
                + "price double,"
                + "discount double"+ ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
