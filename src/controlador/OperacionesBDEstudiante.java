/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CRUD;
import modelo.Estudiante;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author juare
 */
public class OperacionesBDEstudiante extends CRUD{

    Estudiante objEstudiante;
    JavaPostgresSQL objJavaPostgresSQL;
    
    public OperacionesBDEstudiante() {
        objJavaPostgresSQL =new JavaPostgresSQL();
        objJavaPostgresSQL.connectDatabase();
    }
    
    @Override
    public void create() {
        try {
            
            objJavaPostgresSQL.stmt.execute("insert into estudiante values "
                    + "("+objEstudiante.getMatricula()+",'"+objEstudiante.getNombre()+"');"); 
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBDEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList read() {
        ArrayList<Estudiante> objListaEstudiante=new ArrayList();
        Estudiante objEstudiante;
        
        try {
            ResultSet resultado=objJavaPostgresSQL.stmt.executeQuery("select * from estudiante");
            while(resultado.next()){
                objEstudiante = new Estudiante();
                objEstudiante.setMatricula(resultado.getInt("matricula"));
                objEstudiante.setNombre(resultado.getString("nombre"));
                
                
                objListaEstudiante.add(objEstudiante);
                System.out.println(""+resultado.getInt("matricula"));
                System.out.println(""+resultado.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBDEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objListaEstudiante;
    }
   

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Estudiante getObjEstudisnte() {
        return objEstudiante;
    }

    public void setObjEstudisnte(Estudiante objEstudisnte) {
        this.objEstudiante = objEstudisnte;
    }
    
    
}
