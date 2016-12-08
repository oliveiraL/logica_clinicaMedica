package dominio;

import validacoes.ValidacaoException;

public class TipoAtendimento {

    private /*@ spec_public @*/ int id;

    private /*@ spec_public nullable @*/ String descricao;
   
  /*@ ensures this.descricao == descricao;
    @*/
    public TipoAtendimento(String descricao) {
        this.descricao = descricao;
    }
    
    public TipoAtendimento() {
    }
    
   /*@ public normal_behavior
    @ requires getDescricao() != null && getDescricao() != ""; 
    @ assignable \nothing;
    @ also
    @ public exceptional_behavior
    @ requires getDescricao() == null || getDescricao() == "";
    @ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
   public void validarTipoAtendimento() throws ValidacaoException {
	   
       if(getDescricao() == null || getDescricao().trim().isEmpty()){
           throw new ValidacaoException("Descricao obrigatoria.");
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

}
