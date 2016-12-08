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
      @ 	public normal_behavior
      @ 	requires this.CPF != null;
      @ 	requires this.CPF != "";
      @ 	requires (this.idade < 18) ==> (this.responsavel != null);
      @ 	assignable \nothing;
      @ 	ensures this.CPF == \old(this.CPF);
      @ 	ensures this.idade == \old(this.idade);
      @ 	ensures this.responsavel == \old( this.responsavel );
      @ also
      @ 	public exceptional_behavior
      @ 	requires this.CPF == null || this.CPF == "" || ((this.idade < 18) ==> (this.responsavel == null));
      @ 	signals_only ValidacaoException;
      */
    @Override
    public void validarPaciente() throws ValidacaoException {
    	super.validarPaciente();
        if (getCPF() == null || getCPF().trim().isEmpty()) 
            throw new ValidacaoException("CPF Paciente invalido.");
        if (getIdade() < 18 && (getResponsavel() == null)) 
            throw new ValidacaoException("Paciente Menor de idade, Precisa de Responsavel.");
        
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
