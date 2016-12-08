package dominio;

import validacoes.ValidacaoException;

public abstract class Especialista {

    private /*@ spec_public nullable @*/ Especialidade especialidade;

    private /*@ spec_public @*/ int id;

    private /*@ spec_public nullable @*/ String nome;

    private /*@ spec_public nullable @*/ String CPF;
    
  /*@ 
    @ requires especialidade != null;
    @ requires nome != null;
    @ requires CPF != null;
    @*/
    public Especialista(Especialidade especialidade, String nome, String CPF) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.CPF = CPF;
    }
    
    public Especialista() {
    }
    
    public abstract void validarEspecialista() throws ValidacaoException;

    public /*@ pure @*/ Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public /*@ pure @*/ int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure @*/ String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public /*@ pure @*/ String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
