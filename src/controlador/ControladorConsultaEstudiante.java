/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import controlador.OperacionesListaEstudianteCRUD;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;
/**
 *
 * @author juare
 */
public class ControladorConsultaEstudiante implements ActionListener {
 
    EstudianteConsulta objEstudianteConsulta;
    OperacionesListaEstudianteCRUD ObjEstudianteLista;
    Estudiante objEstudiante;
    OperacionesListaEstudianteCRUD objListaEst;
    
    public ControladorConsultaEstudiante(EstudianteConsulta objEstudianteConsulta,OperacionesListaEstudianteCRUD objListaEst) {
        this.objEstudianteConsulta = objEstudianteConsulta;
        this.ObjEstudianteLista= new OperacionesListaEstudianteCRUD();
        this.objListaEst = objListaEst;
        this.objEstudianteConsulta.jButton2.addActionListener(this);
       // this.objEstudianteConsulta.jTable1.add(objEstudianteConsulta);
        this.objEstudianteConsulta.jButton1Alta.addActionListener(this);         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.objEstudianteConsulta.jButton2) {
            System.out.println("Escuchador del boton Agregar");
            llenado();       
        }
        if (e.getSource() == this.objEstudianteConsulta.jButton1Alta) {
             EstudianteAlta alta = new EstudianteAlta();
             alta.setSize(500,500);
             alta.setVisible(true);
             System.out.println("Escuchador volver a alta");
                   
        }
       
    }

    public void consultaEstudiante() {
        EstudianteAlta alta = new EstudianteAlta();
        alta.setSize(500,500);
        alta.setVisible(true);
    }
    public void llenado(){
        DefaultTableModel modelo = (DefaultTableModel) objEstudianteConsulta.jTable1.getModel();
        modelo.setRowCount(0);
        ArrayList<Estudiante> objListaEstudianteLocal =  objListaEst.read();
        
        for(int i=0;i<objListaEstudianteLocal.size(); i++){
            modelo.addRow(new Object[]{objListaEstudianteLocal.get(i).getMatricula(), objListaEstudianteLocal.get(i).getNombre(),
                objListaEstudianteLocal.get(i).getApPaterno(), objListaEstudianteLocal.get(i).getApMaterno(),
                objListaEstudianteLocal.get(i).getEdad()});
        }
            
    }
    
    
}
