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
     @ public normal_behavior
     @ requires (getCrm() != null && !getCrm().equals("") && getTempoProfissao() > 0) || (getNome() != null && !getNome().equals("") && getCPF() != null && !getCPF().equals("") && getEspecialidade() != null); 
     @ assignable \nothing;
     @ also
     @ public exceptional_behavior
     @ requires (getCrm() == null || getCrm().equals("") || getTempoProfissao() <= 0) || (getNome() == null || getNome().equals("") || getCPF() == null || getCPF().equals("") || getEspecialidade() == null);
     @ assignable \nothing;
     @ signals_only ValidacaoException;
     @*/
     @Override
    public void validarEspecialista() throws ValidacaoException {
       super.validarEspecialista();
    	if(getCrm() == null || getCrm().trim().isEmpty()){
            throw new ValidacaoException("Crm do Doctor obrigatorio.");
        }
    	
    	if(getTempoProfissao() <= 0){
            throw new ValidacaoException("Tempo de Profissao inválido.");
        }
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
