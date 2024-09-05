package Vista;

import Controlador.ctrlfrmMenuAdmin;



public class panelAgregarUsuarios extends javax.swing.JPanel {

    
    public panelAgregarUsuarios() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuarios = new javax.swing.JTable();
        txtContraus = new javax.swing.JTextField();
        txtNombreus = new javax.swing.JTextField();
        txtCorreous = new javax.swing.JTextField();
        cbRol = new javax.swing.JComboBox<>();
        btnAgregarusuario = new javax.swing.JButton();
        imgbtnEliminar = new javax.swing.JLabel();
        imgbtnEditar = new javax.swing.JLabel();
        cbComite = new javax.swing.JComboBox<>();
        cbGrado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jtbUsuarios.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        jtbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbUsuarios);

        txtContraus.setBackground(new java.awt.Color(233, 233, 233));
        txtContraus.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtContraus.setForeground(new java.awt.Color(102, 102, 102));
        txtContraus.setText("Contraseña");
        txtContraus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrausActionPerformed(evt);
            }
        });

        txtNombreus.setBackground(new java.awt.Color(233, 233, 233));
        txtNombreus.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtNombreus.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreus.setText("Nombre");
        txtNombreus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreusActionPerformed(evt);
            }
        });

        txtCorreous.setBackground(new java.awt.Color(233, 233, 233));
        txtCorreous.setFont(new java.awt.Font("Inter 18pt SemiBold", 0, 12)); // NOI18N
        txtCorreous.setForeground(new java.awt.Color(102, 102, 102));
        txtCorreous.setText("Correo electrónico");
        txtCorreous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreousActionPerformed(evt);
            }
        });

        cbRol.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregarusuario.setBackground(new java.awt.Color(0, 153, 51));
        btnAgregarusuario.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        btnAgregarusuario.setText("Agregar usuario");

        imgbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b.png"))); // NOI18N

        imgbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/e.png"))); // NOI18N

        cbComite.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cbComite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbGrado.setFont(new java.awt.Font("Inter 18pt ExtraBold", 0, 12)); // NOI18N
        cbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Inter 18pt Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(imgbtnEditar)
                        .addGap(112, 112, 112)
                        .addComponent(imgbtnEliminar)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbComite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCorreous, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreus, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtContraus, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(171, 171, 171)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCorreous, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtContraus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbComite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgbtnEliminar)
                    .addComponent(imgbtnEditar))
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrausActionPerformed

    private void txtNombreusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreusActionPerformed

    private void txtCorreousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreousActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreousActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarusuario;
    public javax.swing.JComboBox<String> cbComite;
    public javax.swing.JComboBox<String> cbGrado;
    public javax.swing.JComboBox<String> cbRol;
    public javax.swing.JLabel imgbtnEditar;
    public javax.swing.JLabel imgbtnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jtbUsuarios;
    public javax.swing.JTextField txtContraus;
    public javax.swing.JTextField txtCorreous;
    public javax.swing.JTextField txtNombreus;
    // End of variables declaration//GEN-END:variables
}
