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

public class Adapter_FireNumber  extends RecyclerView.Adapter<Adapter_FireNumber.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;
    public Adapter_FireNumber(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        EditText rowImage;
        ImageButton delete;
        public ViewHolder(View itemView) {
            super(itemView);
            rowImage = itemView.findViewById(R.id.editTextFireNumber5);
            delete = itemView.findViewById(R.id.imageButtonFireNumberDelete);
            context = itemView.getContext();
        }
    }
    @Override
    public Adapter_FireNumber.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_fire_number_horizental_item, parent, false);
        Adapter_FireNumber.ViewHolder viewHolder = new Adapter_FireNumber.ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(Adapter_FireNumber.ViewHolder holder, int position) {
        holder.rowImage.setText(arrayList.get(position).getName());
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

