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
      @ 	ensures especialidade.getId() == this.listagem().size();
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
    @ requires (especialidade == null || !this.verificarExistencia(especialidade) || especialidade.getId() == 0);
	@ assignable \nothing;
    @ signals_only ValidacaoException;
    @*/
    public void remover(Especialidade especialidade) throws ValidacaoException{
    	if(especialidade == null)
    		throw new ValidacaoException("Especialidade Vazia");
    	especialidadeDao.remover(especialidade);
    }
<<<<<<< HEAD
	    
    public /*@ pure @*/ List<Especialidade> listagem(){
=======
	
    public Especialidade buscarPaciente(int id) throws ValidacaoException {
	    return (Especialidade) especialidadeDao.buscarId(id);
    }
    
    public/*@ pure @*/ List<Especialidade> listagem(){
>>>>>>> 26dfa0dbe934ba57371814577f1803c639d61ccb
        return especialidadeDao.getListagem();
    }
    
    public /*@ pure @*/ boolean verificarExistencia(Especialidade especialidade) {
        return especialidadeDao.existe(especialidade);
    }
    
}
