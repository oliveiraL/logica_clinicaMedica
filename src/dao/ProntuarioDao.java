package dao;


import dominio.Paciente;
import dominio.Prontuario;



public class ProntuarioDao extends GenericDao<Prontuario>{


    public Prontuario buscarProntuario(Paciente paciente){
         for (Prontuario aux : listagem) {
            if (aux.getPaciente().getId() == paciente.getId()) {
                return aux;                
            }
        }
        return null;
    }

}
