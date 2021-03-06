/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ControladorEstudiantes;



/**
 *
 * @author SOFIA ELIZONDO
 */
public class InformacionEstudiantes extends javax.swing.JPanel {

    /**
     * Creates new form InformacionEstudiantes
     */
    ControladorEstudiantes controlador;
    public InformacionEstudiantes() {
        initComponents();
    }
    
    public String[] devolverInformacion()
    {
        String arreglo[];
        arreglo=new String[3];
        arreglo[0]=this.jt_Cedula.getText();
        arreglo[1]=this.jt_Nombre.getText();
        arreglo[2]=this.jt_Direccion.getText();
        
        return arreglo;
    }
    public String devolverCedula()
    {
        return this.jt_Cedula.getText();
    }
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_Nombre.setText(arreglo[0]);
        this.jt_Direccion.setText(arreglo[1]);
        
    }
    
    public void blanquear()
    {
        this.jt_Nombre.setText("");
        this.jt_Cedula.setText("");
        this.jt_Direccion.setText("");
    }

    
    public void habilitarAgregar()
    {
        this.jt_Cedula.setEnabled(true);
        this.jt_Direccion.setEnabled(true);
        this.jt_Nombre.setEnabled(true);
    }
    
    public void habilitarModificar()
    {
        this.jt_Cedula.setEnabled(false);
        this.jt_Direccion.setEnabled(true);
        this.jt_Nombre.setEnabled(true);
    }
    
    
    public void estadoInicial()
    {
        this.jt_Cedula.setEnabled(true);
        this.jt_Direccion.setEnabled(false);
        this.jt_Nombre.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jt_Cedula = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Direccion = new javax.swing.JTextField();
        jl_Cedula = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_DIreccion = new javax.swing.JLabel();

        setOpaque(false);

        jt_Cedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jt_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_CedulaKeyPressed(evt);
            }
        });

        jl_Cedula.setText("Cédula");

        jl_Nombre.setText("Nombre");

        jl_DIreccion.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jl_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_DIreccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_Direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jl_Cedula))
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_DIreccion))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jt_CedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_CedulaKeyPressed
        if(evt.getKeyCode()==10)
        {
            this.controlador.buscar();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_CedulaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_DIreccion;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Direccion;
    private javax.swing.JTextField jt_Nombre;
    // End of variables declaration//GEN-END:variables
}
