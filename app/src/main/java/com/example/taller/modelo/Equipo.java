package com.example.taller.modelo;

import java.io.Serializable;

public class Equipo implements Serializable {
    private int id;
    private String nombre;
    private String ciudad;
    private String fundacion;
    private String estadio;
    private String entrenador;
    private int imagen;
    private String descripcion;

    public Equipo(int id, String nombre, String ciudad, String fundacion,
                  String estadio, String entrenador, int imagen, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fundacion = fundacion;
        this.estadio = estadio;
        this.entrenador = entrenador;
        this.imagen = imagen;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getFundacion() { return fundacion; }
    public void setFundacion(String fundacion) { this.fundacion = fundacion; }

    public String getEstadio() { return estadio; }
    public void setEstadio(String estadio) { this.estadio = estadio; }

    public String getEntrenador() { return entrenador; }
    public void setEntrenador(String entrenador) { this.entrenador = entrenador; }

    public int getImagen() { return imagen; }
    public void setImagen(int imagen) { this.imagen = imagen; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}