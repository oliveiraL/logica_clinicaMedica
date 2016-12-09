package controller;

import dominio.Especialidade;
import dominio.Especialista;
import dominio.Paciente;

import java.util.ArrayList;

import dao.EspecialistaDao;
import validacoes.ValidacaoException;

public class GerenciarEspecialistaController {

    private /*@ spec_public non_null @*/ EspecialistaDao especialistaDao;
//   
//
   public GerenciarEspecialistaController() {
	   	 especialistaDao = new EspecialistaDao();	 
//       especialistaDao = new EspecialistaDao(pacote);
   }
   
   /*@ public normal_behavior 
     @	  requires especialista != null;
     @    requires especialista.validarEspecialista();
     @    assignable especialista;
     @    ensures especialista.getId() == this.listarEspecialista().size();
     @ also
	 @ public exceptional_behavior
     @    requires especialista == null || !especialista.validarEspecialista();
     @ 	  assignable \nothing;
	 @ 	  signals_only ValidacaoException;
   */   	
	public void cadastrarEspecialista(/*@ nullable @*/ Especialista especialista) throws ValidacaoException {
		
	    if(especialista == null)
    		throw new ValidacaoException("Preencha os dados do especialista.");
	    
    	if(!especialista.validarEspecialista())
    		throw new ValidacaoException("Preencha os dados do especialista corretamente.");
    	
    	especialistaDao.salvar(especialista);
	}

  /*@ public normal_behavior
    @ requires especialista != null && this.verificarExistencia(especialista) && especialista.getId() != 0;
    @ assignable \nothing;
    @ ensures especialista == \old(especialista);
    @ also
    @ public exceptional_behavior
    @ requires especialista == null || !this.verificarExistencia(especialista) || especialista.getId()== 0;
    @ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
    public void removerEspecialista(/*@ nullable @*/Especialista especialista)  throws ValidacaoException {        
        
    	if(especialista == null)
        	throw new ValidacaoException("Especialista vazio.");
        
    	especialistaDao.remover(especialista);
    }
    
    public Especialista buscarEspecialista(int id) throws ValidacaoException {
	    return (Especialista) especialistaDao.buscarId(id);
    }
    
//  /*@ public normal_behavior 
//    @	 requires especialista.getCPF().equals(CPF);
//    @    assignable especialista;
//    @    ensures especialista.getId() == this.listarEspecialista().size();
//    @ also
//    @ public exceptional_behavior
//    @    requires !especialista.getCPF().equals(CPF);
//    @ 	 assignable \nothing;
//    @ 	 signals_only ValidacaoException;
//    @*/   	
//public Especialista buscarEspecialista(/*@ nullable @*/ String CPF) throws ValidacaoException {
//   
//   ArrayList<Especialista> lista = especialistaDao.getListagem();
//   for(Especialista especialista: lista){
//       if(especialista.getCPF().equals(CPF))
//           return  especialista;
//   }
//   throw new ValidacaoException("CPF especialista invalido.");
//}

    public /*@ pure @*/ ArrayList<Especialista> listarEspecialista() {
        return especialistaDao.getListagem();
    }
//    
//    public ArrayList<Especialista> buscarEspecialidade(Especialidade especialidade){
//        ArrayList<Especialista> especialistas = new ArrayList<>();
//        ArrayList<Especialista> lista = especialistaDao.listar();
//        for(Especialista especialista: lista){
//            if(especialista.getEspecialidade() == especialidade)
//                especialistas.add(especialista);
//        }
//        return especialistas;
//    }
//
//    /**
//     *
//     */
//    public void atualizarEspecialista(Especialista especialista) {
//        especialistaDao.atualizar(especialista);
//    }
//
//    public Especialista getEspecialista(String cpf) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    public /*@ pure @*/ boolean verificarExistencia(Especialista especialista) {
        return especialistaDao.existe(especialista);
    }

}
