package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SECURICO.Adapters.Adpter_ManageDevice;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;


public class Fragment_ManagerDevices extends Fragment {

    ArrayList<itemModel> arrayList;
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    com.example.SECURICO.Adapters.Adpter_ManageDevice Adpter_ManageDevice;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment__manager_devices, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewManageDevices);
        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();itemModel.setName("Devices");itemModel.setNumber("Number");
        itemModel itemMode1 = new itemModel();itemMode1.setName("Devices");itemMode1.setNumber("Number");
        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        Adpter_ManageDevice = new Adpter_ManageDevice(getContext(),arrayList);
        recyclerView.setAdapter(Adpter_ManageDevice);
        return view;
    }
}