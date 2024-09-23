/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.EstudianteObj;
import vista.EstudianteAlta;
import vista.EstudianteConsulta;


/**
 *
 * @author juare
 */
public class ControladorEstudianteAlta implements ActionListener  {
    EstudianteAlta objEstudianteAlta;
    OperacionesListaEstudianteCRUD objListaEstudiante;
    Validador objValidador;
    EstudianteObj objEstudiante;
    ArrayList<EstudianteObj> listaEstudiante;
    
    public ControladorEstudianteAlta(EstudianteAlta objEstudianteAlta){
        listaEstudiante = new ArrayList();
        this.objEstudianteAlta = objEstudianteAlta;
        this.objEstudianteAlta.jButton1.addActionListener(this);
        //jButton1 se paso a publico para agregarle su escuchador
        objValidador = new Validador();
        objListaEstudiante = new OperacionesListaEstudianteCRUD();
        
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
        objEstudiante = new EstudianteObj();
        /*System.out.println("Escuchador del boton");
        System.out.println("Matricula: " + Integer.parseInt(objEstudianteAlta.getjTextField1().getText()));
        System.out.println("Nombre: " + objEstudianteAlta.getjTextField2().getText());
        System.out.println("Apellido paterno: " + objEstudianteAlta.getjTextField3().getText());
        System.out.println("Apellido materno: " + objEstudianteAlta.getjTextField4().getText());
        System.out.println("Edad: " + Integer.parseInt(objEstudianteAlta.getjTextField5().getText()));*/
         
        objEstudiante.setMatricula(Integer.parseInt(objEstudianteAlta.getjTextField1().getText()));
        objEstudiante.setNombre(objEstudianteAlta.getjTextField2().getText());
        objEstudiante.setApPaterno(objEstudianteAlta.getjTextField3().getText());
        objEstudiante.setApMaterno(objEstudianteAlta.getjTextField4().getText());
        objEstudiante.setEdad(Integer.parseInt(objEstudianteAlta.getjTextField5().getText()));
        this.limpiar();
        listaEstudiante.add(objEstudiante);
        
        this.objListaEstudiante.setObjEstudiante(objEstudiante);
        this.objListaEstudiante.create();  
        this.objListaEstudiante.read();
        
       // this.imprimirLista();

        System.out.println("Valores del Objeto");
        System.out.println("Matricula: " + objEstudiante.getMatricula());
         
         EstudianteConsulta consulta = new EstudianteConsulta();
         ControladorConsultaEstudiante ControladorConsulta= new ControladorConsultaEstudiante();
         consulta.actualizarTabla(listaEstudiante);
         //ControladorConsulta.actualizarTabla(listaEstudiante);
         consulta.setVisible(true);
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
