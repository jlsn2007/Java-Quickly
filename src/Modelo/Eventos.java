package Modelo;

import java.sql.*;
import java.util.UUID;

public class Eventos {
    
    String UUID_Evento;
    String UUID_Usuario;
    String lugar;
    String descripcion;
    String nombre;
    String fecha;
    String hora;

    public String getUUID_Evento() {
        return UUID_Evento;
    }

    public void setUUID_Evento(String UUID_Evento) {
        this.UUID_Evento = UUID_Evento;
    }

    public String getUUID_Usuario() {
        return UUID_Usuario;
    }

    public void setUUID_Usuario(String UUID_Usuario) {
        this.UUID_Usuario = UUID_Usuario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
