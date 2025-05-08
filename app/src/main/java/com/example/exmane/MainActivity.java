package com.example.exmane;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ArrayList<Alumnos> alumnos = new ArrayList<>();

        alumnos.add(new Alumnos(1, "Alexis Diaz", "AlexisDiaz", "197.168.72.2"));
        alumnos.add(new Alumnos(2, "Katherine Guardado", "KatGuardado", "197.168.72.3"));
        alumnos.add(new Alumnos(3, "Angel Ruiz", "AngelRuiz", "197.168.72.4"));
        alumnos.add(new Alumnos(4, "Laura Méndez", "LauraM", "197.168.72.5"));
        alumnos.add(new Alumnos(5, "Carlos Pérez", "CarlosP", "197.168.72.6"));
        alumnos.add(new Alumnos(6, "María Torres", "MariaT", "197.168.72.7"));
        alumnos.add(new Alumnos(7, "David Hernández", "DavidH", "197.168.72.8"));
        alumnos.add(new Alumnos(8, "Sandra López", "SandraL", "197.168.72.9"));
        alumnos.add(new Alumnos(9, "Jorge Castillo", "JorgeC", "197.168.72.10"));
        alumnos.add(new Alumnos(10, "Isabel Romero", "IsaR", "197.168.72.11"));


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AlumnoAdapter adapter = new AlumnoAdapter(alumnos);
        recyclerView.setAdapter(adapter);

    }
}