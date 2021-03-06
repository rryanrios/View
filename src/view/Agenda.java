/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author flavi
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelId = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelObservacao = new javax.swing.JLabel();
        jLabelAgenda = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jTextValor = new javax.swing.JTextField();
        jTextData = new javax.swing.JTextField();
        jTextHora = new javax.swing.JTextField();
        jScrollPaneObservacoes = new javax.swing.JScrollPane();
        jTextObservacao = new javax.swing.JTextArea();
        jButtonAgendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendamentos = new javax.swing.JTable();
        jLabelFundoPane = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor R$");
        getContentPane().add(jLabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        jLabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservacao.setText("Observação");
        getContentPane().add(jLabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jLabelAgenda.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgenda.setText("Agenda");
        getContentPane().add(jLabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jTextId.setText("0");
        jTextId.setToolTipText("");
        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 310, 30));

        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 310, 30));

        jComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 310, 30));

        jTextValor.setText("0");
        jTextValor.setToolTipText("");
        jTextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValorActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 310, 30));

        jTextData.setToolTipText("");
        jTextData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDataActionPerformed(evt);
            }
        });
        getContentPane().add(jTextData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 310, 30));

        jTextHora.setToolTipText("");
        jTextHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHoraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 310, 30));

        jTextObservacao.setColumns(20);
        jTextObservacao.setRows(5);
        jScrollPaneObservacoes.setViewportView(jTextObservacao);

        getContentPane().add(jScrollPaneObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 530, 220));

        jButtonAgendar.setBackground(new java.awt.Color(0, 255, 51));
        jButtonAgendar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgendar.setText("Agendar");
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 530, 30));

        jTableAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane1.setViewportView(jTableAgendamentos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 1060, 350));

        jLabelFundoPane.setBackground(new java.awt.Color(0, 255, 255));
        jLabelFundoPane.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jTextDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDataActionPerformed

    private void jTextHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHoraActionPerformed

    private void jTextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorActionPerformed

    private void jComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxServicoItemStateChanged

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        this.controller.agendar(); 
    }//GEN-LAST:event_jButtonAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundoPane;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelObservacao;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneObservacoes;
    private javax.swing.JTable jTableAgendamentos;
    private javax.swing.JTextField jTextData;
    private javax.swing.JTextField jTextHora;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextArea jTextObservacao;
    private javax.swing.JTextField jTextValor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atuaizaServico();
        this.controller.atualizaValor();
    }

    public JTable getjTableAgendamentos() {
        return jTableAgendamentos;
    }

    public void setjTableAgendamentos(JTable jTableAgendamentos) {
        this.jTableAgendamentos = jTableAgendamentos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return jComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.jComboBoxServico = jComboBoxServico;
    }

    public JTextField getjTextValor() {
        return jTextValor;
    }

    public void setjTextValor(JTextField jTextValor) {
        this.jTextValor = jTextValor;
    }

    public JScrollPane getjScrollPaneObservacoes() {
        return jScrollPaneObservacoes;
    }

    public void setjScrollPaneObservacoes(JScrollPane jScrollPaneObservacoes) {
        this.jScrollPaneObservacoes = jScrollPaneObservacoes;
    }

    public JTextField getjTextData() {
        return jTextData;
    }

    public void setjTextData(JTextField jTextData) {
        this.jTextData = jTextData;
    }

    public JTextField getjTextHora() {
        return jTextHora;
    }

    public void setjTextHora(JTextField jTextHora) {
        this.jTextHora = jTextHora;
    }

    public JTextField getjTextId() {
        return jTextId;
    }

    public void setjTextId(JTextField jTextId) {
        this.jTextId = jTextId;
    }

    public JTextArea getjTextObservacao() {
        return jTextObservacao;
    }

    public void setjTextObservacao(JTextArea jTextObservacao) {
        this.jTextObservacao = jTextObservacao;
    }
    
}
