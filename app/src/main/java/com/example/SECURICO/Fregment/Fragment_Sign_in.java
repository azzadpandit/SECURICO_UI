package com.example.SECURICO.Fregment;

import android.database.sqlite.SQLiteDatabase;
import android.opengl.ETC1;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.SECURICO.DataBase.DataBaseHelp;
import com.example.SECURICO.R;
import com.google.android.material.textfield.TextInputEditText;

public class Fragment_Sign_in extends Fragment {

    Button signin;
    EditText username,password;
    DataBaseHelp dataBaseHelp;
    TextView redirecttosign_up;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment__sign_in, container, false);

       signin = view.findViewById(R.id.signin);
       username=view.findViewById(R.id.Username);
       password=view.findViewById(R.id.editTextPassword);
       redirecttosign_up = view.findViewById(R.id.textView10);
        redirecttosign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout,new Fragment_Sign_up());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
       dataBaseHelp=new DataBaseHelp(getContext());
       signin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               loginmethod();

           }
       });
       return view;
    }

    private void loginmethod() {
        String Username = username.getText().toString();
        String Password = password.getText().toString();
        if (Username.isEmpty()) {
            username.setError("Username");
            username.requestFocus();
        }
        if (Password.isEmpty()) {
            password.setError("Password");
            password.requestFocus();
        }
        else
        {
            Boolean checking = dataBaseHelp.IsLogin(Username,Password);
            if (checking==true)
            {
                Toast.makeText(getContext(), "working", Toast.LENGTH_SHORT).show();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout,new Fragment_Dashbord());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
            else {
                Toast.makeText(getContext(), "now working", Toast.LENGTH_SHORT).show();
            }
        }
    }
}