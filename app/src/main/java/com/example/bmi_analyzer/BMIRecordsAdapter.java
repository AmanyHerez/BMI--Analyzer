package com.example.bmi_analyzer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.bmi_analyzer.R;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BMIRecordsAdapter extends RecyclerView.Adapter<BMIRecordsAdapter.ViewHolder>{
    Context context;
    ArrayList<BMIRecord> records;

    public BMIRecordsAdapter(Context context, ArrayList<BMIRecord> records) {
        this.context = context;
        this.records = records;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.element_bmi_record, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (records !=null && records.size()>0){
            BMIRecord model=records.get(position);
            holder.date.setText(model.getDate());
            holder.weight.setText(model.getWeight());
            holder.message.setText(model.getBmiMessage());
            holder.length.setText(model.length);
        } else {}
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView date,weight,message,length;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            weight = itemView.findViewById(R.id.weight);
            message = itemView.findViewById(R.id.message);
            length = itemView.findViewById(R.id.length);
        }
    }
}
