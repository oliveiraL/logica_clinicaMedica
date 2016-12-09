package controller;

import dominio.Especialidade;
import dominio.Especialista;
import dominio.Paciente;

import java.util.ArrayList;

import dao.EspecialistaDao;
import validacoes.ValidacaoException;

public class GerenciarEspecialistaController {

    private EspecialistaDao especialistaDao;
   

    public GerenciarEspecialistaController() {
        especialistaDao = new EspecialistaDao();
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
    public void cadastrarEspecialista(Especialista especialista) throws ValidacaoException {
    	if(especialista == null)
    		throw new ValidacaoException("Preencha os dados da especialidade.");
    	if(!especialista.validarEspecialista())
    		throw new ValidacaoException("Preencha os dados do especialidade corretamente.");
        especialistaDao.salvar(especialista);
    }
    
    public /*@ pure @*/ boolean verificarExistencia(Especialista especialista) {
        return especialistaDao.existe(especialista);
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
  public void removerPaciente(/*@ nullable @*/Especialista especialista) throws ValidacaoException {
      if(especialista == null)
      	throw new ValidacaoException("Paciente vazio.");
  	  especialistaDao.remover(especialista);
  }

  public Especialista buscarPaciente(int id) throws ValidacaoException {
	    return (Especialista) especialistaDao.buscarId(id);
  }

  public /*@ pure @*/ ArrayList<Especialista> listagem() {
      return especialistaDao.getListagem();
  }

}
