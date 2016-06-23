/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCita;
import Vista.Ventana_Cita;
import Vista.Ventana_Reportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_VentanaCita implements ActionListener {

    Ventana_Cita ventana;
    MetodosCita metodos;
    Ventana_Reportes ventanaReportes;

    public Controlador_VentanaCita(Ventana_Cita ventana) {
        this.ventana = ventana;
        metodos = new MetodosCita();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Buscar")) {
            System.out.println("Entra a buscar");
            metodos.buscar(ventana.getCedula());
            ventana.deshabilitarCedula();

        }
        if(e.getActionCommand().equals("Opciones")){
            if(ventana.devolverSeleccionComboBoxOpciones().equals("Agregar")){
                System.out.println("Entra a agregar");   
                    metodos.crear(ventana.getCedula(), ventana.getNombre(), ventana.getEdad(),ventana.getFechaCita(), ventana.devolverSeleccionTipoCliente());
                    ventana.mostrarMensaje("La cita se agrego de manera correcta");
                    ventana.limpiarInterfaz();
                
            }
            if(ventana.devolverSeleccionComboBoxOpciones().equals("Modificar")){
                metodos.modificar(ventana.devolverDatosModificar());
                ventana.mostrarMensaje("La cita se modifico correctamente");
                ventana.limpiarInterfaz();
            }
            if(ventana.devolverSeleccionComboBoxOpciones().equals("Cancelar")){
                metodos.eliminarCita(ventana.getCedula());
                ventana.mostrarMensaje("La cita fue eliminada");
                ventana.limpiarInterfaz();
            }
            if(ventana.devolverSeleccionComboBoxOpciones().equals("Reportes")){
                ventanaReportes=new Ventana_Reportes();
                ventanaReportes.setVisible(true);
            }            
        }
    }

}
