/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Vista.RegistroEstudiantes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class ControladorEstudiantes implements ActionListener{
    
   RegistroEstudiantes registroEstudiantes;
    
    public ControladorEstudiantes(RegistroEstudiantes registroEstudiantes)
    {
        this.registroEstudiantes=registroEstudiantes;
       // metodos = new MetodosEstudiantes();
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Buscar"))
        {
//            if(metodos.consultarEstudiante(mantenimientoEstudiantes.devolverCedula()))
//            {
//                mantenimientoEstudiantes.mostrarInformacion(metodos.getArregloInformacion());
//            }
//            else
//            {
//                System.out.println("No se encontró el curso");
//            }
            System.out.println("Buscar");
        }
        if(e.getActionCommand().equals("Agregar"))
        {
           System.out.println("Agregar");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            System.out.println("Eliminar");
        }
    
    }
    
}
