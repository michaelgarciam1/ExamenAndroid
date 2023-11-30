package com.example.examenandroid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentLista extends Fragment {

    private ListView mListView;

    public FragmentLista() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewLista = inflater.inflate(R.layout.fragment_lista, container, false);
        mListView = viewLista.findViewById(R.id.listView);
        ArrayList<String> deportes = new ArrayList<>();
        deportes.add("Futbol");
        deportes.add("Baloncesto");
        deportes.add("Tenis");
        deportes.add("Padel");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, deportes);
        mListView.setAdapter(adapter);
        return viewLista;
    }
}