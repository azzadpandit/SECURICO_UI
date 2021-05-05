package com.example.SECURICO.SharedPrefManager;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class SharedPrefManager{
    private static SharedPrefManager mInstance;
    private Context mCtx;
    public static final String SHARED_PREF_NAME="codeing me krta hu ";
    public SharedPrefManager(Context mCtx) {
        this.mCtx = mCtx;
    }
    public static synchronized SharedPrefManager getInstance(Context mCtx)
    {
        if (mInstance ==null)
        {
            mInstance = new SharedPrefManager(mCtx);
        }
        return mInstance;
    }
    public void saveUser(User user)
    {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("id",user.getId());
        editor.putString("customername",user.getCUSTOMER_NAME());
        editor.putString("phone",user.getPHONE());
        editor.putString("email",user.getEMAIL());
        editor.putString("name",user.getPASSWORD());
        editor.putString("address",user.getADDRESS());
        editor.putString("username",user.getUSERNAME());
        editor.putString("password",user.getPASSWORD());
        editor.apply();
    }
    public boolean iSloggIn(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getInt("id",-1)!= -1;
    }
    public User getUser()
    {
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return new User(
                sharedPreferences.getInt("id",-1),
                sharedPreferences.getString("email",null),
                sharedPreferences.getString("username",null),
                sharedPreferences.getString("password",null)
        );
    }
    public void clear(){
        SharedPreferences sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        Toast.makeText(mCtx, "clrear is working session ", Toast.LENGTH_SHORT).show();
    }


}
