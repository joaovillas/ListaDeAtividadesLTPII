/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JInternalFrameInserir extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameInserir
     */
    public JInternalFrameInserir() {
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
        jComboBoxAtividadesTipo = new javax.swing.JComboBox<>();
        jLabelData = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldAtividadesData = new javax.swing.JFormattedTextField();
        jLabelLocal = new javax.swing.JLabel();
        jTextFieldAtividadesLocal = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jButtonAtividadesInserir = new javax.swing.JButton();
        jTextFieldAtividadesCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAtividadesDescricao = new javax.swing.JTextArea();
        jButtonLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inserir Atividades");
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
                formInternalFrameOpened(evt);
            }
        });

        jLabelMatricula.setText("Matrícula:*");

        jLabelNome.setText("Nome:*");

        jComboBoxAtividadesTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Lazer", "Trabalho", "Escola", "Faculdade", "Física" }));

        jLabelData.setText("Data:*");

        jLabelTipo.setText("Tipo: *");

        try {
            jTextFieldAtividadesData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelLocal.setText("Local:*");

        jLabelDescricao.setText("Descrição:");

        jButtonAtividadesInserir.setText("Inserir");
        jButtonAtividadesInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtividadesInserirActionPerformed(evt);
            }
        });

        jTextFieldAtividadesCodigo.setEditable(false);

        jLabelCodigo.setText("Código:");

        jTextAreaAtividadesDescricao.setColumns(20);
        jTextAreaAtividadesDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAtividadesDescricao);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAtividadesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAtividadesNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxAtividadesTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAtividadesData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAtividadesLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAtividadesCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAtividadesInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAtividadesNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNome))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMatricula)
                        .addComponent(jTextFieldAtividadesMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAtividadesTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelData)
                    .addComponent(jLabelTipo)
                    .addComponent(jTextFieldAtividadesData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocal)
                    .addComponent(jTextFieldAtividadesLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescricao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldAtividadesCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAtividadesInserir)
                        .addComponent(jButtonLimpar)))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtividadesInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtividadesInserirActionPerformed
        
      if((jTextFieldAtividadesMatricula.getText().equalsIgnoreCase("")) || (jTextFieldAtividadesNome.getText().equalsIgnoreCase("")) 
      || (jComboBoxAtividadesTipo.getSelectedItem().toString().equals("Selecione")) 
      || (jTextFieldAtividadesData.getText().equalsIgnoreCase("  /  /    ")) && (jTextFieldAtividadesLocal.getText().equalsIgnoreCase("")))
        { 
            JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos");
        }else{
             
            // Envia pro banco metodo insert
          
          JOptionPane.showMessageDialog(null, "Atividade inserida com sucesso");  
             System.out.println("Matricula: "+jTextFieldAtividadesMatricula.getText());
             System.out.println("Nome: "+jTextFieldAtividadesNome.getText())  ;
             System.out.println("Categoria: "+jComboBoxAtividadesTipo.getSelectedItem().toString());
             System.out.println("Data: "+jTextFieldAtividadesData.getText());
             System.out.println("Local: "+jTextFieldAtividadesLocal.getText());
             System.out.println("Descricao: "+jTextAreaAtividadesDescricao.getText());
             
             jTextFieldAtividadesMatricula.setText(null);
             jTextFieldAtividadesNome.setText(null);
             jComboBoxAtividadesTipo.setSelectedIndex(0);
             jTextFieldAtividadesData.setText(null);
             jTextFieldAtividadesLocal.setText(null);
             jTextAreaAtividadesDescricao.setText(null);
             
             
             
        }
    }//GEN-LAST:event_jButtonAtividadesInserirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldAtividadesMatricula.setText(null);
             jTextFieldAtividadesNome.setText(null);
             jComboBoxAtividadesTipo.setSelectedIndex(0);
             jTextFieldAtividadesData.setText(null);
             jTextFieldAtividadesLocal.setText(null);
             jTextAreaAtividadesDescricao.setText(null);
             
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        jTextFieldAtividadesMatricula.setText(null);
             jTextFieldAtividadesNome.setText(null);
             jComboBoxAtividadesTipo.setSelectedIndex(0);
             jTextFieldAtividadesData.setText(null);
             jTextFieldAtividadesLocal.setText(null);
             jTextAreaAtividadesDescricao.setText(null);
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtividadesInserir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox<String> jComboBoxAtividadesTipo;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAtividadesDescricao;
    private javax.swing.JTextField jTextFieldAtividadesCodigo;
    private javax.swing.JFormattedTextField jTextFieldAtividadesData;
    private javax.swing.JTextField jTextFieldAtividadesLocal;
    private javax.swing.JTextField jTextFieldAtividadesMatricula;
    private javax.swing.JTextField jTextFieldAtividadesNome;
    // End of variables declaration//GEN-END:variables
}
