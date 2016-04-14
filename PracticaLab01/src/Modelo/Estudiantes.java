/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Estudiantes {
    
    String cedula;
    String direccion;
    String nombre;

    public Estudiantes(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getInformacion()
    {
        return "Cédula: "+getCedula()+" Nombre completo: "+getNombre()+" Dirección: "+getDireccion();
    }
}
