package controller;

import dominio.Especialista;
import java.util.Date;
import dominio.AgendamentoAtendimento;
import dominio.Notificacao;
import java.util.ArrayList;
import validacoes.ValidacaoException;

public class AgendamentoController {

//    private AgendamentoDao agendamentoDao;
//    private NotificarAtendimento notificarAtendimento;
//
//    public AgendamentoController(String pacote, Notificacao notificacao) {
//        agendamentoDao = new AgendamentoDao(pacote);
//        notificarAtendimento = new NotificarAtendimento();
//        notificarAtendimento.setNotificacao(notificacao);
//    }
//
//    public void agendamento(AgendamentoAtendimento agendamento) throws ValidacaoException {
//        agendamento.validarAgendamento();
//        agendamento.getDataHora().setSeconds(0);       
//        if (verificarAgendamento(agendamento.getEspecialista(), agendamento.getDataHora())) {
//
//            agendamentoDao.salvar(agendamento);
//            notificarAtendimento.notificarAgendamentoSMS(agendamento);
//        }else{
//            throw new ValidacaoException("Especialista com horario marcado para esse dia.");
//        }
//
//        //notificarAtendimento.notificarAgendamento(agendamento);
//    }
//
//    /**
//     *
//     * @param agendamento
//     */
//    public void cancelarAtendimento(AgendamentoAtendimento agendamento) {
//        agendamentoDao.remover(agendamento);
//    }
//
//    public void reagendarAtendimento(AgendamentoAtendimento agendamento) {
//        agendamentoDao.atualizar(agendamento);
//    }
//
//    public boolean verificarAgendamento(Especialista especialista, Date dataHora) {
//        
//        ArrayList<AgendamentoAtendimento> agendamentos = agendamentoDao.listar();
//        for (AgendamentoAtendimento agendamento : agendamentos) {
//            if (agendamento.getEspecialista().getCPF().equals(especialista.getCPF())) {
//                if(agendamento.getDataHora().getDay() == dataHora.getDay() && agendamento.getDataHora().getMonth() == dataHora.getMonth() &&
//                        agendamento.getDataHora().getHours() == dataHora.getHours() && agendamento.getDataHora().getMinutes() == dataHora.getMinutes()){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

}
