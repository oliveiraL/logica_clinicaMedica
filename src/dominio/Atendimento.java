package dominio;

import java.util.Date;
import java.util.List;
import validacoes.ValidacaoException;

public abstract class Atendimento extends Entidade{

    protected /*@ spec_public @*/ int id;

    protected /*@ spec_public nullable @*/ Date dataHora;

    protected /*@ spec_public nullable @*/ Paciente paciente;

    protected /*@ spec_public nullable @*/ Especialista especialista;

    protected /*@ spec_public nullable @*/ Tratamento tratamentos;

    protected /*@ spec_public nullable @*/ DiagnosticoAtendimento diagnosticoAtendimentos;

    public Atendimento() {
    }
    
  /*@ public normal_behavior
    @ requires getDiagnosticoAtendimentos() != null && getTratamentos() != null && getDataHora() != null && getPaciente() != null && getEspecialista() != null; 
    @ assignable \nothing;
    @ also
    @ public exceptional_behavior
    @ requires getDiagnosticoAtendimentos() == null || getTratamentos() == null || getDataHora() == null || getPaciente() == null || getEspecialista() == null;
    @ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
    public void validarAtendimento() throws ValidacaoException{
        
    	if(getDiagnosticoAtendimentos() == null)
            throw new ValidacaoException("Atendimento tem que ter um diagnostico.");
        
        if(getTratamentos() == null)
        	throw new ValidacaoException("Atendimento tem que ter um tratamento.");
       
        if(getDataHora() == null)
        	throw new ValidacaoException("Atendimento tem que tem uma data e uma hora.");
        
        if(getPaciente() == null)
        	throw new ValidacaoException("Atendimento tem que ter um paciente.");
       
        if(getEspecialista() == null)
        	throw new ValidacaoException("Atendimento tem que ter um Especialista.");
        
    }

    public /*@ pure @*/ int getId() {
        return id;
    }
    
    
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

    public /*@ pure nullable @*/ Paciente getPaciente() {
        return paciente;
    }
    
    //@ ensures this.paciente == paciente;
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public /*@ pure nullable @*/ Especialista getEspecialista() {
        return especialista;
    }
    
    //@ ensures this.especialista == especialista;
    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public /*@ pure nullable @*/ Tratamento getTratamentos() {
        return tratamentos;
    }

    //@ ensures this.tratamentos == tratamentos;
    public void setTratamentos(Tratamento tratamentos) {
        this.tratamentos = tratamentos;
    }
    
    public /*@ pure nullable @*/ DiagnosticoAtendimento getDiagnosticoAtendimentos() {
        return diagnosticoAtendimentos;
    }
    
    //@ ensures this.diagnosticoAtendimentos == diagnosticoAtendimentos;
    public void setDiagnosticoAtendimentos(DiagnosticoAtendimento diagnosticoAtendimentos) {
        this.diagnosticoAtendimentos = diagnosticoAtendimentos;
    }

    

}
