package com.example.SECURICO.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.SECURICO.Fregment.Fragment_Dashbord_More_Btn_Option;
import com.example.SECURICO.R;
import com.example.SECURICO.itemModel;

import java.util.ArrayList;

public class Adapter_dashbord extends RecyclerView.Adapter<Adapter_dashbord.ViewHolder> {
    Context context;
    ArrayList<itemModel> arrayList;
    public Adapter_dashbord(Context context, ArrayList<itemModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        TextView rowtext;
        ImageButton button;
        public ViewHolder(View itemView) {
            super(itemView);
            rowtext = itemView.findViewById(R.id.textView2);
            button = itemView.findViewById(R.id.imageButton12);
            context = itemView.getContext();
        }
    }
    @Override
    public Adapter_dashbord.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_dashbord_horizentel, parent, false);
        Adapter_dashbord.ViewHolder viewHolder = new Adapter_dashbord.ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(Adapter_dashbord.ViewHolder holder, int position) {
        holder.rowtext.setText(arrayList.get(position).getName());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity)v.getContext();
                Fragment_Dashbord_More_Btn_Option moreOption = new Fragment_Dashbord_More_Btn_Option();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.mainlayout,moreOption)
                        .addToBackStack(null).commit();
            }
        });

    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

