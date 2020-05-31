/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.ClienteHelper;
import Model.CadastrarCliente;
import Model.DAO.ClienteDAO;
import view.Cliente;



/**
 *
 * @author flavi
 */
public class ClienteController {

    private final Cliente view;
    private final ClienteHelper helper;
    
    public ClienteController(Cliente view) {
        this.view = view;
        this.helper = new ClienteHelper(view);
    }
   
    public void cadastrar() {
        //Buscar agendamento da tela
        CadastrarCliente cliente = helper.obterModelo();
        //Salva Objeto no Banco de Dados
        new ClienteDAO().insert(cliente);
        
        helper.limparTela();
    }
}
