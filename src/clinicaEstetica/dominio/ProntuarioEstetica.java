/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaEstetica.dominio;

import dominio.Atendimento;
import dominio.Prontuario;
import java.util.Date;

/**
 *
 * @author Monster
 */
public class ProntuarioEstetica extends Prontuario{
    private /*@ spec_public @*/ Date dataCriacao;
   
    
    /*@ requires date != null;
      @ assignable this.dataCriacao;
      @ ensures this.dataCriacao == date;
     */
    public ProntuarioEstetica(Date date) {
    	this.dataCriacao = date;
    }
    
    
     public /* @ pure @ */ Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    
}
