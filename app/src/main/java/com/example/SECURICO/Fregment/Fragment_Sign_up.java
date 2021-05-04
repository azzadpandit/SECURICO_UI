package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.SECURICO.R;

public class Fragment_Sign_up extends Fragment {

    Button Signin ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__sign_up, container, false);
        Signin = view.findViewById(R.id.signup);
        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.mainlayout, new Fragment_Sign_in());
                ft.addToBackStack(null);
                ft.commit();
            }
        });
    return view;
    }
}