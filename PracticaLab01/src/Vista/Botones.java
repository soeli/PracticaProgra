/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Botones extends javax.swing.JPanel {

    /**
     * Creates new form Botones
     */
    public Botones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbt_Buscar = new javax.swing.JButton();
        jlb_Agregar = new javax.swing.JButton();
        jlb_Modificar = new javax.swing.JButton();
        jlb_Eliminar = new javax.swing.JButton();

        setLayout(null);

        jbt_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PracticaLab01/Buscar.png"))); // NOI18N
        jbt_Buscar.setActionCommand("Buscar");
        jbt_Buscar.setBorderPainted(false);
        jbt_Buscar.setContentAreaFilled(false);
        jbt_Buscar.setDefaultCapable(false);
        add(jbt_Buscar);
        jbt_Buscar.setBounds(220, 40, 131, 107);

        jlb_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PracticaLab01/agregar.png"))); // NOI18N
        jlb_Agregar.setActionCommand("Agregar");
        jlb_Agregar.setBorderPainted(false);
        jlb_Agregar.setContentAreaFilled(false);
        jlb_Agregar.setDefaultCapable(false);
        add(jlb_Agregar);
        jlb_Agregar.setBounds(10, 190, 131, 107);

        jlb_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PracticaLab01/Modificar.png"))); // NOI18N
        jlb_Modificar.setActionCommand("Modificar");
        jlb_Modificar.setBorderPainted(false);
        jlb_Modificar.setContentAreaFilled(false);
        jlb_Modificar.setDefaultCapable(false);
        add(jlb_Modificar);
        jlb_Modificar.setBounds(220, 180, 131, 107);

        jlb_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PracticaLab01/Borrar.png"))); // NOI18N
        jlb_Eliminar.setActionCommand("Eliminar");
        jlb_Eliminar.setBorderPainted(false);
        jlb_Eliminar.setContentAreaFilled(false);
        jlb_Eliminar.setDefaultCapable(false);
        add(jlb_Eliminar);
        jlb_Eliminar.setBounds(20, 350, 131, 107);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbt_Buscar;
    private javax.swing.JButton jlb_Agregar;
    private javax.swing.JButton jlb_Eliminar;
    private javax.swing.JButton jlb_Modificar;
    // End of variables declaration//GEN-END:variables
}
