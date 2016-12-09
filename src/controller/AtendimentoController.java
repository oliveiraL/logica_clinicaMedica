package controller;

import java.util.ArrayList;

import dao.AtendimentoDao;
import dominio.Atendimento;
import dominio.AtendimentoPrivado;
import dominio.Prontuario;
import dominio.Paciente;
import validacoes.ValidacaoException;

public class AtendimentoController {

    private /*@ spec_public non_null @*/ AtendimentoDao atendimentoDao;
    private /*@ spec_public non_null @*/ GerenciarProntuarioController gerenciarProntuario;

    public AtendimentoController() {
    	atendimentoDao = new AtendimentoDao();
//        gerenciarProntuario = new GerenciarProntuarioController(pacote);
//        atendimentoDao = new AtendimentoDao(pacote);
    }

  /*@ public normal_behavior 
    @	requires atendimento != null;
    @ 	assignable atendimento;
    @ 	ensures atendimento.getId() == this.listarAtendimentos().size();
    @ also
	@ public exceptional_behavior
	@ 	requires atendimento == null;
    @ 	assignable \nothing;
    @ 	signals_only ValidacaoException;
    @*/
    public void finalizarAtendimento(Atendimento atendimento) throws ValidacaoException {
    	if(atendimento == null)
    		throw new ValidacaoException("Preencha os dados do paciente.");
    	atendimentoDao.salvar((AtendimentoPrivado) atendimento);
    	atendimento.validarAtendimento();
    }
    
    public Atendimento buscarAtendimento(int id) throws ValidacaoException{
         return (Atendimento) atendimentoDao.buscarId(id);
     }
    
    public /*@ pure @*/ ArrayList<Paciente> listarAtendimentos() {
        return atendimentoDao.getListagem();
    }

}
