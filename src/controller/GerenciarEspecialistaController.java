package controller;

import dominio.Especialidade;
import dominio.Especialista;
import java.util.ArrayList;
import validacoes.ValidacaoException;

public class GerenciarEspecialistaController {

//    private EspecialistaDao especialistaDao;
//   
//
//    public GerenciarEspecialistaController(String pacote) {
//        especialistaDao = new EspecialistaDao(pacote);
//    }
//
//    /**
//     *
//     */
//    public void cadastrarEspecialista(Especialista especialista) throws ValidacaoException {
//        especialista.validarEspecialista();
//        especialistaDao.salvar(especialista);
//    }
//
//    /**
//     *
//     */
//    public void removerEspecialista(Especialista especialista) {
//        especialistaDao.remover(especialista);
//    }
//
//    public Especialista buscarEspecialista(String CPF) throws ValidacaoException {
//        
//        ArrayList<Especialista> lista = especialistaDao.listar();
//        for(Especialista especialista: lista){
//            if(especialista.getCPF().equals(CPF))
//                return  especialista;
//        }
//        throw new ValidacaoException("CPF especialista invalido.");
//    }
//
//    public ArrayList<Especialista> listarEspecialista() {
//        return especialistaDao.listar();
//    }
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

}
