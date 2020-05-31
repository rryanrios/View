/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author flavi
 */
public class Correio {

public void NotificarPorEmail(Agendamento agendamento){
    String emailFormatado = formarEmail(agendamento);
    String destinatario = agendamento.getCliente().getEmail();
    
    //aciona a classe Email
    Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
    email.enviar();
}    

    private String formarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico = agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento = agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        
        return "Olá " + nomeCliente + "Vai dar um tapa do visu... Seu agendamento para " + 
                servico + ", esta marcado para dia " + dataAgendamento +
                " às " + horaAgendamento + " o preço para você sai baratin, fica R$ " + valor + " Forte abraço.";
    }
}
