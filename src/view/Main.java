/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Agendamento;
import Model.CadastrarCliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author flavi
 */
public class Main {

public static void main(String[] args){
    
    String nome;
    
    nome = "Flavio";
    System.out.println(nome);
    
    Servico servico = new Servico(1,"barba",30);
    
    System.out.println(servico.getDescricao());
    System.out.println(servico.getValor());
    
    CadastrarCliente cliente = new CadastrarCliente(1, "Flavio", "Rua teste", "06950000");
    System.out.println(cliente.getNome());

    
    Usuario usuario = new Usuario(1, "Barbeiro", "Senha");
    System.out.println(usuario.getNome());
    System.out.println(usuario.getSenha());
    
    Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "13/01/2020 09:15");
    System.out.println(agendamento.getCliente().getNome());
    
}    
}
