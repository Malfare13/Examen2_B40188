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
public class MetodosCita {

    Cita primero;
    String arregloInformacion[]=new String[4];

    public MetodosCita() {
    }

    public void crear(String cedula, String nombre, String edad, String fechaCita, String tipoCliente) {
        if (primero == null) {
            primero = new Cita(cedula, nombre, edad, fechaCita, tipoCliente, null);
        } else {
            if (tipoCliente.equals("Regular")) {
                Cita auxiliar = primero;
                while (auxiliar.getSiguiente() != null) {
                    auxiliar = auxiliar.getSiguiente();
                }
                auxiliar.setSiguiente(new Cita(cedula, nombre, edad, fechaCita, tipoCliente, null));
            }
            if (tipoCliente.equals("Preferencial")) {
                primero = new Cita(cedula, nombre, edad, fechaCita, tipoCliente, null);
            }

        }
    }


    public String imprimirLista() {
        Cita auxiliar = primero;
        String valores = "";
        while (auxiliar != null) {
            valores += "Cedula: " + auxiliar.getCedula() + " ";
            valores += "Nombre: " + auxiliar.getNombre() + " ";
            valores += "Edad: " + auxiliar.getEdad();
            valores += "Fecha Cita: " + auxiliar.getFechaCita() + " ";
            valores += "Tipo Cliente: " + auxiliar.getTipoCliente() + " ";
            valores += "\n";
            auxiliar = auxiliar.getSiguiente();
        }
        return valores;
    }

    public void modificar(String[] arreglo) {
        Cita temporal = primero;
        while (!temporal.getCedula().equals(arreglo[0])) {//mientras sea diferente al arreglo pase al siguiente
            temporal = temporal.getSiguiente();
        }
        temporal.setNombre(arreglo[1]);
        temporal.setEdad(arreglo[2]);
        temporal.setFechaCita(arreglo[3]);
        temporal.setTipoCliente(arreglo[4]);
    }

    public int devolverCantidadCitas() {
        int contador = 1;
        Cita temporal = primero;
        while (temporal.getSiguiente() != null) {
            contador++;
            temporal = temporal.getSiguiente();
        }

        return contador;
    }

    public void mayorMenor() {
        System.out.println("Ingresa menor a mayor");
        int cantidadCitas = devolverCantidadCitas();
        Cita temporal = primero;
        String datoTemporal;
        for (int contador = 0; contador < cantidadCitas; contador++) {

            temporal = primero;
            while (temporal.getSiguiente() != null) {

                if (Integer.parseInt(temporal.getEdad()) < Integer.parseInt((temporal.getSiguiente().getEdad()))) {

                    datoTemporal = temporal.getEdad();
                    temporal.setEdad(temporal.getSiguiente().getEdad());
                    temporal.getSiguiente().setEdad(datoTemporal);
                }
                temporal = temporal.getSiguiente();
            }
        }
    }

    public void menorMayor() {
        System.out.println("Ingresa menor a mayor");
        int cantidadCitas = devolverCantidadCitas();
        Cita temporal = primero;
        for (int contador = 0; contador < cantidadCitas; contador++) {
            System.out.println(" for metodo menor mayor");
            while (temporal.getSiguiente() != null) {
                if (Integer.parseInt(temporal.getEdad()) > Integer.parseInt((temporal.getSiguiente().getEdad()))) {
                    String datoTemporal = temporal.getEdad();
                    temporal.setEdad(temporal.getSiguiente().getEdad());
                    temporal.getSiguiente().setEdad(datoTemporal);
                }
                temporal = temporal.getSiguiente();
            }
        }
    }
    
    public void LlamarPrimeroYEliminar(){
        primero=primero.getSiguiente();
    }
    
     public void eliminarCita(String cedula){
     
     
     if(primero.getCedula().equals(cedula))
     {
         primero=primero.getSiguiente();
     }
     Cita temporal=primero;
     
     while(temporal!=null)
     {  
         if(temporal.getSiguiente().getCedula().equals(cedula))
         {
             temporal=temporal.getSiguiente().getSiguiente();
         }
     }
     
}
     
    
    public boolean buscar(String cedula){
        Cita temporal=primero;
        boolean datoEncontrado= false;
        while(!temporal.getCedula().equals(cedula)){
            datoEncontrado=false;
        }
        datoEncontrado=true;
        return datoEncontrado;
    }
    

    
     

}
