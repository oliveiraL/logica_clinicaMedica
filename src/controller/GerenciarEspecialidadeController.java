/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

import dao.EspecialidadeDao;
import dominio.Especialidade;
import dominio.Paciente;
import validacoes.ValidacaoException;

/**
 *
 * @author lucio
 */
public class GerenciarEspecialidadeController {
    private EspecialidadeDao especialidadeDao;

    public GerenciarEspecialidadeController() {
        especialidadeDao = new EspecialidadeDao();
    }
    
    
    /*@ public normal_behavior 
      @ 	requires especialidade != null;
      @		requires especialidade.validarEspecialidade();
      @ 	assignable especialidade;
      @ 	ensures especialidade.getId() == this.listarPacientes().size();
      @ also
	  @ public exceptional_behavior
	  @ 	requires especialidade == null || !especialidade.validarEspecialidade();
	  @ 	assignable \nothing;
	  @ 	signals_only ValidacaoException;
    */
    public void cadastrar(Especialidade especialidade) throws ValidacaoException{
    	if(especialidade == null)
    		throw new ValidacaoException("Preencha os dados da especialidade.");
    	if(!especialidade.validarEspecialidade())
    		throw new ValidacaoException("Preencha os dados do especialidade corretamente.");
    	especialidadeDao.salvar(especialidade);
    }

    /*@ public normal_behavior
    @ requires especialidade != null && this.verificarExistencia(especialidade) && especialidade.getId() != 0;
    @ assignable \nothing;
    @ ensures especialidade == \old(especialidade);
    @ also
    @ public exceptional_behavior
    @ requires especialidade == null || !this.verificarExistencia(especialidade) || especialidade.getId()== 0;
    @ signals_only ValidacaoException;
    @*/
    public void remover(Especialidade especialidade) throws ValidacaoException{
    	if(especialidade == null)
    		throw new ValidacaoException("Especialidade Vazia");
    	especialidadeDao.remover(especialidade);
    }
	    
    public List<Especialidade> listagem(){
        return especialidadeDao.getListagem();
    }
    
    public /*@ pure @*/ boolean verificarExistencia(Especialidade especialidade) {
        return especialidadeDao.existe(especialidade);
    }
    
}
