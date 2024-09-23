/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.EstudianteObj;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;
/**
 *
 * @author juare
 */
public class ControladorConsultaEstudiante implements ActionListener {
 
    
    

    public ControladorConsultaEstudiante() {
          
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
       
    }
   /*public void actualizarTabla(ArrayList<EstudianteObj> listaEstudiante) {
         DefaultTableModel objModeloTabla = (DefaultTableModel) this.jTable1.getModel();
         objModeloTabla.setRowCount(0); 
         for (int i = 0; i < listaEstudiante.size(); i++) {
            
               EstudianteObj estudiante = listaEstudiante.get(i); 
               objModeloTabla.addRow(new Object[]{
               estudiante.getMatricula(),
               estudiante.getNombre(), 
               estudiante.getApPaterno(),
               estudiante.getApMaterno()});
         }
}
    public void consultaEstudiante() {
        EstudianteAlta alta = new EstudianteAlta();
        alta.setVisible(true);
    }*/
    
}
