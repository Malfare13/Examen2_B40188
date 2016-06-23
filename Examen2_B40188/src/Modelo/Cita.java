/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Angelica
 */
public class Cita {

    /**
     * @param args the command line arguments
     */
    private String cedula;
    private String nombre;
    private String edad;
    private String fechaCita;
    private Cita siguiente;
    private String tipoCliente;

    public Cita(String cedula, String nombre, String edad,String fechaCita,  String tipoCliente, Cita siguiente) {
        this.cedula= cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaCita = fechaCita;
        this.siguiente = siguiente;
        this.tipoCliente= tipoCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Cita getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cita siguiente) {
        this.siguiente = siguiente;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
    
}
