/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodosCita;
import Vista.Ventana_Reportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angelica
 */
public class Controlador_VentanaReporte implements ActionListener{
    
    Ventana_Reportes ventana;
    MetodosCita metodos;

    public Controlador_VentanaReporte(Ventana_Reportes ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Reportes")){
            if(ventana.devolverSeleccionComboBox().equals("Mostrar todas las citas")){
                ventana.imprimirEnElArea(metodos.imprimirLista());
            }
            if(ventana.devolverSeleccionComboBox().equals("Mostrar promedio de edades")){
                
            }
            if(ventana.devolverSeleccionComboBox().equals("Mostrar cantidad de citas")){
                metodos.devolverCantidadCitas();
            }
        }
        if(e.getActionCommand().equals("Ordenar Mayor a Menor")){
            metodos.mayorMenor();
           ventana.imprimirEnElArea(metodos.imprimirLista());
        }
        if(e.getActionCommand().equals("Ordenar Menor a Mayo")){
            metodos.menorMayor();
            ventana.imprimirEnElArea(metodos.imprimirLista());
        }
    }
    
    
    
}
