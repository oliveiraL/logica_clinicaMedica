package dominio;

import validacoes.ValidacaoException;

public class Especialidade {

    private /*@ spec_public @*/ int id;

    private /*@ spec_public nullable @*/ String descricao;
    
    private /*@ spec_public nullable @*/ String designacao;
    
  /*@ ensures this.descricao == descricao && this.designacao == designacao;
    @*/
    public Especialidade(String descricao, String designacao) {
        this.descricao = descricao;
        this.designacao = designacao;
    }

    public Especialidade() {
    }
    
  /*@ public normal_behavior
    @ requires getDescricao() != null && getDescricao() != "" && getDesignacao() != null && getDesignacao() != ""; 
    @ assignable \nothing;
    @ ensures getDescricao() == \old(getDescricao()) && getDesignacao() == \old(getDesignacao());
    @ also
    @ public exceptional_behavior
    @ requires getDescricao() == null || getDescricao() == "" || getDesignacao() == null || getDesignacao() == "";
    @ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
   public void validarEspecialidade() throws ValidacaoException {
	   
       if(getDescricao() == null || getDescricao().trim().isEmpty()){
           throw new ValidacaoException("Descricao obrigatoria.");
       }
       
       if(getDesignacao() == null || getDesignacao().trim().isEmpty()){
           throw new ValidacaoException("Designicao obrigatoria.");
       }
          
   }

    public /*@ pure @*/ int getId() {
        return id;
    }
    
    //@ ensures this.id == id;
    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure nullable @*/ String getDescricao() {
        return descricao;
    }
    
    //@ ensures this.descricao == descricao;
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public /*@ pure nullable @*/ String getDesignacao() {
        return designacao;
    }
    
    //@ ensures this.designacao == designacao;
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

}
