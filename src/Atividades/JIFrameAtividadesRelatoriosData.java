/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import sqlite.SQLiteJDBCDriverConnection;

/**
 *
 * @author benilton.oliveira
 */
public class JIFrameAtividadesRelatoriosData extends javax.swing.JInternalFrame {

  SQLiteJDBCDriverConnection bd = new SQLiteJDBCDriverConnection();    
        Connection conn = bd.connect();
    
    
    public JIFrameAtividadesRelatoriosData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRelatorioData = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorioData = new javax.swing.JTable();
        jButtonExibir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        jLabel1.setText("Informe a data que deseja ser exibida:");

        try {
            jTextFieldRelatorioData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldRelatorioData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRelatorioDataActionPerformed(evt);
            }
        });

        jTableRelatorioData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Data", "Categoria", "Descrição"
            }
        ));
        jTableRelatorioData.setEnabled(false);
        jScrollPane1.setViewportView(jTableRelatorioData);

        jButtonExibir.setText("Exibir");
        jButtonExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExibirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldRelatorioData, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRelatorioData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRelatorioDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRelatorioDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRelatorioDataActionPerformed

    private void jButtonExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibirActionPerformed
        
        String data = jTextFieldRelatorioData.getText();
        limpaTabela();
        selectDadosAtividadesCategoria(conn,data);
        
    }//GEN-LAST:event_jButtonExibirActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        limpaTabela();
        jTextFieldRelatorioData.setText(null);
        jTextFieldRelatorioData.requestFocus();
    }//GEN-LAST:event_formInternalFrameActivated

    public void selectDadosAtividadesCategoria(Connection conn , String date){
    
        String sql = "SELECT matricula,categoria ,data ,descricao,nome "
                     + "FROM Atividade Where data = '"+date+"' ;";
        
        DefaultTableModel val = (DefaultTableModel) jTableRelatorioData.getModel();
        
        try{
            
            Statement comandoSql = conn.createStatement();
            ResultSet rs  =comandoSql.executeQuery(sql);
                                 
                       
            while(rs.next()){
                String nome = rs.getString("nome");
                String matricula = rs.getString("matricula");
                String categoria = rs.getString("categoria"); 
                String data = rs.getString("data");
                String descricao = rs.getString("descricao");
                val.addRow(new String[] {matricula,nome,data,categoria,descricao});
            }
            
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }    
    
    public void limpaTabela(){
        int x = jTableRelatorioData.getRowCount();
        int y=0;
        while (y<x)
        {
            jTableRelatorioData.selectAll();
        ((DefaultTableModel) jTableRelatorioData.getModel()).removeRow(jTableRelatorioData.getSelectedRow());
        y++;
        }
    }
    
    
 

    
    
  
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExibir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorioData;
    private javax.swing.JFormattedTextField jTextFieldRelatorioData;
    // End of variables declaration//GEN-END:variables
}
