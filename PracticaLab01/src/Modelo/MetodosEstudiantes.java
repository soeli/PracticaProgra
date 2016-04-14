/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controlador.ControladorEstudiantes;
import Vista.RegistroEstudiantes;
import java.util.ArrayList;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class MetodosEstudiantes {
    
    
    private ArrayList <Estudiantes> arrayEstudiantes;
    String arregloInformacionConsultada[]=new String[2];
    
    ControladorEstudiantes controladorEstudiantes;
    
    public MetodosEstudiantes()
    {
        arrayEstudiantes=new ArrayList <Estudiantes>();
    }
    public void agregarEstudiante(String informacion[])
    {
        Estudiantes temporal=new Estudiantes(informacion[0], informacion[1], informacion[2]);
        arrayEstudiantes.add(temporal);
        
        
    }
    public String[] mostrarInformacion(String cedula)
    {
//        for(int contador=0;contador<arrayEstudiantes.size();contador++)
//        {
//            System.out.println(arrayEstudiantes.get(contador).getInformacion());
//        }
        if(this.consultarEstudiante(cedula))
        {
            
        }
        return this.arregloInformacionConsultada;
        
    }
    
    
    public boolean consultarEstudiante(String cedula)
    {
        boolean existe=false;
        
        for(int contador=0;contador<arrayEstudiantes.size();contador++)
        {
            if(arrayEstudiantes.get(contador).getCedula().equals(cedula))
            {
                arregloInformacionConsultada[0]=arrayEstudiantes.get(contador).getNombre();
                arregloInformacionConsultada[1]=arrayEstudiantes.get(contador).getDireccion();
                existe=true;
            }
        
        }
        return existe;
    
    }
    public void modificarEstudiante(String arreglo[])
    {
        for(int contador=0;contador<arrayEstudiantes.size();contador++)
        {
            if(arrayEstudiantes.get(contador).getCedula().equals(arreglo[0]))
            {
                arrayEstudiantes.get(contador).setNombre(arreglo[1]);
                arrayEstudiantes.get(contador).setDireccion(arreglo[2]);
            }
        }
    }
    public void eliminarEstudiante(String arreglo[])
    {
        for(int contador=0;contador<arrayEstudiantes.size();contador++)
        {
            if(arrayEstudiantes.get(contador).getCedula().equals(arreglo[0]))
            {
                arrayEstudiantes.remove(contador);
                
            }
        }
    }
    public String[] getArregloInformacion()
    {
        return this.arregloInformacionConsultada;
    }    
    
}
