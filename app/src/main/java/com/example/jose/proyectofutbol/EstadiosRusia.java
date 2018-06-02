package com.example.jose.proyectofutbol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class EstadiosRusia extends Fragment {


    Button btnUbica1, btnUbica2, btnUbica3, btnUbica4, btnUbica5, btnUbica6,
            btnUbica7, btnUbica8, btnUbica9, btnUbica10,  btnUbica11, btnUbica12;

    ImageButton btnUbicacion;

    private FragmentActivity myContext;
    View view;

    public EstadiosRusia() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_estadios_rusia, container, false);



        btnUbicacion = (ImageButton) view.findViewById(R.id.imageTodos);

        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",13);
                startActivity(miIntent);
            }
        });




        btnUbica1 = (Button) view.findViewById(R.id.Ubicacion11);
        btnUbica2 = (Button) view.findViewById(R.id.Ubicacion21);
        btnUbica3 = (Button) view.findViewById(R.id.Ubicacion31);
        btnUbica4 = (Button) view.findViewById(R.id.Ubicacion41);
        btnUbica5 = (Button) view.findViewById(R.id.Ubicacion51);
        btnUbica6 = (Button) view.findViewById(R.id.Ubicacion61);
        btnUbica7 = (Button) view.findViewById(R.id.Ubicacion71);
        btnUbica8 = (Button) view.findViewById(R.id.Ubicacion81);
        btnUbica9 = (Button) view.findViewById(R.id.Ubicacion91);
        btnUbica10 = (Button) view.findViewById(R.id.Ubicacion101);
        btnUbica11 = (Button) view.findViewById(R.id.Ubicacion111);
        btnUbica12 = (Button) view.findViewById(R.id.Ubicacion112);


        btnUbica1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",1);
                startActivity(miIntent);
            }
        });

        btnUbica2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btnUbica3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",3);
                startActivity(miIntent);
            }
        });

        btnUbica4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",4);
                startActivity(miIntent);
            }
        });

        btnUbica9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",5);
                startActivity(miIntent);
            }
        });

        btnUbica4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",6);
                startActivity(miIntent);
            }
        });

        btnUbica12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",7);
                startActivity(miIntent);
            }
        });

        btnUbica6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",8);
                startActivity(miIntent);
            }
        });

        btnUbica3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",9);
                startActivity(miIntent);
            }
        });

        btnUbica7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",10);
                startActivity(miIntent);
            }
        });

        btnUbica8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",11);
                startActivity(miIntent);
            }
        });

        btnUbica10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapas.class);
                miIntent.putExtra("lugar",12);
                startActivity(miIntent);
            }
        });

        return view;
    }



}
