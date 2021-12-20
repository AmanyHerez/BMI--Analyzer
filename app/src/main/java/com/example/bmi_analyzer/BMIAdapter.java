package com.example.bmi_analyzer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BMIAdapter extends RecyclerView.Adapter<BMIAdapter.BMIHolder> {
    ArrayList<BMIRecord> records;

    public BMIAdapter(ArrayList<BMIRecord> records) {
        this.records = records;
    }

    @NonNull
    @Override
    public BMIHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.element_record, null, false);
        BMIHolder viewHolder = new BMIHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BMIHolder holder, int position) {
        BMIRecord record = records.get(position);
        holder.tv_date.setText(record.getDate());
        holder.tv_weight.setText(Integer.toString(record.getWeight()));
        holder.tv_message.setText(record.getMessage());
        holder.tv_length.setText(Integer.toString(record.getLength()));
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    public class BMIHolder extends RecyclerView.ViewHolder {
        TextView tv_date, tv_weight, tv_message, tv_length;

        public BMIHolder(@NonNull View itemView) {
            super(itemView);
            tv_date = itemView.findViewById(R.id.date);
            tv_weight = itemView.findViewById(R.id.weight);
            tv_message = itemView.findViewById(R.id.message);
            tv_length = itemView.findViewById(R.id.length);
        }
    }
}
