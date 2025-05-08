package com.example.exmane;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder> {
    private List<Alumnos> listaAlumnos;

    public AlumnoAdapter(List<Alumnos> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public static class AlumnoViewHolder extends RecyclerView.ViewHolder {
        TextView textNombre, textUsuario, textIp;

        public AlumnoViewHolder(View itemView) {
            super(itemView);
            textNombre = itemView.findViewById(R.id.txtNombre);
            textUsuario = itemView.findViewById(R.id.txtUsuario);
            textIp = itemView.findViewById(R.id.txtIp);
        }
    }

    @Override
    public AlumnoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new AlumnoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AlumnoViewHolder holder, int position) {
        Alumnos alumno = listaAlumnos.get(position);
        holder.textNombre.setText(alumno.getNombre());
        holder.textUsuario.setText("Usuario: " + alumno.getUsuario());
        holder.textIp.setText("IP: " + alumno.getIp());
    }

    @Override
    public int getItemCount() {
        return listaAlumnos.size();
    }
}
