package controller;

import dao.PacienteDao;
import dominio.Paciente;
import dominio.Prontuario;

import java.util.ArrayList;
import validacoes.ValidacaoException;

public class GerenciarPacienteController {
//
    private/*@ spec_public non_null @*/ PacienteDao pacienteDao;
    private GerenciarProntuarioController gerenciarProntuario;
//
    public GerenciarPacienteController() {
        pacienteDao = new PacienteDao();
        gerenciarProntuario = new GerenciarProntuarioController();
    }

	
    /*@ public normal_behavior 
      @		requires paciente != null;
      @		requires paciente.validarPaciente();
      @ 	assignable paciente;
      @ 	ensures paciente.getId() == this.listarPacientes().size();
      @ also
	  @ public exceptional_behavior
	  @ 	requires paciente == null || !paciente.validarPaciente();
	  @ 	assignable \nothing;
	  @ 	signals_only ValidacaoException;
      */
    public void cadastrarPaciente(/*@ nullable @*/ Paciente paciente) throws ValidacaoException {
    	if(paciente == null)
    		throw new ValidacaoException("Preencha os dados do paciente.");
    	if(!paciente.validarPaciente())
    		throw new ValidacaoException("Preencha os dados do paciente corretamente.");
    	pacienteDao.salvar(paciente);
    }

    /*@ public normal_behavior
      @ requires paciente != null && this.verificarExistencia(paciente) && paciente.getId() != 0;
      @ assignable \nothing;
      @ ensures paciente == \old(paciente);
      @ also
      @ public exceptional_behavior
      @ requires paciente == null || !this.verificarExistencia(paciente) || paciente.getId()== 0;
      @ assignable \nothing;
      @ signals_only ValidacaoException;
      @*/
    public void removerPaciente(/*@ nullable @*/Paciente paciente) throws ValidacaoException {
        if(paciente == null)
        	throw new ValidacaoException("Paciente vazio.");
    	pacienteDao.remover(paciente);
    }

    public Paciente buscarPaciente(int id) throws ValidacaoException {
	    return (Paciente) pacienteDao.buscarId(id);
    }

    public /*@ pure @*/ ArrayList<Paciente> listarPacientes() {
        return pacienteDao.getListagem();
    }

    public /*@ pure @*/ boolean verificarExistencia(Paciente paciente) {
        return pacienteDao.existe(paciente);
    }

}
