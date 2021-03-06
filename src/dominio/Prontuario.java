package dominio;

import java.util.ArrayList;
import java.util.List;

public class Prontuario extends Entidade {

    private /*@ spec_public non_null @*/ ArrayList<Atendimento> atendimento;

    private /*@ spec_public nullable @*/ Paciente paciente;

    public Prontuario() {
        atendimento = new ArrayList<Atendimento>();
    }
    
    
    /*@ requires atendimento != null; 
      @ assignable this.atendimento;
      @ ensures this.atendimento.size() == \old( (this.atendimento.size() + 1) ) &&
      @ (\forall int i; 0 <= i && i < (this.atendimento.size() -1);
	  @ this.atendimento.get(i) == \old(this.atendimento).get(i));
     */
    public void addAtendimento(Atendimento atendimento){
    	this.atendimento.add(atendimento);
    }

    public /* @ pure @*/ ArrayList<Atendimento> getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(ArrayList<Atendimento> atendimento) {
        this.atendimento = atendimento;
    }

    public /* @ pure @*/ Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
