/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juare
 */
public class Profesor {
    
   private String numPlaza;
   private String nombre;
   private String apePat;
   private String apeMate;
   private int    edad;

    public Profesor(String numPlaza, String nombre, String apePat, String apeMate, int edad) {
        this.numPlaza = numPlaza;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMate = apeMate;
        this.edad = edad;
    }
   
   
    public String getNumPlaza() {
        return numPlaza;
    }

    public void setNumPlaza(String numPlaza) {
        this.numPlaza = numPlaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMate() {
        return apeMate;
    }

    public void setApeMate(String apeMate) {
        this.apeMate = apeMate;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
    
}
