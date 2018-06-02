package com.example.jose.proyectofutbol.models;

public class Fudbol {

    private String direccion;

    private String disciplina_deportiva;

    private String nombres_del_club_deportivo;

    private String representante_legal;

    private String telefono;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDisciplinaDeportiva() {
        return disciplina_deportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplina_deportiva = disciplinaDeportiva;
    }

    public String getNombresDelClubDeportivo() {
        return nombres_del_club_deportivo;
    }

    public void setNombresDelClubDeportivo(String nombresDelClubDeportivo) {
        this.nombres_del_club_deportivo = nombresDelClubDeportivo;
    }

    public String getRepresentanteLegal() {
        return representante_legal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representante_legal = representanteLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
