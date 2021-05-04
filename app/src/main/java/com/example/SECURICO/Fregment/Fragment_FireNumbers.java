package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SECURICO.Adapters.Adapter_FireNumber;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;

public class Fragment_FireNumbers extends Fragment {
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;
    Adapter_FireNumber adapter_fireNumber;
    ArrayList<itemModel> arrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment__fire_numbers, container, false);
        recyclerView = view.findViewById(R.id.recyclerview1);

        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();itemModel.setName("Fire Number 1");
        itemModel itemMode1 = new itemModel();itemMode1.setName("Fire Number 2");
        itemModel itemMode2 = new itemModel();itemMode2.setName("Fire Number 3");
        itemModel itemMode3 = new itemModel();itemMode3.setName("Fire Number 4");
        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        arrayList.add(itemMode2);
        arrayList.add(itemMode3);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter_fireNumber = new Adapter_FireNumber(getContext(), arrayList);
        recyclerView.setAdapter(adapter_fireNumber);
        return view;
    }
}