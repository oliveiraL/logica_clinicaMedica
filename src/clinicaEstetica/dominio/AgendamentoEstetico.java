/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import dominio.AgendamentoAtendimento;
import dominio.Especialidade;
import dominio.Especialista;
import dominio.Paciente;
import java.util.Date;
import javax.swing.JOptionPane;
import validacoes.ValidacaoException;

/**
 *
 * @author victor
 */
public class AgendamentoEstetico extends AgendamentoAtendimento {

    public AgendamentoEstetico(Date dataHora, Especialista especialista, Paciente paciente, Especialidade especialidade) {
        super(dataHora, especialista, paciente, especialidade);
    }

    public AgendamentoEstetico() {
    }
    
    @Override
    public void validarAgendamento() throws ValidacaoException {
        PacienteEstetica paciente = (PacienteEstetica) getPaciente();
        if(paciente.getIdade() < 18){
            int resposta = JOptionPane.showConfirmDialog( null,"Responsavel Autoriza ?", "Autorisação",JOptionPane.YES_OPTION);
            if(resposta != JOptionPane.YES_OPTION){
                throw new ValidacaoException("Erro na autorisação do responsavel.");
            }
        }
        if (getDataHora().getHours() > 20 || getDataHora().getHours() < 10) {
            throw new ValidacaoException("Agendamento invalido.");
        }

    }
}
