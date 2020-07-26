package com.example.tarea4.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarea4.Adaptadores.adt_datos;
import com.example.tarea4.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    RecyclerView rclItems;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //Asignación de los valores al adaptador
        rclItems= root.findViewById(R.id.rclItems);
        rclItems.setLayoutManager(new LinearLayoutManager(getContext()));
        adt_datos adaptador = new adt_datos();
        rclItems.setAdapter(adaptador);
        return root;
    }


}