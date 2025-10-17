package com.example.taller;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taller.adapter.EquipoAdapter;
import com.example.taller.modelo.Equipo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EquipoAdapter adapter;
    private List<Equipo> equiposList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewEquipos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        equiposList = obtenerEquipos();
        adapter = new EquipoAdapter(equiposList, this);
        recyclerView.setAdapter(adapter);
    }

    private List<Equipo> obtenerEquipos() {
        List<Equipo> equipos = new ArrayList<>();

        equipos.add(new Equipo(1, "Real Madrid", "Madrid", "1902",
                "Santiago Bernabéu", "Xabi Alonso",
                R.drawable.real_madrid,
                "El Real Madrid es uno de los clubes más exitosos del fútbol mundial con 15 Champions League."));

        equipos.add(new Equipo(2, "FC Barcelona", "Barcelona", "1899",
                "Camp Nou", "Hansi Flick",
                R.drawable.barcelona,
                "El Barcelona ha ganado 26 La Liga títulos y es conocido por su estilo de juego ofensivo."));

        equipos.add(new Equipo(3, "Atlético Madrid", "Madrid", "1903",
                "Metropolitano", "Diego Simeone",
                R.drawable.atletico_madrid,
                "El Atlético Madrid es conocido por su defensa sólida y su estilo de juego intenso."));

        equipos.add(new Equipo(4, "Valencia CF", "Valencia", "1919",
                "Mestalla", "Carlos Corberán ",
                R.drawable.valencia,
                "El Valencia CF es uno de los clubes históricos de España con 2 Champions League."));

        equipos.add(new Equipo(5, "Sevilla FC", "Sevilla", "1890",
                "Ramón Sánchez Pizjuán", "Matías Almeyda",
                R.drawable.sevilla,
                "El Sevilla es el equipo más ganador de la Europa League con 6 títulos."));

        equipos.add(new Equipo(6, "Real Sociedad", "San Sebastián", "1909",
                "Reale Arena", "Sergio  Ramos",
                R.drawable.real_sociedad,
                "La Real Sociedad es conocida por jugar al fútbol ofensivo y formar buenos jugadores."));

        return equipos;
    }
}