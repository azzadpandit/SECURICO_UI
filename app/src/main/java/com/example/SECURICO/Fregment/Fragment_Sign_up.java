package com.example.SECURICO.Fregment;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.SECURICO.DataBase.DataBaseHelp;
import com.example.SECURICO.DataBase.userdetails;
import com.example.SECURICO.R;
import com.example.SECURICO.SharedPrefManager.SharedPrefManager;

public class Fragment_Sign_up extends Fragment {
    Button Signin;
    EditText cus_customername,cus_phone,cus_email,cus_address,cus_username,cus_password;
    DataBaseHelp databasehelp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__sign_up, container, false);
        Signin = view.findViewById(R.id.signup);

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regitionmethod();

            }
        });
        cus_customername =view.findViewById(R.id.editTextTextPersonName);
        cus_phone=view.findViewById(R.id.editTextPhone);
        cus_email=view.findViewById(R.id.editTextEmail);
        cus_address=view.findViewById(R.id.editTextAddress);
        cus_username=view.findViewById(R.id.editTextUserName);
        cus_password=view.findViewById(R.id.editTextPassword);

        databasehelp=new DataBaseHelp(getContext());

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (SharedPrefManager.getInstance(getActivity()).iSloggIn());
            Toast.makeText(getContext(), "user is already available", Toast.LENGTH_SHORT).show();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.mainlayout, new Fragment_Dashbord());
            ft.addToBackStack(null);
            ft.commit();



    }

    private void regitionmethod() {
        String str_customername=cus_customername.getText().toString();
        String str_phone=cus_phone.getText().toString();
        String str_email=cus_email.getText().toString();
        String str_address=cus_address.getText().toString();
        String str_username=cus_username.getText().toString();
        String str_password=cus_password.getText().toString();

        if (str_customername.isEmpty())
        {
            cus_customername.setError("customer name");
            cus_customername.requestFocus();
        }
        if (str_phone.isEmpty())
        {
            cus_phone.setError("Phone number");
            cus_phone.requestFocus();
        }
        if (str_email.isEmpty()) {
            cus_email.setError("customer name");
            cus_email.requestFocus();
        }
        if (str_address.isEmpty()) {
            cus_address.setError("customer name");
            cus_address.requestFocus();
        }
        if (str_username.isEmpty()) {
            cus_username.setError("customer name");
            cus_username.requestFocus();
        }
        if (str_password.isEmpty()) {
            cus_password.setError("customer name");
            cus_password.requestFocus();
        }
        else
        {
            Boolean test = databasehelp.addUser(str_customername,str_phone,str_email,str_address,str_username,str_password);
            if (test==true)
            {

                Toast.makeText(getContext(), "done", Toast.LENGTH_SHORT).show();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.mainlayout, new Fragment_Sign_in());
                ft.addToBackStack(null);
                ft.commit();
            }
            else {
                Toast.makeText(getContext(), "not done", Toast.LENGTH_SHORT).show();
            }
        }
    }


}