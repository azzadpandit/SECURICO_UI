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

public class Adapter_ZoneDetails extends RecyclerView.Adapter<Adapter_ZoneDetails.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;
    public Adapter_ZoneDetails(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        EditText rowZoneName,rowZoneNumber;
        ImageButton delete;
        public ViewHolder(View itemView) {
            super(itemView);
            rowZoneName = itemView.findViewById(R.id.editText4ZoneName);
            rowZoneNumber = itemView.findViewById(R.id.editText6ZoneNumber);
            delete = itemView.findViewById(R.id.ZoneDeleteItem);
            context = itemView.getContext();
        }
    }
    @Override
    public Adapter_ZoneDetails.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_zone_details_horizental, parent, false);
        Adapter_ZoneDetails.ViewHolder viewHolder = new Adapter_ZoneDetails.ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(Adapter_ZoneDetails.ViewHolder holder, int position) {
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

