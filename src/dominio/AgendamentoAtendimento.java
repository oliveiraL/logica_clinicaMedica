package dominio;

import java.util.Date;
import validacoes.ValidacaoException;

public abstract class AgendamentoAtendimento {
	
	
    private /*@ spec_public @*/ int id;
    
    private /*@ spec_public nullable @*/ Date dataHora;
    
    private /*@ spec_public nullable @*/ Especialista especialista;
    
    private /*@ spec_public nullable @*/ Paciente paciente;
    
    private /*@ spec_public nullable @*/ Especialidade especialidade;
    
  /*@ ensures this.dataHora == dataHora && this.especialista == especialista && this.paciente == paciente && this.especialidade == especialidade;
    @*/
    public AgendamentoAtendimento(Date dataHora, Especialista especialista, Paciente paciente, Especialidade especialidade) {
        
        this.dataHora = dataHora;
        this.especialista = especialista;
        this.paciente = paciente;
        this.especialidade = especialidade;
    }
    
    public AgendamentoAtendimento() {
    }
    
    public abstract void validarAgendamento()throws ValidacaoException;

    public /*@ pure @*/ int getId() {
        return id;
    }

    //@ ensures this.id == id;
    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure nullable @*/ Date getDataHora() {
        return dataHora;
    }
    
    //@ ensures this.dataHora == dataHora;
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public /*@ pure nullable @*/ Especialista getEspecialista() {
        return especialista;
    }
    
    //@ ensures this.especialista == especialista;
    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public /*@ pure nullable @*/ Paciente getPaciente() {
        return paciente;
    }

    //@ ensures this.paciente == paciente;
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public /*@ pure nullable @*/ Especialidade getEspecialidade() {
        return especialidade;
    }
    
    //@ ensures this.especialidade == especialidade;
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

}
