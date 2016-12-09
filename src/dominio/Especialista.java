package dominio;

import validacoes.ValidacaoException;

public abstract class Especialista extends Entidade {
    
	private /*@ spec_public nullable @*/ Especialidade especialidade;

    private /*@ spec_public nullable @*/ String nome;

    private /*@ spec_public nullable @*/ String CPF;
    
  /*@ ensures this.especialidade == especialidade && this.nome == nome && this.CPF == CPF;
    @*/
    public Especialista(Especialidade especialidade, String nome, String CPF) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.CPF = CPF;
    }
    
    public Especialista() {
    	// TODO Auto-generated constructor stub
    }
    
    /*
	@ assignable \nothing;
    @ ensures (getNome() != null && !getNome().equals("") && getCPF() != null && !getCPF().equals("") && getEspecialidade() != null) ==> (\result == true) ; 
    @ ensures (getNome() == null || getNome().equals("") || getCPF() == null || getCPF().equals("") || getEspecialidade() == null) ==> (\result == false);
    @*/
   public boolean validarEspecialista() {
	   
       if(getNome() == null || getNome().trim().isEmpty()){
           return false;
       }
       
       if(getCPF() == null || getCPF().trim().isEmpty()){
    	   return false;
       }
       if(getEspecialidade() == null){
    	   return false;
       }
        
       return true;
   }

    public /*@ pure nullable @*/ Especialidade getEspecialidade() {
        return especialidade;
    }
    
    //@ ensures this.especialidade == especialidade;
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    
    public /*@ pure nullable @*/ String getNome() {
        return nome;
    }

    //@ ensures this.nome == nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public /*@ pure nullable @*/ String getCPF() {
        return CPF;
    }
    
    //@ ensures this.CPF == CPF;
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
