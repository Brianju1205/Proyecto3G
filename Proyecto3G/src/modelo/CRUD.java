/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author juare
 */
//son las reglas que sirven como intermediarios
public abstract class CRUD {
    
    public abstract void create();
    public abstract ArrayList read();
    public abstract void update();
    public abstract void delete();
    
    
}
