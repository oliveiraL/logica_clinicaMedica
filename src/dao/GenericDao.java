package dao;

import java.util.ArrayList;

import dominio.Entidade;
import validacoes.ValidacaoException;
public abstract class GenericDao<T extends Entidade> {

    protected/*@ spec_public non_null @*/ ArrayList<T> listagem;

    public GenericDao() {
        listagem = new ArrayList<T>();
    }
    
    /*@
      @ 	requires obj != null;
      @ 	assignable this.listagem;
      @ 	ensures 
      @ 	(\forall int i; 0 <= i && i < (this.listagem.size() - 1);
	  @ 	this.listagem.get(i) == \old(this.listagem).get(i));
	  @ 	ensures this.listagem.size() == \old(this.listagem.size()+1);
     */
    public void salvar(T obj){
        listagem.add(obj);
        
    }
    
    /*@ public normal_behavior 
      @ 	requires obj.getId() != 0; 
      @ 	requires (\exists int i; 0 <= i && i < this.listagem.size(); this.listagem.get(i).equals(obj));
      @ 	assignable this.listagem;
      @		ensures this.listagem.size() == \old(this.listagem.size()-1);
      @		ensures (\forall int i; 0 <= i && i < (\old(this.listagem).size());
	  @ 		this.listagem.get(i).getId() != obj.getId()  );
      @ also
      @ public exceptional_behavior
      @ 	requires obj.getId() == 0 || !(\exists int i; 0 <= i && i < this.listagem.size(); this.listagem.get(i).equals(obj));
      @ 	assignable \nothing;
      @ 	signals_only  ValidacaoException;
      @ 	signals (ValidacaoException e) 
      @			this.listagem.size() == \old(this.listagem.size()) && 
      @			(\forall int i; 0 <= i && i < this.listagem.size();
	  @ 			this.listagem.get(i).equals( \old(this.listagem).get(i)));
      */
    public void remover(T obj) throws ValidacaoException{
    	if(obj.getId() == 0)
    		throw new ValidacaoException("Objeto não cadastrado.");
    	if(!listagem.contains(obj))
        	throw new ValidacaoException("Objeto não encontrado.");
        listagem.remove(obj);
    }


	public /*@ pure @*/ ArrayList<T> getListagem() {
		return listagem;
	}
	
	/*@ public normal_behavior 
	  @		requires (\exists int i; 0 <= i && i < this.listagem.size(); this.listagem.get(i).getId() == id);
	  @		assignable \nothing;
	  @		ensures \result instanceof Entidade
      @          && ((Entidade)\result).getId() == id;
	  @		ensures_redundantly \result != null;
	  @ also
	  @ public exceptional_behavior
	  @		requires !(\exists int i; 0 <= i && i < this.listagem.size(); this.listagem.get(i).getId() == id);
	  @		assignable \nothing;
	  @		signals_only ValidacaoException;
	 */
	public Entidade buscarId(int id) throws ValidacaoException{
		for(Entidade obj: listagem){
			if(obj.getId() == id)
				return (Entidade) obj;
		}
		throw new ValidacaoException("Não existe obj.");
	}
    
	//@ ensures \result == (\exists int i; 0 <= i && i < this.listagem.size(); this.listagem.get(i).equals(obj));
	public boolean existe(T obj){
		return listagem.contains(obj);
	}
    
	



}