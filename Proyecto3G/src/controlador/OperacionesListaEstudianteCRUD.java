package controlador;

import java.util.ArrayList;
import modelo.CRUD;
import modelo.EstudianteObj;

public class OperacionesListaEstudianteCRUD extends CRUD {
    
    private ArrayList<EstudianteObj> objListaEstudiante;
            EstudianteObj objEstudiante;

    public OperacionesListaEstudianteCRUD() {
            objListaEstudiante = new ArrayList<>();
    }
    
    @Override  
    public void create() {
            objListaEstudiante.add(objEstudiante);
    }

    @Override
    public ArrayList read() {
            return objListaEstudiante;
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
