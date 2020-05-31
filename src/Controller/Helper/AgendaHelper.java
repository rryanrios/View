/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import Model.CadastrarCliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author flavi
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    //Carregar tabela de Agendamentos
    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        //Percorrer a lista preenchendo o tableModel (tabela)
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });            
        }
    }

    //Carregar combo de Clientes
    public void preencherClientes(ArrayList<CadastrarCliente> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel)view.getjComboBoxCliente().getModel();
        
        for (CadastrarCliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }
    
    //Carregar combo de Serviços
    public void preencherServicos(ArrayList<Servico> servicos){
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);            
        }
    }

    public CadastrarCliente obterCliente() {
        return (CadastrarCliente)view.getjComboBoxCliente().getSelectedItem();
    }

    
    public Servico obterServico() {
        return (Servico)view.getjComboBoxServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getjTextValor().setText(valor + "");
    }

    @Override
    public Agendamento obterModelo() {
        //Obter dados da tela para gravar no BD
        String idString = view.getjTextId().getText();
        int id  = Integer.parseInt(idString);
        CadastrarCliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getjTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextData().getText();
        String hora = view.getjTextHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getjTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora, observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getjTextId().setText("0");
        view.getjTextData().setText("");
        view.getjTextHora().setText("");
        view.getjTextObservacao().setText("");
    }
    
}
