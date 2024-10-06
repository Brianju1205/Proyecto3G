/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.ProfesorAlta;
import java.util.ArrayList;
import modelo.CRUD;

/**
 *
 * @author juare
 */
public class OperacionesProfesorLista extends CRUD{
    ArrayList<ProfesorAlta> objListaProfesor;
    ProfesorAlta objProfesor;

    public OperacionesProfesorLista() {
        objListaProfesor = new ArrayList();
    }

    @Override
    public void create() {
        objListaProfesor.add(objProfesor);
    }
    
    @Override
    public ArrayList read() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Getters y Setter de ObjProfesor 
    public ProfesorAlta getObjProfesor() {
        return objProfesor;
    }

    public void setObjProfesor(ProfesorAlta objProfesor) {
        this.objProfesor = objProfesor;
    }
    
}
