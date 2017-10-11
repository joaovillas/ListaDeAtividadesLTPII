/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import sqlite.SQLiteJDBCDriverConnection;

/**
 *
 * @author Admin
 */
public class JIFrameAtividadesRelatoriosCategoria extends javax.swing.JInternalFrame {

    SQLiteJDBCDriverConnection bd = new SQLiteJDBCDriverConnection();    
        Connection conn = bd.connect();
    
    public JIFrameAtividadesRelatoriosCategoria() {
        initComponents();
        this.selecionaDadosCategoria(conn);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRelatorioCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorioCategoria = new javax.swing.JTable();
        jButtonExibir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Atividades / Relatórios");

        jLabel1.setText("Selecione a categoria a ser exibida:");

        jComboBoxRelatorioCategoria.setEditable(true);
        jComboBoxRelatorioCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Lazer", "Trabalho", "Escola", "Faculdade", "Física" }));
        jComboBoxRelatorioCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRelatorioCategoriaActionPerformed(evt);
            }
        });

        jTableRelatorioCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricula", "Categoria", "Data", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(jTableRelatorioCategoria);

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxRelatorioCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExibir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxRelatorioCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExibir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxRelatorioCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRelatorioCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRelatorioCategoriaActionPerformed

    private void jButtonExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExibirActionPerformed

        String escolha = (String) jComboBoxRelatorioCategoria.getSelectedItem();
        //System.out.println(escolha);
        this.selecionaDadosAtividade(conn,escolha);
        
    }//GEN-LAST:event_jButtonExibirActionPerformed

    public void  selecionaDadosCategoria (Connection conn) {
        
        String sql = "SELECT codigo, categoria "
                     + "FROM Categoria;";
        
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
                
            // loop no resultado
            jComboBoxRelatorioCategoria.removeAllItems();
            while (rs.next()) {
                
                //System.out.println(rs.getInt("codigo") +  "\t" + 
                 //                 rs.getString("categoria")); 
                 jComboBoxRelatorioCategoria.addItem(rs.getString("categoria"));

            }
             jComboBoxRelatorioCategoria.updateUI();
             
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public  void selecionaDadosAtividade (Connection conn,String escolha) {
        
        String sql = "SELECT matricula,categoria ,data ,descricao  "
                     + "FROM Atividade Where categoria ='?'";
        
        
        try {
            
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs  = comandoSql.executeQuery(sql);
            
//            pstmt.setString(1,escolha);
            
            while (rs.next()) {
           
                
                DefaultTableModel val = (DefaultTableModel) jTableRelatorioCategoria.getModel();
                String matricula = rs.getString("matricula"); 
                String categoria = rs.getString("categoria");
                String data = rs.getString("data");
                String descricao = rs.getString("descricao");
                System.out.println(matricula+categoria+data+descricao);
                val.addRow(new String[] {matricula , categoria , data , descricao});

            }
           jTableRelatorioCategoria.updateUI();
           
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExibir;
    private javax.swing.JComboBox<String> jComboBoxRelatorioCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorioCategoria;
    // End of variables declaration//GEN-END:variables
}
