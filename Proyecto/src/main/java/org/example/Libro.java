package org.example;

public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponibilidad;

    public Libro(int id, String titulo, String autor, String categoria, Boolean disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
}
