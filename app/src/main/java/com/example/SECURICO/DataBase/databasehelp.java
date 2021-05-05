package com.example.SECURICO.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class databasehelp extends SQLiteOpenHelper {


    public databasehelp(Context context) {
        super(context, "login", null, 1);
    }

    public static final String DATABASE_NAME = "securico";
    public static final String TABALE_NAME = "user";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_CUSTOMERNAME = "customerName";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table TABALE_NAME (COLUMN_ID primary key ,COLUMN_CUSTOMERNAME VARCHAR ,COLUMN_PHONE long ,COLUMN_ADDRESS VARCHAR,Address VARCHAR,Username VARCHAR,Password VARCHAR)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop Table if exists TABALE_NAME");
    }

    public Boolean insertData(String customerName, String phone, String email, String address, String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("customerName", customerName);
        contentValues.put("phone", phone);
        contentValues.put("email", email);
        contentValues.put("address", address);
        contentValues.put("username", username);
        contentValues.put("password", password);
        long result = db.insert("user", null, contentValues);
        if (result == -1) {
            return false;

        } else {
            return true;

        }
    }

    public Boolean isLogincheck(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.rawQuery("select * from login where email_id='" + username + "' and password='" + password + "'", null);
        c.moveToFirst();
        if (c.getCount() <= 0) {
            c.close();
            db.close();
            return false;
        }
        else {
            c.close();
            db.close();
            return true;
        }
    }
}



