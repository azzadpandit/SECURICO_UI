package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.SECURICO.Adapters.Adapter_dashbord;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class Fragment_Dashbord extends Fragment {

    FloatingActionButton addpanel;
    RecyclerView recyclerView ;
    LinearLayoutManager layoutManager;
    ArrayList<itemModel>arrayList;
    com.example.SECURICO.Adapters.Adapter_dashbord Adapter_dashbord;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashbord, container, false);
        addpanel = view.findViewById(R.id.AddPanel);
        recyclerView=view.findViewById(R.id.recyclerViewDashbord);
        arrayList = new ArrayList<>();
        itemModel itemModel = new itemModel();itemModel.setName("Name of The device");
        itemModel itemMode1 = new itemModel();itemMode1.setName("Name of The device");
        itemModel itemMode2 = new itemModel();itemMode2.setName("Name of The device");
        itemModel itemMode3 = new itemModel();itemMode3.setName("Name of The device");
        arrayList.add(itemModel);
        arrayList.add(itemMode1);
        arrayList.add(itemMode2);
        arrayList.add(itemMode3);

        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        Adapter_dashbord = new Adapter_dashbord(getContext(), arrayList);
        recyclerView.setAdapter(Adapter_dashbord);

        addpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainlayout,new Fragment_AddPanel()).addToBackStack(null).commit();

            }
        });
        return view;

    }

}