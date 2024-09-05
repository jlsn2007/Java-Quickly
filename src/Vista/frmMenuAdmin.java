package Vista;

import Controlador.ctrlfrmMenuAdmin;


public class frmMenuAdmin extends javax.swing.JFrame {


    public frmMenuAdmin() {
        initComponents();
    }
    
    public static void initfrmMenuAdmin(){
        frmMenuAdmin vista = new frmMenuAdmin();
        panelPrincipaladmin panel = new panelPrincipaladmin();
        ctrlfrmMenuAdmin controlador = new ctrlfrmMenuAdmin(vista,panel);
        
        vista.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnmenuagus = new javax.swing.JButton();
        jpContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpMenu.setBackground(new java.awt.Color(20, 31, 36));

        btnHome.setBackground(new java.awt.Color(20, 31, 36));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Home.png"))); // NOI18N

        btnCalendar.setBackground(new java.awt.Color(20, 31, 36));
        btnCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calendario.png"))); // NOI18N

        btnSettings.setBackground(new java.awt.Color(20, 31, 36));
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ajustes.png"))); // NOI18N

        btnmenuagus.setBackground(new java.awt.Color(204, 204, 255));
        btnmenuagus.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        btnmenuagus.setForeground(new java.awt.Color(102, 102, 255));
        btnmenuagus.setText("Agregar Usuarios");

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnHome)
                .addGap(42, 42, 42)
                .addComponent(btnCalendar)
                .addGap(42, 42, 42)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnmenuagus)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnmenuagus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jpContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jpContenedor.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Inter 24pt ExtraBold", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("¡Bienvenido a Quickly!");
        jpContenedor.add(jLabel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                initfrmMenuAdmin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalendar;
    public javax.swing.JButton btnHome;
    public javax.swing.JButton btnSettings;
    public javax.swing.JButton btnmenuagus;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jpContenedor;
    private javax.swing.JPanel jpMenu;
    // End of variables declaration//GEN-END:variables
}
