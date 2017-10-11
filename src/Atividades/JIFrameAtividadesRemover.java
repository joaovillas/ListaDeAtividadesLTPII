/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.sql.Connection;
import javax.swing.JOptionPane;
import sqlite.SQLiteJDBCDriverConnection;

/**
 *
 * @author Admin
 */
public class JIFrameAtividadesRemover extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameInserir
     */
    public JIFrameAtividadesRemover() {
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

        jLabelMatricula = new javax.swing.JLabel();
        jTextFieldAtividadesMatricula = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldAtividadesNome = new javax.swing.JTextField();
        jTextFieldAtividadesData = new javax.swing.JFormattedTextField();
        jLabelData = new javax.swing.JLabel();
        jTextFieldAtividadesLocal = new javax.swing.JTextField();
        jLabelLocal = new javax.swing.JLabel();
        jButtonAtividadesRemover = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Remover Atividades");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabelMatricula.setText("Matrícula:");

        jLabelNome.setText("Nome:");

        jTextFieldAtividadesNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtividadesNomeActionPerformed(evt);
            }
        });

        try {
            jTextFieldAtividadesData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldAtividadesData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtividadesDataActionPerformed(evt);
            }
        });

        jLabelData.setText("Data:");

        jLabelLocal.setText("Local:");

        jButtonAtividadesRemover.setText("Remover");
        jButtonAtividadesRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtividadesRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLocal)
                        .addGap(27, 27, 27)
                        .addComponent(jTextFieldAtividadesLocal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(24, 24, 24)
                        .addComponent(jTextFieldAtividadesNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMatricula)
                            .addComponent(jLabelData))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAtividadesData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAtividadesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtividadesRemover)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMatricula)
                    .addComponent(jTextFieldAtividadesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData)
                    .addComponent(jTextFieldAtividadesData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLocal)
                    .addComponent(jTextFieldAtividadesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldAtividadesNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAtividadesRemover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtividadesRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtividadesRemoverActionPerformed
       
        String matricula = jTextFieldAtividadesMatricula.getText();
            
        if(!jTextFieldAtividadesMatricula.getText().equalsIgnoreCase("")){    
            SQLiteJDBCDriverConnection bd = new SQLiteJDBCDriverConnection();
            Connection conn =  bd.connect();
            SQLiteJDBCDriverConnection.deletarDadosAtividade(conn, matricula);
            
            JOptionPane.showMessageDialog(null, "Apagado com Sucesso");
            
            jTextFieldAtividadesMatricula.requestFocus();
            jTextFieldAtividadesData.setText(null);
            jTextFieldAtividadesLocal.setText(null);
            jTextFieldAtividadesMatricula.setText(null);
            jTextFieldAtividadesNome.setText(null);
        }else{
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
        }
            
    }//GEN-LAST:event_jButtonAtividadesRemoverActionPerformed

    private void jTextFieldAtividadesNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtividadesNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtividadesNomeActionPerformed

    private void jTextFieldAtividadesDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtividadesDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtividadesDataActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
            jTextFieldAtividadesMatricula.requestFocus();
            jTextFieldAtividadesData.setText(null);
            jTextFieldAtividadesLocal.setText(null);
            jTextFieldAtividadesMatricula.setText(null);
            jTextFieldAtividadesNome.setText(null);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtividadesRemover;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JFormattedTextField jTextFieldAtividadesData;
    private javax.swing.JTextField jTextFieldAtividadesLocal;
    private javax.swing.JTextField jTextFieldAtividadesMatricula;
    private javax.swing.JTextField jTextFieldAtividadesNome;
    // End of variables declaration//GEN-END:variables
}
