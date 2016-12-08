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
    private /*@ spec_public @*/ String descricao;
    public abstract void operacaoPagamento(Double valor);
	public /* @ pure @  */ String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
    
}
