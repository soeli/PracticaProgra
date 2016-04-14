/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosEstudiantes;
import Vista.RegistroEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author SOFIA ELIZONDO
 */
public class ControladorEstudiantes implements ActionListener{
    
   RegistroEstudiantes registroEstudiantes;
   MetodosEstudiantes metodos;
    
    public ControladorEstudiantes(RegistroEstudiantes registroEstudiantes)
    {
        this.registroEstudiantes=registroEstudiantes;
        metodos = new MetodosEstudiantes();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
        buscar();
        }
        
        
        if(e.getActionCommand().equals("Agregar"))
        {               
               if(metodos.consultarEstudiante(registroEstudiantes.devolverCedula()))
           {
               registroEstudiantes.mostrarMensaje("Estudiante registrado");
                System.out.println("Estudiante registrado");
                registroEstudiantes.estadoInicial();
            }
           else
            {
                metodos.agregarEstudiante(registroEstudiantes.devolverInformacion());
                registroEstudiantes.mostrarMensaje("Estudiante agregado");
                registroEstudiantes.estadoInicial();
           }
            
            System.out.println("Agregar");
            
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            if(metodos.consultarEstudiante(registroEstudiantes.devolverCedula()))
           {
               metodos.modificarEstudiante(registroEstudiantes.devolverInformacion());
               registroEstudiantes.mostrarMensaje("Estudiante modificado");
               registroEstudiantes.estadoInicial();
               
            }
           else
            {
                registroEstudiantes.mostrarMensaje("Estudiante no existe");
                System.out.println("No se encontró el estudiante");
                
           }
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            
            if(metodos.consultarEstudiante(registroEstudiantes.devolverCedula()))
           {
               metodos.eliminarEstudiante(registroEstudiantes.devolverInformacion());
               registroEstudiantes.mostrarMensaje("Estudiante eliminado");
               registroEstudiantes.estadoInicial();
            }
           else
            {
                registroEstudiantes.mostrarMensaje("Estudiante no existe");
                System.out.println("No se encontró el estudiante");
                registroEstudiantes.estadoInicial();
           }
            System.out.println("Eliminar");
        }
    
    }
    
    public void buscar()
    {

        if(metodos.consultarEstudiante(registroEstudiantes.devolverCedula()))
       {
           registroEstudiantes.mostrarInformacion(metodos.mostrarInformacion(registroEstudiantes.devolverCedula()));
           registroEstudiantes.habilitarModificar();
        }
       else
        {
            registroEstudiantes.mostrarMensaje("Estudiante no existe");
            System.out.println("No se encontró el estudiante");
            registroEstudiantes.habilitarAgregar();
       }
        System.out.println("Buscar");
    }
    
    
    
   
    
}
