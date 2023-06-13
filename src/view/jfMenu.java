/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author João Schultz
 */
public class jfMenu extends javax.swing.JFrame {

    /**
     * Creates new form jfMenu
     */
    public jfMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jlAGENDA = new javax.swing.JLabel();
        jlLOGO = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_Servicos = new javax.swing.JMenuItem();
        JMI_Barbeiros = new javax.swing.JMenuItem();
        JMI_Clientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jlAGENDA.setFont(new java.awt.Font("Sitka Subheading", 3, 24)); // NOI18N
        jlAGENDA.setForeground(new java.awt.Color(255, 255, 255));
        jlAGENDA.setText("AGENDA BELO BARBER STUDIO");

        jlLOGO.setBackground(new java.awt.Color(0, 0, 0));
        jlLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/logo bbs.png"))); // NOI18N
        jlLOGO.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jlAGENDA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jlLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jlAGENDA)
                .addGap(70, 70, 70)
                .addComponent(jlLOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Gerenciar");

        JMI_Servicos.setText("Serviços");
        JMI_Servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ServicosActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Servicos);

        JMI_Barbeiros.setText("Barbeiros");
        JMI_Barbeiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_BarbeirosActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Barbeiros);

        JMI_Clientes.setText("Clientes");
        JMI_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ClientesActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Clientes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void JMI_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ServicosActionPerformed
        // TODO add your handling code here:
        jfServicos janelaServicos = new jfServicos();
        janelaServicos.setVisible(true);
    }//GEN-LAST:event_JMI_ServicosActionPerformed

    private void JMI_BarbeirosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_BarbeirosActionPerformed
        // TODO add your handling code here:
        jfBarbeiro janelaBarbeiro = new jfBarbeiro();
        janelaBarbeiro.setVisible(true);
    }//GEN-LAST:event_JMI_BarbeirosActionPerformed

    private void JMI_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ClientesActionPerformed
        // TODO add your handling code here:
        jfCliente janelaCliente = new jfCliente();
        janelaCliente.setVisible(true);
    }//GEN-LAST:event_JMI_ClientesActionPerformed

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
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMI_Barbeiros;
    private javax.swing.JMenuItem JMI_Clientes;
    private javax.swing.JMenuItem JMI_Servicos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAGENDA;
    private javax.swing.JLabel jlLOGO;
    // End of variables declaration//GEN-END:variables
}
