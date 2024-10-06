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
import modelo.EstudianteObj;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;
/**
 *
 * @author juare
 */
public class ControladorConsultaEstudiante implements ActionListener {
 
    EstudianteConsulta objEstudianteConsulta;
    OperacionesListaEstudianteCRUD ObjEstudianteLista;
    EstudianteObj objEstudiante;
    public ControladorConsultaEstudiante(EstudianteConsulta objEstudianteConsulta) {
        this.objEstudianteConsulta = objEstudianteConsulta;
        this.ObjEstudianteLista= new OperacionesListaEstudianteCRUD();
        this.objEstudianteConsulta.jButton2.addActionListener(this);
       // this.objEstudianteConsulta.jTable1.add(objEstudianteConsulta);
        this.objEstudianteConsulta.jButton1Alta.addActionListener(this);
       
            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.objEstudianteConsulta.jButton2) {
            System.out.println("Escuchador del boton Agregar");
           /* DefaultTableModel objModeloTable = (DefaultTableModel) objEstudianteConsulta.jTable1.getModel(); //convertir por eso va lo de 
            objModeloTable.addRow(new Object[]{"1", "1", "1", "1"});*/
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
    
    
}
