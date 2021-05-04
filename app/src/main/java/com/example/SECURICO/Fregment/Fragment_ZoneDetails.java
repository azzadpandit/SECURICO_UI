package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SECURICO.Adapters.Adapter_ZoneDetails;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;


public class Fragment_ZoneDetails extends Fragment {

    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    Adapter_ZoneDetails programAdapter;
    ArrayList<itemModel> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment__zone_details, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewZoneDetails);

        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();itemModel.setName("Zone Name");itemModel.setNumber("Number");
        itemModel itemMode1 = new itemModel();itemMode1.setName("Zone Name");itemMode1.setNumber("Number");
        arrayList.add(itemModel);
        arrayList.add(itemMode1);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        programAdapter = new Adapter_ZoneDetails(getContext(), arrayList);
        recyclerView.setAdapter(programAdapter);
    return view;
    }
}