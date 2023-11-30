package com.example.examenandroid;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

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

        mListView.setClickable(true);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                //Object o = listView.getItemAtPosition(position);
                // Realiza lo que deseas, al recibir clic en el elemento de tu listView determinado por su posicion.
//                Log.i("Click", "click en el elemento " + position + " de mi ListView");
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                    if (position == 0) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame1, new FragmentFutbol())
                                .addToBackStack(null)
                                .commit();
                    }
                    if (position == 1) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame1, new FragmentBaloncesto())
                                .addToBackStack(null)
                                .commit();
                    }
                    if (position == 2) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame1, new FragmentTenis())
                                .addToBackStack(null)
                                .commit();
                    }
                    if (position == 3) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame1, new FragmentPadel())
                                .addToBackStack(null)
                                .commit();
                    }
                } else {
                    if (position == 0) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame2, new FragmentFutbol())
                                .addToBackStack(null)
                                .commit();
                    }
                    if (position == 1) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame2, new FragmentBaloncesto())
                                .addToBackStack(null)
                                .commit();
                    }
                    if (position == 2) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame2, new FragmentTenis())
                                .addToBackStack(null)
                                .commit();
                    }
                    if (position == 3) {
                        requireActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame2, new FragmentPadel())
                                .addToBackStack(null)
                                .commit();
                    }
                }
            }
        });
        return viewLista;

    }
}