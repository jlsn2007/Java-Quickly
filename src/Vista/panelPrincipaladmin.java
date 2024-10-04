package Vista;

import Controlador.ctrlfrmMenuAdmin;


public class panelPrincipaladmin extends javax.swing.JPanel {

    
    public panelPrincipaladmin() {
        initComponents();
        
        panelPrincipaladmin panel = this;
        frmMenuAdmin vista = new frmMenuAdmin();
        frmAgregarusuarios vista2 = new frmAgregarusuarios();
        //panelCalendario panel2 = new panelCalendario();
        
        ctrlfrmMenuAdmin controlador = new ctrlfrmMenuAdmin(vista, vista2, panel);
    }
    
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPagregarus = new javax.swing.JButton();
        btnPverus = new javax.swing.JButton();
        btnPasishoras = new javax.swing.JButton();
        btnPverhishoras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lineamorada.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bienvenidamin.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 25, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Frasesadmin.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 149, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lineamorada.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 25, -1, -1));

        btnPagregarus.setBackground(new java.awt.Color(204, 204, 255));
        btnPagregarus.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        btnPagregarus.setForeground(new java.awt.Color(102, 102, 255));
        btnPagregarus.setText("Agregar usuarios");
        add(btnPagregarus, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 76, 193, 111));

        btnPverus.setBackground(new java.awt.Color(255, 215, 175));
        btnPverus.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        btnPverus.setForeground(new java.awt.Color(255, 153, 0));
        btnPverus.setText("Ver usuarios registrados");
        add(btnPverus, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 85, 199, 111));

        btnPasishoras.setBackground(new java.awt.Color(200, 242, 238));
        btnPasishoras.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        btnPasishoras.setForeground(new java.awt.Color(0, 153, 153));
        btnPasishoras.setText("Asistencia y agregar horas");
        add(btnPasishoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 199, -1, 111));

        btnPverhishoras.setBackground(new java.awt.Color(215, 255, 175));
        btnPverhishoras.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 11)); // NOI18N
        btnPverhishoras.setForeground(new java.awt.Color(0, 153, 0));
        btnPverhishoras.setText("Ver historial de horas sociales");
        add(btnPverhishoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 208, -1, 111));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circlesadmin2.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Circlesadmin.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPagregarus;
    public javax.swing.JButton btnPasishoras;
    public javax.swing.JButton btnPverhishoras;
    public javax.swing.JButton btnPverus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
