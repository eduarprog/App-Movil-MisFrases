package com.moodprogrammer.misfrases;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Compartir extends Fragment {

    Button compartirapp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.compartir, container, false);

        compartirapp = view.findViewById(R.id.compartirapp);

        compartirapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compartirapp1();
            }
        });

        return view;

    }

    private void compartirapp1() {
        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT,getResources().getString(R.string.app_name));
            String mensaje = "  App \n";

            intent.putExtra(Intent.EXTRA_TEXT, mensaje);
            startActivity(intent);
        }
        catch (Exception e){
            Toast.makeText(getContext(), ""+e.getMessage(), Toast.LENGTH_SHORT).show();


        }
    }

}
