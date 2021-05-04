package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SECURICO.Adapters.Adpter_Intrusion;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;


public class Fragment_IntrusionNumbers extends Fragment {
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    Adpter_Intrusion IntrusionAdapter;
    ArrayList<itemModel> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment__intrusion_numbers, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);

        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();itemModel.setName("Name of the device");
        itemModel itemMode1 = new itemModel();itemMode1.setName("Name of the device");
        itemModel itemMode2 = new itemModel();itemMode2.setName("Name of the device");
        itemModel itemMode3 = new itemModel();itemMode3.setName("Name of the device");
        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        arrayList.add(itemMode2);
        arrayList.add(itemMode3);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        IntrusionAdapter = new Adpter_Intrusion(getContext(), arrayList);
        recyclerView.setAdapter(IntrusionAdapter);
        return view;
    }
}