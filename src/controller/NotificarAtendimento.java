package controller;

import dominio.Notificacao;
import dominio.AgendamentoAtendimento;

public class NotificarAtendimento {

    private Notificacao notificacao;

    public NotificarAtendimento() {
    }

    public NotificarAtendimento(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public Notificacao getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    /**
     *
     */
    public void notificarAgendamentoSMS(AgendamentoAtendimento agendamento) {
        notificacao.enviar();
    }

    public void notificarCandelamentoSMS(AgendamentoAtendimento agendamento) {
        notificacao.enviar();
    }

}
