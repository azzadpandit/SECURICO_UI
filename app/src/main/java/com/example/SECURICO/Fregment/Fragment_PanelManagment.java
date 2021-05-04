package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SECURICO.Adapters.Adapter_PanelManagment_Horizotel_Bar;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;

public class Fragment_PanelManagment extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<itemModel> arrayList;
    Adapter_PanelManagment_Horizotel_Bar adapter_panelManagment_horizotel_bar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__panel_managment, container, false);

        recyclerView = view.findViewById(R.id.PanelManagmentHorizotelBar);
        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();
        itemModel.setName("Intrusion Number");
        itemModel itemMode1 = new itemModel();
        itemMode1.setName("Play and Record");
        itemModel itemMode2 = new itemModel();
        itemMode2.setName("Fire Numbere");
        itemModel itemMode3 = new itemModel();
        itemMode3.setName("Zone Details");
        itemModel itemMode4 = new itemModel();
        itemMode4.setName("Manage Device");
        itemModel itemMode5 = new itemModel();
        itemMode5.setName("Timer");
        itemModel itemMode6 = new itemModel();
        itemMode6.setName("Schedule");
        itemModel itemMode7 = new itemModel();
        itemMode7.setName("Arm/Disrm");
        itemModel itemMode8 = new itemModel();
        itemMode8.setName("Device");
        itemModel itemMode9 = new itemModel();
        itemMode9.setName("More");
        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        arrayList.add(itemMode2);
        arrayList.add(itemMode3);
        arrayList.add(itemMode4);
        arrayList.add(itemMode5);
        arrayList.add(itemMode6);
        arrayList.add(itemMode7);
        arrayList.add(itemMode8);
        arrayList.add(itemMode9);

        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter_panelManagment_horizotel_bar = new Adapter_PanelManagment_Horizotel_Bar(getContext(), arrayList);
        recyclerView.setAdapter(adapter_panelManagment_horizotel_bar);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        getFragmentManager().beginTransaction().replace(R.id.PanelHost, new Fragment_IntrusionNumbers()).commit();

    }
}