package com.example.exmane;

public class Alumnos {

    public int id;

    public String nombre;
    public String nombreUsusario;
    public String ip;

    public Alumnos(int id, String nombre,String usuario, String ip){
        this.id = id;
        this.nombre = nombre;
        this.nombreUsusario = usuario;
        this.ip = ip;
    }

    public String getNombre() { return nombre; }
    public String getUsuario() { return nombreUsusario; }
    public String getIp() { return ip; }

}
