package com.example.SECURICO.Fregment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.SECURICO.Adapters.Adapter_dashbord;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class Fragment_Dashbord extends Fragment {

    FloatingActionButton addpanel;
    RecyclerView recyclerView ;
    LinearLayoutManager layoutManager;
    ArrayList<itemModel>arrayList;
    Adapter_dashbord Adapter_dashbord;
    Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashbord, container, false);
        addpanel = view.findViewById(R.id.AddPanel);
        //toolbar k liye AppCompatActivity likhna pdega ye
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        toolbar = (Toolbar) view.findViewById(R.id.toolbarOption);//yaha xml se connect androidx.appcompat.widget.Toolbar +id

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
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.btnlogout:
                    {
                        Toast.makeText(activity, "Yes Logout Button <Location tha xml layout androidx toolbar >menu'package' item access>", Toast.LENGTH_SHORT).show();
                    }
                    break;
                }
                return false;
            }
        });


        return view;

    }


}