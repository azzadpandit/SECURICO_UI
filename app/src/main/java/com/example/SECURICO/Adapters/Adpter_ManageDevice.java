package com.example.SECURICO.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;

public class Adpter_ManageDevice extends RecyclerView.Adapter<Adpter_ManageDevice.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;
    public Adpter_ManageDevice(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        EditText rowZoneName,rowZoneNumber;
        ImageButton delete;
        public ViewHolder(View itemView) {
            super(itemView);
            rowZoneName = itemView.findViewById(R.id.editText4DeviceName);
            rowZoneNumber = itemView.findViewById(R.id.editText6DeviceNumber);
            delete = itemView.findViewById(R.id.ManageDeviceDeleteItem);
            context = itemView.getContext();
        }
    }
    @Override
    public Adpter_ManageDevice.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_manage_device_horizental_item, parent, false);
        Adpter_ManageDevice.ViewHolder viewHolder = new Adpter_ManageDevice.ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(Adpter_ManageDevice.ViewHolder holder, int position) {
        holder.rowZoneName.setText(arrayList.get(position).getName());
        holder.rowZoneNumber.setText(arrayList.get(position).getNumber());
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
                Log.d("delete","Yes Clicked item is deleted ");
                arrayList.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(position, arrayList.size());
            }
        });
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

