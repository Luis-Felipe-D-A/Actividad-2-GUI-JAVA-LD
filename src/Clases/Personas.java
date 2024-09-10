package Clases;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    
    
    private List<String> listaPersonas = new ArrayList<>();


    public Personas() {
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public void almacenarPersona(String nombre, String apellido, String direccion, int edad) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDireccion(direccion);
        this.setEdad(edad);
        
        listaPersonas.add("Nombre: " + nombre + ", Apellido: " + apellido + 
                          ", Dirección: " + direccion + ", Edad: " + edad);
    }
    
public void MostrarPersonas() {
    for (int i = 0; i < listaPersonas.size(); i++) {
        System.out.println(listaPersonas.get(i));
    }
}


    
    public List<String> getListaPersonas() {
        return listaPersonas;
    }
}
