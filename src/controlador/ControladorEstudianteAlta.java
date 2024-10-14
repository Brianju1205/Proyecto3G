/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Estudiante;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;


/**
 *
 * @author juare
 * 
 */
public class ControladorEstudianteAlta implements ActionListener  {
    EstudianteAlta objEstudianteAlta;
    OperacionesListaEstudianteCRUD objListaEstudiante;
    Validador objValidador;
    Estudiante objEstudiante;
    ArrayList<Estudiante> listaEst;
    EstudianteConsulta objEstudianteConsulta;
    OperacionesBDEstudiante objOperacionesBD;
    ControladorConsultaEstudiante objConsulta;
    
    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta){
        listaEst = new ArrayList();
        objValidador = new Validador();
        objOperacionesBD=new OperacionesBDEstudiante();
        this.objEstudianteAlta = objEstudianteAlta;
        this.objEstudianteAlta.jButton1.addActionListener(this);
        this.objEstudianteAlta.jButton2Consulta.addActionListener(this);
        //jButton1 se paso a publico para agregarle su escuchador   
        this.objConsulta =objConsulta;
       
        objListaEstudiante = new OperacionesListaEstudianteCRUD();
        //objEstudianteConsulta = new EstudianteConsulta();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==objEstudianteAlta.jButton1){
            
            System.out.println("Escuchador del boton");
            
            if (!objValidador.validaCajaTextoEntero(objEstudianteAlta.getjTextField1())) {
                return;
            }
            if (!objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField2())) {
                return;
            }
            if (!objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField3())) {
                return;
            }
            if (!objValidador.validaCajaTextoCadena(objEstudianteAlta.getjTextField4())) {
                return;
            }
            if (!objValidador.validaCajaTextoEnteroEdad(objEstudianteAlta.getjTextField5())) {
                return;
            }
        objEstudiante = new Estudiante();
       
        objEstudiante.setMatricula(Integer.parseInt(objEstudianteAlta.getjTextField1().getText()));
        objEstudiante.setNombre(objEstudianteAlta.getjTextField2().getText());
        objEstudiante.setApPaterno(objEstudianteAlta.getjTextField3().getText());
        objEstudiante.setApMaterno(objEstudianteAlta.getjTextField4().getText());
        objEstudiante.setEdad(Integer.parseInt(objEstudianteAlta.getjTextField5().getText()));
        
        objListaEstudiante.setObjEstudiante(objEstudiante);
        listaEst.add(objEstudiante);
        objListaEstudiante.create(); 
        this.limpiar();
        objOperacionesBD.setObjEstudisnte(objEstudiante);
        objOperacionesBD.create();
        
        System.out.println("Valores del Objeto");
        System.out.println("Matricula: " + objEstudiante.getMatricula());
        
        }
        if(e.getSource()==objEstudianteAlta.jButton2Consulta){
             if(objEstudianteConsulta == null){
               // objEstudianteConsulta = new EstudianteConsulta(this.objListaEstudiante);
                objEstudianteConsulta = new EstudianteConsulta();
                objConsulta = new ControladorConsultaEstudiante(objEstudianteConsulta, objListaEstudiante);
                objEstudianteConsulta.setSize(500, 500);
                objEstudianteConsulta.setVisible(true);
                }else{
                    objConsulta.llenado();
                    objEstudianteConsulta.setVisible(true);
                }
        }
        
    }

     public void limpiar(){
        objEstudianteAlta.getjTextField1().setText("");
        objEstudianteAlta.getjTextField2().setText("");
        objEstudianteAlta.getjTextField3().setText("");
        objEstudianteAlta.getjTextField4().setText("");
        objEstudianteAlta.getjTextField5().setText("");
    }

   
}
