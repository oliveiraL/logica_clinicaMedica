/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author lucio
 */
public abstract class TipoPagamento {
	
    private /*@ spec_public nullable @*/ String descricao;
    
    public abstract void operacaoPagamento(Double valor);
    
	public /*@ pure nullable @*/ String getDescricao() {
		return descricao;
	}
	
	//@ ensures this.descricao == descricao;
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    
}
