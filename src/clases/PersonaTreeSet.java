package clases;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alejandro
 */
public class PersonaTreeSet implements Comparable<PersonaTreeSet>{

    private int id;
    private String nombre;
    private String apellido;

    public PersonaTreeSet(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(PersonaTreeSet o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "PersonaTreeSet{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    

}
