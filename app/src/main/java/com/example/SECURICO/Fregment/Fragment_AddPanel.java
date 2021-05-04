package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.SECURICO.R;

import java.util.ArrayList;
import java.util.Arrays;


public class Fragment_AddPanel extends Fragment {

    Spinner spinner;
    Button btn_add;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment__add_panel, container, false);
        spinner =view.findViewById(R.id.spinner);
        btn_add = view.findViewById(R.id.panelManagment);
       String[] value = {"GALAXY GSM CONTROL", "2", "3"};
        ArrayList<String>arrayList = new ArrayList<>(Arrays.asList(value));
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(getContext(),R.layout.spinner_layout,arrayList);
        spinner.setAdapter(arrayAdapter);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout,new Fragment_PanelManagment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
       return view;
    }
}