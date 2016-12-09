package dominio;

import validacoes.ValidacaoException;

public class Especialidade extends Entidade{


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
    
  /*@ assignable \nothing;
    @ ensures (getDescricao() != null && getDescricao() != "" && getDesignacao() != null && getDesignacao() != "") ==> (\result == true); 
    @ ensures getDescricao() == \old(getDescricao()) && getDesignacao() == \old(getDesignacao());
    @ ensures (getDescricao() == null || getDescricao() == "" || getDesignacao() == null || getDesignacao() == "") ==> (\result == false);
    */
   public /*@ pure @*/ boolean validarEspecialidade(){
       if(getDescricao() == null || getDescricao().trim().isEmpty()){
           return false;
       }
       
       if(getDesignacao() == null || getDesignacao().trim().isEmpty()){
    	   return false;
       }
       return true;
          
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
