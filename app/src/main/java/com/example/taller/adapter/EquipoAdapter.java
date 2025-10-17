package com.example.taller.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.taller.R;
import com.example.taller.DetallePantalla;
import com.example.taller.modelo.Equipo;

import java.util.List;

public class EquipoAdapter extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {

    private List<Equipo> equipos;
    private Context context;

    public EquipoAdapter(List<Equipo> equipos, Context context) {
        this.equipos = equipos;
        this.context = context;
    }

    @Override
    public EquipoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_equipo, parent, false);
        return new EquipoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EquipoViewHolder holder, int position) {
        Equipo equipo = equipos.get(position);

        holder.nombreEquipo.setText(equipo.getNombre());
        holder.ciudadEquipo.setText(equipo.getCiudad());
        holder.imagenEquipo.setImageResource(equipo.getImagen());

        holder.botonDetalle.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetallePantalla.class);
            intent.putExtra("equipo", equipo);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return equipos.size();
    }

    public static class EquipoViewHolder extends RecyclerView.ViewHolder {
        ImageView imagenEquipo;
        TextView nombreEquipo;
        TextView ciudadEquipo;
        Button botonDetalle;

        public EquipoViewHolder(View itemView) {
            super(itemView);
            imagenEquipo = itemView.findViewById(R.id.imagenEquipo);
            nombreEquipo = itemView.findViewById(R.id.nombreEquipo);
            ciudadEquipo = itemView.findViewById(R.id.ciudadEquipo);
            botonDetalle = itemView.findViewById(R.id.botonDetalle);
        }
    }
}