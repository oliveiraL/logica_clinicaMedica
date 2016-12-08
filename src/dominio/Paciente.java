package dominio;

import validacoes.ValidacaoException;

public abstract class Paciente {

	
    protected /*@ spec_public  @*/ int id;
    
    protected /*@ spec_public nullable @*/ String nome;

    protected /*@ spec_public nullable @*/  Responsavel responsavel;
    

    public Paciente() {
		// TODO Auto-generated constructor stub
	}
    
    //@ ensures this.nome == nome;
    public Paciente(String nome) {
        this.nome = nome;
    }
    
    

    /*@ public normal_behavior
	 @ requires this.nome != null && this.nome != "";
	 @ assignable \nothing;
	 @ ensures this.nome == \old(this.nome);
	 @ also
	 @ public exceptional_behavior
	 @ requires this.nome == null || this.nome == "";
	 @ signals_only ValidacaoException;
	*/
    public/*@ pure @*/ void validarPaciente() throws ValidacaoException{
    	if(this.nome == null){
    		throw new ValidacaoException("nome do paciente obrigatorio.");
    	}if(this.nome.trim().isEmpty()){
    		throw new ValidacaoException("nome do paciente obrigatorio2.");
    		
    	}
    }

    public /*@ pure @*/ int getId() {
        return id;
    }

    //@ ensures this.id == id;
    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure @*/ String getNome() {
        return nome;
    }

   
     /*
     @ ensures this.nome = nome;
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public /*@ pure @*/ Responsavel getResponsavel() {
        return responsavel;
    }

    /*@ requires responsavel != null;
      @ ensures this.responsavel == responsavel;
      */
    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

}
