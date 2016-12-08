package dao;

import java.util.ArrayList;

import validacoes.ValidacaoException;
public abstract class GenericDao {

//    public String caminho;
//    protected/*@ spec_public non_null @*/ ArrayList<Object> listagem;
//
//    public GenericDao() {
//        listagem = new ArrayList<Object>();
//    }
    
//    /*@ public normal_behavior
//      @ 	requires obj != null;
//      @ 	assignable this.listagem;
//      @ 	ensures obj == \old(obj);
//      @ 	ensures this.listagem.size() == (\old(this.listagem).size()+1) &&
//      @ 	(\forall int i; 0 <= i && i < (this.listagem.size() - 1);
//	  @ 	this.listagem.get(i) == \old(this.listagem).get(i));
//      @ also
//      @ public exceptional_behavior
//      @ 	requires obj == null;
//      @ 	signals_only ValidacaoException;
//     */
//    public void salvar(Object obj) throws ValidacaoException {
//        if(obj == null){
//        	throw new ValidacaoException("Erro ao salvar objeto");
//        }
//        listagem.add(obj);
//    }
//
//    public void remover(Object obj) throws ValidacaoException{
//        if(!listagem.remove(obj)){
//        	throw new ValidacaoException("Erro ao remover objeto");
//        }
//    }
//
//
//	public ArrayList<Object> getListagem() {
//		return listagem;
//	}
//
//
//	public void setListagem(ArrayList<Object> listagem) {
//		this.listagem = listagem;
//	}
    
    



}


/**
 * System.getProperty("user.dir").replace("\\dist", "") + "\\src\\XML\\valores.xml"
 */