package dao;

import dominio.Paciente;

public class PacienteDao extends GenericDao {

//    public PacienteDao(String pacote) {
//        super(System.getProperty("user.dir") + "/src/"+pacote+"/paciente.xml");
//    }
//
//    public boolean existe(Paciente paciente) {
//        return false;
//    }
//
//    public void salvar(Paciente paciente) {
//        System.err.println(listagem.size() + 1);
//        paciente.setId(listagem.size() + 1);
//        listagem.add(paciente);
//        super.salvar();
//        System.err.println(listagem.size());
//    }
//
//    public void atualizar(Paciente paciente) {
//        int i = 0;
//        Paciente alterar = null;
//        for (Paciente aux : listagem) {
//            if (aux.getId() == paciente.getId()) {
//                alterar = paciente;  
//                break;
//            }
//            i++;
//        }
//        System.err.println(alterar.getNome());
//        listagem.remove(i);
//        listagem.add(paciente);
//        super.atualizar();
//    }
//
//    public void remover(Paciente paciente) {
//        Paciente remover = null;
//        for (Paciente aux : listagem) {
//            if (aux.getId() == paciente.getId()) {
//                remover = aux;
//                break;
//            }
//        }
//        listagem.remove(remover);
//        super.remover();
//    }
//
//    public Paciente buscarID(int id) {
//        Paciente paciente = null;
//        for (Paciente aux : listagem) {
//            if (aux.getId() == id) {
//                paciente = aux;
//            }
//        }
//        return paciente;
//    }
//
//    public Paciente buscarNome(String nome) {
//        Paciente paciente = null;
//        for (Paciente aux : listagem) {
//            if (aux.getNome() == nome) {
//                paciente = aux;
//            }
//        }
//        return paciente;
//    }

}
