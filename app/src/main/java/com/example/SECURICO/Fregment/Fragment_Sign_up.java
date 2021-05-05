package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.SECURICO.R;

public class Fragment_Sign_up extends Fragment {

    Button Signin;
    EditText cus_customername,cus_phone,cus_email,cus_address,cus_username,cus_password;
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
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.mainlayout, new Fragment_Sign_in());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
        cus_customername =view.findViewById(R.id.editTextTextPersonName);
        cus_phone=view.findViewById(R.id.editTextPhone);
        cus_email=view.findViewById(R.id.editTextEmail);
        cus_address=view.findViewById(R.id.editTextAddress);
        cus_username=view.findViewById(R.id.editTextUserName);
        cus_password=view.findViewById(R.id.editTextPassword);
    return view;
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
    }
}