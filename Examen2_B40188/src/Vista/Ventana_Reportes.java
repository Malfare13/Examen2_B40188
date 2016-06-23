/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_VentanaReporte;

/**
 *
 * @author Angelica
 */
public class Ventana_Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Reportes
     */
    Controlador_VentanaReporte controlador;
    
    public Ventana_Reportes() {
        initComponents();
        controlador= new Controlador_VentanaReporte(this);
        this.setLocationRelativeTo(null);
    }
    
    public void agregarEventos(){
        this.jcb_Reportes.addActionListener(controlador);
        this.btn_MayorAMenor.addActionListener(controlador);
        this.btn_MenorAMayor.addActionListener(controlador);
    }
    
    public String devolverSeleccionComboBox() {
        String ordenSeleccionado = "";
        if (this.jcb_Reportes.getSelectedItem().toString().equals("Mostrar todas las citas")) {
            ordenSeleccionado = "Toda la lista";
        }
        if (this.jcb_Reportes.getSelectedItem().toString().equals("Mostrar promedio de edades")) {
            ordenSeleccionado = "Promedio de edades";
        }
        if (this.jcb_Reportes.getSelectedItem().toString().equals("Mostrar cantidad de citas")) {
            ordenSeleccionado = "Cantidad de citas";
        }
        return ordenSeleccionado;
    }
    
    public void limpiarArea() {
        this.jta_Reportes.setText("");
    }
    
    public void imprimirEnElArea(String texto) {
        this.jta_Reportes.setText(texto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_Reportes = new javax.swing.JTextArea();
        jcb_Reportes = new javax.swing.JComboBox<>();
        btn_MenorAMayor = new javax.swing.JButton();
        btn_MayorAMenor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Reportes");

        jta_Reportes.setColumns(20);
        jta_Reportes.setRows(5);
        jScrollPane1.setViewportView(jta_Reportes);

        jcb_Reportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar todas las citas", "Mostrar promedio de edades", "Mostrar cantidad de citas" }));
        jcb_Reportes.setActionCommand("Reportes");

        btn_MenorAMayor.setText("Ordenar Menor a Mayor");

        btn_MayorAMenor.setText("Ordenar Mayor a Menor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_MayorAMenor)
                                .addGap(52, 52, 52)
                                .addComponent(btn_MenorAMayor))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcb_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jcb_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MayorAMenor)
                    .addComponent(btn_MenorAMayor))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MayorAMenor;
    private javax.swing.JButton btn_MenorAMayor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_Reportes;
    private javax.swing.JTextArea jta_Reportes;
    // End of variables declaration//GEN-END:variables
}
