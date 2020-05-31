/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.CadastrarCliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import Servico.Correio;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author flavi
 */
public class AgendaController {

    private final Agenda view;
    private final AgendaHelper helper;
    
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
        //buscar lista com cgendamentos do BD
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        //Exibir esta lista na view
        helper.preencherTabela(agendamentos); 
    }
    
    public void atualizaCliente(){
        //Buscar Clientes do Banco de Dados
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<CadastrarCliente> clientes = clienteDAO.selectAll();
        //Exibir Clientes no comboBox cliente
        helper.preencherClientes(clientes);
    }
    
    public void atuaizaServico(){
        //Buscar Serviços do Banco de Dados
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        //Exibir Serviços no ComboBox
        helper.preencherServicos(servicos);
    }
    //Coloca valor do servico selecionado no campo valor
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar() {
        //Buscar agendamento da tela
        Agendamento agendamento = helper.obterModelo();
        //Salva Objeto no Banco de Dados
        new AgendamentoDAO().insert(agendamento);
        
        Correio correio = new Correio();
        correio.NotificarPorEmail(agendamento);
        
        atualizaTabela();
        helper.limparTela();
    }
}
