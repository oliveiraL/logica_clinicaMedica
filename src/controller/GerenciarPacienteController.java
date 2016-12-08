package controller;

import dao.PacienteDao;
import dominio.Paciente;
import java.util.ArrayList;
import validacoes.ValidacaoException;

public class GerenciarPacienteController {
//
    private/*@ spec_public non_null @*/ PacienteDao pacienteDao;
//    GerenciarProntuarioController gerenciarProntuario;
//
    public GerenciarPacienteController() {
        pacienteDao = new PacienteDao();
//        gerenciarProntuario = new GerenciarProntuarioController(pacote);
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

    public void removerPaciene(Paciente paciente) throws ValidacaoException {
        pacienteDao.remover(paciente);
    }

    public Paciente buscarPaciente(int id) throws ValidacaoException {
	    return (Paciente) pacienteDao.buscarId(id);
    }

//    public Paciente buscarPaciente(String cpfResponsalvel) throws ValidacaoException {
//        ArrayList<Paciente> pacientes = pacienteDao.listar();
//        for (Paciente p : pacientes) {
//            if (p.getResponsavel().getCPF().equals(cpfResponsalvel)) {
//                return p;
//            }
//        }
//        throw new ValidacaoException("Paciente não cadastrado.");
//    }
//
//    public ArrayList<Paciente> buscarPacienteResponsavel(String cpfResponsalvel) {
//        ArrayList<Paciente> pacientes = pacienteDao.listar();
//        ArrayList<Paciente> pacientesResposavel = new ArrayList<>();
//        for (Paciente p : pacientes) {
//            if (p.getResponsavel().getCPF().equals(cpfResponsalvel)) {
//                pacientesResposavel.add(p);
//            }
//        }
//        return pacientesResposavel;
//    }
//
//    public ArrayList<Paciente> buscarPacienteCPF(String CPF) {
//        ArrayList<Paciente> pacientes = pacienteDao.listar();
//        ArrayList<Paciente> pacientesResposavel = new ArrayList<>();
//        for (Paciente p : pacientes) {
//            PacienteEstetica n = (PacienteEstetica) p;
//            if (n.getCPF().equals(CPF)) {
//                pacientesResposavel.add(p);
//            }
//        }
//        return pacientesResposavel;
//    }
//
//    public ArrayList<Paciente> buscarPacienteNome(String nome) throws ValidacaoException {
//        ArrayList<Paciente> pacientes = pacienteDao.listar();
//        ArrayList<Paciente> pacientesEncontrado = new ArrayList<>();
//        for (Paciente p : pacientes) {
//            if (p.getNome().equalsIgnoreCase(nome)) {
//                pacientesEncontrado.add(p);
//            }
//        }
//        return pacientesEncontrado;
//    }

    public /*@ pure @*/ ArrayList<Paciente> listarPacientes() {
        return pacienteDao.getListagem();
    }

    /**
     *
     * @param paciente
     * @throws validacoes.ValidacaoException
     */
//    public void alterarPaciente(Paciente paciente) throws ValidacaoException {
//        paciente.validarPaciente();
//        pacienteDao.atualizar(paciente);
//    }
//
    public boolean verificarExistencia(Paciente paciente) {
        return pacienteDao.existe(paciente);
    }

}
