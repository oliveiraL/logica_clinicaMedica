package dominio;

import validacoes.ValidacaoException;

public class Especialidade {

    private /*@ spec_public @*/ int id;

    private /*@ spec_public nullable @*/ String descricao;
    
    private /*@ spec_public nullable @*/ String designacao;
    
  /*@ 
    @ requires descricao != null;
    @ requires designacao != null;
    @*/
    public Especialidade(String descricao, String designacao) {
        this.descricao = descricao;
        this.designacao = designacao;
    }

   
    
    public Especialidade() {
    }
    
  /*@ also 
    @ public normal_behavior
    @ requires getDescricao() != null; 
    @ assignable \nothing;
    @ ensures getDescricao() == \old(getDescricao());
    @*/
   public void validarEspecialidade() throws ValidacaoException {
       if(getDescricao() == null){
           throw new ValidacaoException("Erro ao validar Especialista.");
       }
   }

    public /*@ pure @*/ int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure @*/ String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public /*@ pure @*/ String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

}
