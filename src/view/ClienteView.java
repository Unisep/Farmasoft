/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ClienteController;
import javax.swing.JOptionPane;

/**
 *
 * @author luizcarraro
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    private ClienteController controller; 
    
    public ClienteView() {
        initComponents();
        controller = new ClienteController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JToggleButton();
        btnGravar = new javax.swing.JToggleButton();
        btnAlterar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnPesquisar = new javax.swing.JToggleButton();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        nomeTextField = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        btnNovo = new javax.swing.JToggleButton();
        panel2 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        cpfTextField = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        textField8 = new java.awt.TextField();
        textField9 = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        panel4 = new java.awt.Panel();
        jLabel10 = new javax.swing.JLabel();
        textField10 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCancelar.setText("Cancelar");
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.setName("btnGravar"); // NOI18N
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setName("btnAlterar"); // NOI18N

        btnExcluir.setText("Excluir");
        btnExcluir.setName("btnExcluir"); // NOI18N

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setName("btnPesquisar"); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setText("Nome:");

        nomeTextField.setName("edtNome"); // NOI18N
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Data:");

        textField2.setName("edtData"); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setText("Novo");
        btnNovo.setName("btnNovo"); // NOI18N

        panel2.setBackground(new java.awt.Color(240, 240, 240));

        jLabel3.setText("Endereço:");

        textField3.setName("edtEndereco"); // NOI18N

        jLabel4.setText("CEP:");

        textField4.setName("edtCep"); // NOI18N

        textField5.setName("edtCidade"); // NOI18N

        jLabel5.setText("Cidade:");

        textField6.setName("edtuf"); // NOI18N

        jLabel6.setText("UF:");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(240, 240, 240));

        jLabel7.setText("CPF(Responsável)");

        cpfTextField.setName("edtcpf"); // NOI18N

        jLabel8.setText("E-mail:");

        textField8.setName("edtemail"); // NOI18N

        textField9.setName("edtfone"); // NOI18N

        jLabel9.setText("Fone:");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(240, 240, 240));

        jLabel10.setText("Observações Gerais");

        textField10.setName("edtobservacao"); // NOI18N

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnGravar)
                        .addComponent(btnAlterar)
                        .addComponent(btnExcluir)
                        .addComponent(btnNovo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // TODO add your handling code here:
        String nome = nomeTextField.getText();
        int idade = 10;
        String cpf = cpfTextField.getText();
        String rg = "1234567";
        
        boolean sucesso = controller.gravarCliente(nome, idade, cpf, rg);
        
        if(sucesso) {
            JOptionPane.showMessageDialog(null, "Cliente gravado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(
                    null, 
                    "Não foi possivel gravar o cliente", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        controller.listarClientesTeste();
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JToggleButton btnGravar;
    private javax.swing.JToggleButton btnNovo;
    private javax.swing.JToggleButton btnPesquisar;
    private java.awt.TextField cpfTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField nomeTextField;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.TextField textField10;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables
}
