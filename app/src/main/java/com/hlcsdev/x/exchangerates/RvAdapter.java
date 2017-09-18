package com.hlcsdev.x.exchangerates;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {

    private ArrayList<Valute> valutes;


    RvAdapter(ArrayList<Valute> valutes) {
        this.valutes = valutes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Valute valute = valutes.get(position);

        holder.textViewName.setText(valute.getName());
        holder.textViewValue.setText(valute.getValue());
    }

    @Override
    public int getItemCount() {
        return valutes.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView textViewName;
        TextView textViewValue;

        ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewValue = (TextView) itemView.findViewById(R.id.textViewValue);
        }
    }
}
