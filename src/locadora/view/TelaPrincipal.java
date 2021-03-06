/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.view;

import locadora.view.cadastro.CadastroCliente;
import locadora.view.cadastro.CadastroFilme;
import locadora.view.cadastro.CadastroAtor;
import connection.ConnectionFactory;

/**
 *
 * @author regis
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jPanelTelaPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarTelaPricipal = new javax.swing.JMenuBar();
        jMenuLocacao = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAtor = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFilme = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Video locadora Sessão das Dez");
        setResizable(false);

        jPanelTelaPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoLocadora.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTelaPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaPrincipal);
        jPanelTelaPrincipal.setLayout(jPanelTelaPrincipalLayout);
        jPanelTelaPrincipalLayout.setHorizontalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanelTelaPrincipalLayout.setVerticalGroup(
            jPanelTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaPrincipalLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jMenuLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravando.png"))); // NOI18N
        jMenuLocacao.setText("Locação");
        jMenuLocacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuLocacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItem1.setText("Começar o Dia");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuLocacao.add(jMenuItem1);

        jMenuItemConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuLocacao.add(jMenuItemConsultar);

        jMenuBarTelaPricipal.add(jMenuLocacao);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCadastro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jMenuItemAtor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemAtor.setText("Ator");
        jMenuItemAtor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAtorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAtor);

        jMenuItemCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemFilme.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemFilme.setText("Filme");
        jMenuItemFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFilmeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFilme);

        jMenuBarTelaPricipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuSair.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBarTelaPricipal.add(jMenuSair);

        setJMenuBar(jMenuBarTelaPricipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanelTelaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFilmeActionPerformed
        CadastroFilme cadastroFilme = new CadastroFilme();
        cadastroFilme.setVisible(true);
    }//GEN-LAST:event_jMenuItemFilmeActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed

    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
         System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuItemAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAtorActionPerformed
        CadastroAtor cadastroAtor = new CadastroAtor();
        cadastroAtor.setVisible(true);
    }//GEN-LAST:event_jMenuItemAtorActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaAlugar telaAlugar = new TelaAlugar();
        telaAlugar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBarTelaPricipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAtor;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemFilme;
    private javax.swing.JMenu jMenuLocacao;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelTelaPrincipal;
    // End of variables declaration//GEN-END:variables

   
}
