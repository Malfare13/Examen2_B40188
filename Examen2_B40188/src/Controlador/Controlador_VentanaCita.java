/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCita;
import Vista.Ventana_Cita;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_VentanaCita implements ActionListener {

    Ventana_Cita ventana;
    MetodosCita metodos;

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
        if (e.getActionCommand().equals("Atender Siguiente Cliente")) {
            System.out.println("Siguiente Cliente");
            metodos.LlamarPrimeroYEliminar();
        }
        if (e.getActionCommand().equals("Opciones")) {
            if (ventana.devolverSeleccionComboBoxOpciones().equals("Agregar")) {
                System.out.println("Entra a agregar");
                metodos.crear(ventana.getCedula(), ventana.getNombre(), ventana.getEdad(), ventana.getFechaCita(), ventana.devolverSeleccionTipoCliente());
                ventana.mostrarMensaje("La cita se agrego de manera correcta");
                ventana.limpiarInterfaz();

            }
            if (ventana.devolverSeleccionComboBoxOpciones().equals("Modificar")) {
                metodos.modificar(ventana.devolverDatosModificar());
                ventana.mostrarMensaje("La cita se modifico correctamente");
                ventana.limpiarInterfaz();
            }
            if (ventana.devolverSeleccionComboBoxOpciones().equals("Cancelar")) {
                metodos.eliminarCita(ventana.getCedula());
                ventana.mostrarMensaje("La cita fue eliminada");
                ventana.limpiarInterfaz();
            }
            if (e.getActionCommand().equals("Reportes")) {
                if (ventana.devolverSeleccionComboBox().equals("Mostrar todas las citas")) {
                    ventana.imprimirEnElArea(metodos.imprimirLista());
                }
                if (ventana.devolverSeleccionComboBox().equals("Mostrar promedio de edades")) {

                }
                if (ventana.devolverSeleccionComboBox().equals("Mostrar cantidad de citas")) {
                    metodos.devolverCantidadCitas();
                }
            }
            if (e.getActionCommand().equals("Ordenar Mayor a Menor")) {
                metodos.mayorMenor();
                ventana.imprimirEnElArea(metodos.imprimirLista());
            }
            if (e.getActionCommand().equals("Ordenar Menor a Mayo")) {
                metodos.menorMayor();
                ventana.imprimirEnElArea(metodos.imprimirLista());
            }

        }
    }

}
