package controlador;

import java.util.ArrayList;
import modelo.CRUD;
import modelo.EstudianteObj;

public class OperacionesListaEstudianteCRUD extends CRUD {
    
    private ArrayList<EstudianteObj> objListaEstudiante;
    private EstudianteObj objEstudiante;

    public OperacionesListaEstudianteCRUD() {
            objListaEstudiante = new ArrayList<>();
    }
    
    @Override  
    public void create() {
            objListaEstudiante.add(objEstudiante);
    }

    @Override
    public void read() {
            EstudianteObj objAuxiliar;
        System.out.println("Valores del Crud, Read:");
        for (int i=0; i<objListaEstudiante.size(); i++) {
            objAuxiliar=objListaEstudiante.get(i);
            System.out.println("Matricula: " + objAuxiliar.getMatricula());
            System.out.println("Nombre: " + objAuxiliar.getNombre());
            System.out.println("Apellido Paterno: " + objAuxiliar.getApPaterno());
            System.out.println("Apellido Materno: " + objAuxiliar.getApMaterno());
            System.out.println("Edad: " + objAuxiliar.getEdad());
            System.out.println("------------------------------------");
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Implementar si es necesario
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); // Implementar si es necesario
    }

    // Getters y Setters
    public EstudianteObj getObjEstudiante() {
        return objEstudiante;
    }

    public void setObjEstudiante(EstudianteObj objEstudiante) {
        this.objEstudiante = objEstudiante;
    }

    public ArrayList<EstudianteObj> getObjListaEstudiante() {
        return objListaEstudiante;
    }
    
}
