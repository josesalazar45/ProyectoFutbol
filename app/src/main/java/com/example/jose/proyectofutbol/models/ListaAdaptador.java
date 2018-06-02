package com.example.jose.proyectofutbol.models;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jose.proyectofutbol.R;

import java.util.ArrayList;

public class ListaAdaptador  extends RecyclerView.Adapter<ListaAdaptador.ViewHolder>{
    private ArrayList<Fudbol> dataset;
    private Context context;

    public ListaAdaptador(Context context) {
        this.context = context;
        dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Fudbol p = dataset.get(position);


        holder.direccion.setText(p.getDireccion());
        holder.disciplina.setText(p.getDisciplinaDeportiva());
        holder.club.setText(p.getNombresDelClubDeportivo());
        holder.representante.setText(p.getRepresentanteLegal());
        holder.telefono.setText(p.getTelefono());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarLista(ArrayList<Fudbol> lista) {
        dataset.addAll(lista);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        private TextView direccion;
        private TextView disciplina;
        private TextView club;
        private TextView representante;
        private TextView telefono;



        public ViewHolder(View itemView)
        {
            super(itemView);
            direccion = (TextView) itemView.findViewById(R.id.altitud1);
            disciplina= (TextView) itemView.findViewById(R.id.fecha1);
            club= (TextView) itemView.findViewById(R.id.id1);
            representante= (TextView) itemView.findViewById(R.id.latitud1);
            telefono= (TextView) itemView.findViewById(R.id.longitu1);
        }
    }
}
