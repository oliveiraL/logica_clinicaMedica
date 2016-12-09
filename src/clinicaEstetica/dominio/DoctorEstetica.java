package clinicaEstetica.dominio;

import dominio.Especialidade;
import dominio.Especialista;
import validacoes.ValidacaoException;

public class DoctorEstetica extends Especialista{

	private /*@ spec_public nullable @*/ String crm;
    
	private /*@ spec_public nullable @*/ int tempoProfissao;
	
  /*@ ensures this.crm ==crm && this.especialidade == especialidade && this.nome == nome && this.CPF == CPF && this.tempoProfissao == tempoProfissao;
    @*/
    public DoctorEstetica(String crm, Especialidade especialidade, String nome, String CPF, int tempoProfissao){
       super(especialidade, nome, CPF);
       this.crm = crm;
       this.tempoProfissao = tempoProfissao;
    }
     
     public DoctorEstetica() {
     }
    
   /*@ also
     
     @ assignable \nothing;
     @ ensures (getCrm() != null && !getCrm().equals("") && getTempoProfissao() > 0) || (getNome() != null && !getNome().equals("") && getCPF() != null && !getCPF().equals("") && getEspecialidade() != null) ==> \result == true; 
     @ ensures (getCrm() == null || getCrm().equals("") || getTempoProfissao() <= 0) || (getNome() == null || getNome().equals("") || getCPF() == null || getCPF().equals("") || getEspecialidade() == null) ==> \result == false;
     @*/
     @Override
    public boolean validarEspecialista() {
       if(!super.validarEspecialista())
    	   return false;
    	if(getCrm() == null || getCrm().trim().isEmpty()){
            return false;
        }
    	
    	if(getTempoProfissao() <= 0){
    		return false;
        }
    	return true;
    }
    
    public /*@ pure nullable @*/ String getCrm() {
        return crm;
    }
    
    //@ ensures this.crm == crmv;
    public void setCrm(String crmv) {
        this.crm = crmv;
    }


	public /*@ pure @*/ int getTempoProfissao() {
		return tempoProfissao;
	}

	//@ ensures this.tempoProfissao == tempoProfissao;
	public void setTempoProfissao(int tempoProfissao) {
		this.tempoProfissao = tempoProfissao;
	}
    
    
}
