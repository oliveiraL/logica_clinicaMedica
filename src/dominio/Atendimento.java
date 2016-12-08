package dominio;

import java.util.Date;
import java.util.List;
import validacoes.ValidacaoException;

public abstract class Atendimento {

    protected /* @ spec_public @ */ int id;

    protected /* @ spec_public @ */ Date dataHora;

    protected /* @ spec_public @ */ Paciente paciente;

    protected /* @ spec_public @ */ Especialista especialista;

    protected /* @ spec_public @ */ Tratamento tratamentos;

    protected /* @ spec_public @ */ DiagnosticoAtendimento diagnosticoAtendimentos;

    public Atendimento() {
    }


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

    public /*@ pure @*/ Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public /*@ pure @*/ Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public /*@ pure @*/ Especialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(Especialista especialista) {
        this.especialista = especialista;
    }

    public /*@ pure @*/ Tratamento getTratamentos() {
        return tratamentos;
    }

    public void setTratamentos(Tratamento tratamentos) {
        this.tratamentos = tratamentos;
    }

    public /*@ pure @*/ DiagnosticoAtendimento getDiagnosticoAtendimentos() {
        return diagnosticoAtendimentos;
    }

    public void setDiagnosticoAtendimentos(DiagnosticoAtendimento diagnosticoAtendimentos) {
        this.diagnosticoAtendimentos = diagnosticoAtendimentos;
    }

    

}
