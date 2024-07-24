/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import Clases.Navegador;
import Mysql.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class vistaPrincipal extends javax.swing.JFrame {
    Navegador Nav;
    DefaultTableModel rse;
    public vistaPrincipal(Navegador n) {
        initComponents();
        Nav = n;
        rse = new DefaultTableModel();
        rse.addColumn("ID");
        rse.addColumn("TIPO");
        rse.addColumn("FECHA");
        rse.addColumn("MATERIAL");
        rse.addColumn("CONDUCTOR");
        rse.addColumn("PESO");
        rse.addColumn("PLACA");
        tbInformacion.setModel(rse);
        
    }
    
    public void mostrar(String tabla){
        String sql1 = "select * from " + tabla;
        Statement st1;
        Conexion connect1 = new Conexion("mina");
        Connection con1 = connect1.conectar();
        String[] datos = new String[7];
        try {
            st1 = con1.createStatement();
            ResultSet rs;
            rs = st1.executeQuery(sql1);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                rse.addRow(datos);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        gestES = new javax.swing.JButton();
        btnGestCond = new javax.swing.JButton();
        btnGestVeh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInformacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENIDO, @NAME@");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hombre_1.png"))); // NOI18N

        gestES.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        gestES.setText("REGISTRAR E/S");
        gestES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestESActionPerformed(evt);
            }
        });

        btnGestCond.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGestCond.setText("GESTIONAR CONDUCTORES");
        btnGestCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestCondActionPerformed(evt);
            }
        });

        btnGestVeh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGestVeh.setText("GESTIONAR VEHICULOS");
        btnGestVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestVehActionPerformed(evt);
            }
        });

        jButton2.setText("LOG OUT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gestES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGestVeh, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGestCond, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(gestES, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGestCond, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(26, 26, 26))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GESTION DE ENTRADA Y SALIDA DE VEHICULOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tbInformacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbInformacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestCondActionPerformed
        Nav.gCond.setVisible(true);
    }//GEN-LAST:event_btnGestCondActionPerformed

    private void btnGestVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestVehActionPerformed
        Nav.gVeh.setVisible(true);
    }//GEN-LAST:event_btnGestVehActionPerformed

    private void gestESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestESActionPerformed
        Nav.rse.setVisible(true);
    }//GEN-LAST:event_gestESActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestCond;
    private javax.swing.JButton btnGestVeh;
    private javax.swing.JButton gestES;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbInformacion;
    // End of variables declaration//GEN-END:variables
}
