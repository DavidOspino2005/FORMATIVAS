package com.example.taller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taller.modelo.Equipo;

public class DetallePantalla extends AppCompatActivity {

    private ImageView imagenDetalle;
    private TextView nombreDetalle, descripcionDetalle, fundacionDetalle;
    private TextView estadioDetalle, entrenadordDetalle, ciudadDetalle;
    private Button botonVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        // Inicializar vistas
        imagenDetalle = findViewById(R.id.imagenDetalle);
        nombreDetalle = findViewById(R.id.nombreDetalle);
        descripcionDetalle = findViewById(R.id.descripcionDetalle);
        fundacionDetalle = findViewById(R.id.fundacionDetalle);
        estadioDetalle = findViewById(R.id.estadioDetalle);
        entrenadordDetalle = findViewById(R.id.entrenadordDetalle);
        ciudadDetalle = findViewById(R.id.ciudadDetalle);
        botonVolver = findViewById(R.id.botonVolver);

        // Obtener el equipo enviado desde MainActivity
        Equipo equipo = (Equipo) getIntent().getSerializableExtra("equipo");

        if (equipo != null) {
            // Llenar los datos en la pantalla
            imagenDetalle.setImageResource(equipo.getImagen());
            nombreDetalle.setText(equipo.getNombre());
            descripcionDetalle.setText(equipo.getDescripcion());
            fundacionDetalle.setText("Fundación: " + equipo.getFundacion());
            estadioDetalle.setText("Estadio: " + equipo.getEstadio());
            entrenadordDetalle.setText("Entrenador: " + equipo.getEntrenador());
            ciudadDetalle.setText("Ciudad: " + equipo.getCiudad());
        }

        // Botón volver
        botonVolver.setOnClickListener(v -> {
            finish(); // Cierra esta actividad y regresa a MainActivity
        });
    }
}