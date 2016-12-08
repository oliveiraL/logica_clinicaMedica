package clinicaEstetica.dominio;

import validacoes.ValidacaoException;

import dominio.Paciente;
/**
 *
 * @author Monster
 */
public class PacienteEstetica extends Paciente {

    private /*@ spec_public nullable @*/ String email;
    private /*@ spec_public nullable @*/ String telefone;
    private /*@ spec_public @*/ int idade;
    private /*@ spec_public nullable @*/ String CPF;

    public PacienteEstetica() {
		// TODO Auto-generated constructor stub
	}

    public PacienteEstetica(String nome, String telefone, int idade, String CPF) {
        super(nome);
        this.telefone = telefone;
        this.idade = idade;
        this.CPF = CPF;

    }

    /*@ also
      @ 	ensures (this.CPF != null && this.CPF != "" && (this.idade < 18) && (this.responsavel != null)) ==> (\result == true);
      @ 	ensures (this.CPF == null || this.CPF == "" || ((this.idade < 18) && (this.responsavel == null))) ==> (\result == false);
      */
    @Override
    public /*@ pure @*/ boolean validarPaciente(){
    	if(!super.validarPaciente())
    		return false;
    	if (CPF == null || CPF.trim().isEmpty()) 
    		return false;
        if (idade < 18 && (responsavel == null)) 
        	return false;
        return true;
        
    }

    public /* @ pure @ */ String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public /* @ pure @ */ String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public /* @ pure @ */ int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public /* @ pure @ */ String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
