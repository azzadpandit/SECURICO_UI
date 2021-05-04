package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.SECURICO.R;

public class Fragment_Sign_in extends Fragment {

    Button signin;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment__sign_in, container, false);

       signin = view.findViewById(R.id.signin);
       signin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
               fragmentTransaction.replace(R.id.mainlayout,new Fragment_Dashbord());
               fragmentTransaction.addToBackStack(null);
               fragmentTransaction.commit();
           }
       });
       return view;
    }
}