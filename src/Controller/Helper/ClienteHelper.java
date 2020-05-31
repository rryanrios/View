/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;


import Model.CadastrarCliente;
import view.Cliente;


/**
 *
 * @author flavi
 */
public class ClienteHelper {
    private final Cliente view;
    
    public ClienteHelper(Cliente view){
        this.view = view;
    }
    public CadastrarCliente obterModelo() {
        //Obter dados da tela para gravar no BD
        String idString = view.getjTxtId().getText();
        int id  = Integer.parseInt(idString);
        String nome = view.getjTxtNome().getText();
        char sexo = 'm';
        String dataNascimento = view.getjTxtDtNascimento().getText();
        String telefone = view.getjTxtTelefone().getName();
        String rg = view.getjTxtCep().getText();
        String email = view.getjTxtEmail().getText();
        String endereco = view.getjTxtEndereco().getText();
        String cep = view.getjTxtCep().getText();
        
        CadastrarCliente cadastrarCliente = new CadastrarCliente(id, nome, sexo, dataNascimento,telefone, email, rg, endereco, cep);      
        return cadastrarCliente;
    }

    public void limparTela() {
        view.getjTxtId().setText("0");
        view.getjTxtDtNascimento().setText("");
        view.getjTxtNome().setText("");
        view.getjTxtTelefone().setText("");
        view.getjTxtRg().setText("");
        view.getjTxtEmail().setText("");
        view.getjTxtEndereco().setText("");
        view.getjTxtCep().setText("");
    }
}
