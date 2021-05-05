package com.example.SECURICO.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelp extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION= 1;
    public static final String DATABASE_NAME = "run.db";
    public static final String TABLE_NAME = "Student_table";
    public static final String COL_1="ID";
    public static final String COL_2="CUSTOMER_NAME";
    public static final String COL_3="PHONE";
    public static final String COL_4="EMAIL";
    public static final String COL_5="ADDRESS";
    public static final String COL_6="USERNAME";
    public static final String COL_7="PASSWORD";

    public DataBaseHelp(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME+"( ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "CUSTOMER_NAME TEXT," +
                "PHONE TEXT," +
                "EMAIL TEXT," +
                "ADDRESS TEXT ," +
                "USERNAME TEXT," +
                "PASSWORD TEXT" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        db.close();
    }
    public Boolean addUser(String customername,String phone,String email,String address,String username,String password)
    {

        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,customername);
        contentValues.put(COL_3,phone);
        contentValues.put(COL_4,email);
        contentValues.put(COL_5,address);
        contentValues.put(COL_6,username);
        contentValues.put(COL_7,password);
        Long success= db.insert(TABLE_NAME,null,contentValues);
        if (success==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public String getSingleEntry(String userName)
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.query("LOGIN", null, " USERNAME=?", new String[]{userName}, null, null, null);
        if(cursor.getCount()<1) // UserName Not Exist
        {
            cursor.close();
            return "NOT EXIST";
        }
        cursor.moveToFirst();
        String password= cursor.getString(cursor.getColumnIndex("PASSWORD"));
        cursor.close();
        return password;
    }
}



