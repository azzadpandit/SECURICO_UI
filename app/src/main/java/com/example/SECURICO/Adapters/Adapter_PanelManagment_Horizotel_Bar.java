package com.example.SECURICO.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.SECURICO.Fregment.Fragment_Arm_Disarm;
import com.example.SECURICO.Fregment.Fragment_Devices;
import com.example.SECURICO.Fregment.Fragment_FireNumbers;
import com.example.SECURICO.Fregment.Fragment_IntrusionNumbers;
import com.example.SECURICO.Fregment.Fragment_ManagerDevices;
import com.example.SECURICO.Fregment.Fragment_More;
import com.example.SECURICO.Fregment.Fragment_PlayAndRecord;
import com.example.SECURICO.Fregment.Fragment_Schedule;
import com.example.SECURICO.Fregment.Fragment_Timer;
import com.example.SECURICO.Fregment.Fragment_ZoneDetails;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;

public class Adapter_PanelManagment_Horizotel_Bar extends RecyclerView.Adapter<Adapter_PanelManagment_Horizotel_Bar.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;
    public Adapter_PanelManagment_Horizotel_Bar(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final Context context;
        TextView rowtext;
        public ViewHolder(View itemView) {
            super(itemView);
            rowtext = itemView.findViewById(R.id.header_title_horizotel);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            AppCompatActivity activity = (AppCompatActivity)v.getContext();
            switch (getPosition()) {

                case 0:
                    Fragment_IntrusionNumbers Fragment_IntrusionNumbers = new Fragment_IntrusionNumbers();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_IntrusionNumbers)
                            .addToBackStack(null).commit();
                    break;
                case 1:
                    Fragment_PlayAndRecord Fragment_PlayAndRecord = new Fragment_PlayAndRecord();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_PlayAndRecord)
                            .addToBackStack(null).commit();
                    break;
                case 2:
                    Fragment_FireNumbers Fragment_FireNumbers = new Fragment_FireNumbers();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_FireNumbers)
                            .addToBackStack(null).commit();
                    break;
                case 3:
                    Fragment_ZoneDetails Fragment_ZoneDetails = new Fragment_ZoneDetails();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_ZoneDetails)
                            .addToBackStack(null).commit();
                    break;
                case 4:
                    Fragment_ManagerDevices Fragment_ManagerDevices = new Fragment_ManagerDevices();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_ManagerDevices)
                            .addToBackStack(null).commit();
                    break;
                case 5:
                    Fragment_Timer Fragment_Timer = new Fragment_Timer();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_Timer)
                            .addToBackStack(null).commit();
                    break;
                case 6:
                    Fragment_Schedule Fragment_Schedule= new Fragment_Schedule();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_Schedule)
                            .addToBackStack(null).commit();
                    break;
                case 7:
                    Fragment_Arm_Disarm Fragment_Arm_Disarm= new Fragment_Arm_Disarm();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_Arm_Disarm)
                            .addToBackStack(null).commit();
                    break;
                case 8:
                    Fragment_Devices Fragment_Devices= new Fragment_Devices();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_Devices)
                            .addToBackStack(null).commit();
                    break;
                case 9:
                    Fragment_More Fragment_More= new Fragment_More();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.PanelHost,Fragment_More)
                            .addToBackStack(null).commit();
                    break;
            }
        }
    }
    @Override
    public Adapter_PanelManagment_Horizotel_Bar.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_panel_managment_horizotel_bar_layout, parent, false);
        Adapter_PanelManagment_Horizotel_Bar.ViewHolder viewHolder = new Adapter_PanelManagment_Horizotel_Bar.ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(Adapter_PanelManagment_Horizotel_Bar.ViewHolder holder, int position) {
        itemModel arraylist = arrayList.get(position);
        holder.rowtext.setText(arraylist.getName());
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

