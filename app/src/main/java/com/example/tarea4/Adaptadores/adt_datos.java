package com.example.tarea4.Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tarea4.R;

public class adt_datos extends RecyclerView.Adapter<adt_datos.ViewHolder_dts> {

    //Datos ficticios solo para rellenar
    private String[] datos = new String[] {"Uno","Dos"};

    @Override
    public ViewHolder_dts onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lyt_items,null,false);
        return new ViewHolder_dts(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_dts holder, int position) {
        try{holder.asig_dts(datos[position]);} catch (Exception e){}
    }

    @Override
    public int getItemCount() {
        return datos.length;
    }

    public class ViewHolder_dts extends RecyclerView.ViewHolder {

        public ViewHolder_dts(@NonNull View itemView) {
            super(itemView);

        }

        public void asig_dts(String r) {
            //Asignando los valores

        }
    }
}
