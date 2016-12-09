package controller;

import dominio.Atendimento;
import dominio.Paciente;
import dominio.Prontuario;
import validacoes.ValidacaoException;
import java.util.ArrayList;

import dao.ProntuarioDao;

public class GerenciarProntuarioController {

    private ProntuarioDao prontuarioDao;

    public GerenciarProntuarioController() {
        prontuarioDao = new ProntuarioDao();
    }
    
    /*@ public normal_behavior 
    @	requires prontuario != null;
    @ 	assignable prontuario;
    @ 	ensures prontuario.getId() == this.listarProntuarios().size();
    @ also
	@ public exceptional_behavior
	@ 	requires prontuario == null;
	@ 	assignable \nothing;
	@ 	signals_only ValidacaoException;
    */
    public void cadastrarProntuario(Prontuario prontuario) throws ValidacaoException {
    	if(prontuario == null)
    		throw new ValidacaoException("Preencha todos os dados do prontuario");
        prontuarioDao.salvar(prontuario);
    }

    public void addAtendimento(Prontuario prontuario, Atendimento atendimento) {
        prontuario.addAtendimento(atendimento);
    }

    public void addAtendimento(Atendimento atendimento) {
        Prontuario prontuario = buscarProntuario(atendimento.getPaciente());
        prontuario.addAtendimento(atendimento);
    }

    /*@ public normal_behavior
    @ requires prontuario != null && this.verificarExistencia(prontuario) && prontuario.getId() != 0;
    @ assignable \nothing;
    @ ensures prontuario == \old(prontuario);
    @ also
    @ public exceptional_behavior
    @ requires prontuario == null || !this.verificarExistencia(prontuario) || prontuario.getId()== 0;
    @ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
    public void removerProntuario(Prontuario prontuario) throws ValidacaoException {
        if(prontuario == null)
        	throw new ValidacaoException("Prontuario nulo.");
    	prontuarioDao.remover(prontuario);
    }

    public /*@ pure @*/ ArrayList<Prontuario> listarProntuarios() {
        return prontuarioDao.getListagem();
    }

    public Prontuario buscarProntuario(Paciente paciente) {
        return prontuarioDao.buscarProntuario(paciente);
    }
    
    public Prontuario buscarProntuarioID(int ID) throws ValidacaoException {
        return (Prontuario) prontuarioDao.buscarId(ID);
    }
    
    public /*@ pure @*/ boolean verificarExistencia(Prontuario prontuario) {
        return prontuarioDao.existe(prontuario);
    }

}
