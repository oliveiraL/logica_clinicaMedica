package dominio;

import validacoes.ValidacaoException;

public abstract class Especialista {

    private /*@ spec_public @*/ int id;
    
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
    
    /*@ public normal_behavior
    @ requires getNome() != null && !getNome().equals("") && getCPF() != null && !getCPF().equals("") && getEspecialidade() != null; 
    @ assignable \nothing;
    @ also
    @ public exceptional_behavior
    @ requires getNome() == null || getNome().equals("") || getCPF() == null || getCPF().equals("") || getEspecialidade() == null;
    @ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
   public void validarEspecialista() throws ValidacaoException {
	   
       if(getNome() == null || getNome().trim().isEmpty()){
           throw new ValidacaoException("Nome do especialista obrigatorio.");
       }
       
       if(getCPF() == null || getCPF().trim().isEmpty()){
           throw new ValidacaoException("CPF do especialista obrigatorio.");
       }
       
       if(getEspecialidade() == null){
           throw new ValidacaoException("Especialidade do especialista obrigatorio.");
       }
          
   }

    public /*@ pure nullable @*/ Especialidade getEspecialidade() {
        return especialidade;
    }
    
    //@ ensures this.especialidade == especialidade;
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public /*@ pure @*/ int getId() {
        return id;
    }
    
    //@ ensures this.id == id;
    public void setId(int id) {
        this.id = id;
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
