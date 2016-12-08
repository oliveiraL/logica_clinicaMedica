package clinicaEstetica.dominio;

import dominio.Especialidade;
import dominio.Especialista;
import validacoes.ValidacaoException;

public class DoctorEstetica extends Especialista{

	private /*@ spec_public nullable @*/ String crm;
    
	private /*@ spec_public nullable @*/ int tempoProfissao;
	
  /*@ 
    @ requires crm != null;
    @ requires especialidade != null;
    @ requires nome != null;
    @ requires CPF != null;
    @*/
    public DoctorEstetica(String crm, Especialidade especialidade, String nome, String CPF){
       super(especialidade, nome, CPF);
       this.crm = crm;
    }
     
     public DoctorEstetica() {
     }
    
   /*@ also 
     @ public normal_behavior
     @ requires getCrm() != null && getCPF() != null && !getCPF().isEmpty() && getCrm().isEmpty(); 
     @ assignable \nothing;
     @ ensures getCrm() == \old(getCrm()) && getCPF() == \old(getCPF());
     @*/
    public void validarEspecialista() throws ValidacaoException {
        if(getCrm() == null || getCPF() == null || getCPF().isEmpty() || getCrm().isEmpty()){
            throw new ValidacaoException("Erro ao validar Especialista.");
        }
    }
    
    public /*@ pure @*/ String getCrm() {
        return crm;
    }

    public void setCrm(String crmv) {
        this.crm = crmv;
    }


	public /*@ pure @*/ int getTempoProfissao() {
		return tempoProfissao;
	}


	public void setTempoProfissao(int tempoProfissao) {
		this.tempoProfissao = tempoProfissao;
	}
    
    
}
