package dominio;

import java.util.Date;
import validacoes.ValidacaoException;

public abstract class AgendamentoAtendimento {
	
	
    private /*@ spec_public @*/ int id;

    
    private /*@ spec_public @*/ Date dataHora;

    
    private /*@ spec_public @*/ Especialista especialista;

    
    private /*@ spec_public @*/ Paciente paciente;

    
    private /*@ spec_public @*/ Especialidade especialidade;

    public AgendamentoAtendimento() {
    }

    public AgendamentoAtendimento(Date dataHora, Especialista especialista, Paciente paciente, Especialidade especialidade) {
        
        this.dataHora = dataHora;
        this.especialista = especialista;
        this.paciente = paciente;
        this.especialidade = especialidade;
    }

    
    
    /**
     *
     */
    public abstract void validarAgendamento()throws ValidacaoException;

    public /*@ pure @*/ int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure @*/ Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public /*@ pure @*/ Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public /*@ pure @*/ Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public /*@ pure @*/ Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

}
