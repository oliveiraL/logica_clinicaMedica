package clinicaEstetica.dominio;

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
    	super();
    	this.dataCriacao = date;
    }
    
    
     public /*@ pure @*/ Date getDataCriacao() {
        return dataCriacao;
    }
     
   //@ ensures this.dataCriacao == dataCriacao;
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    
}
