package dao;

import controller.AtendimentoController;
import dominio.Atendimento;
import dominio.AtendimentoPrivado;
import dominio.Paciente;
import java.util.ArrayList;
import java.util.List;

public class AtendimentoDao extends GenericDao{

//
//    public AtendimentoDao(String pacote) {
//        super(System.getProperty("user.dir") + "/src/"+pacote+"/atendimento.xml");
//    }
//    public ArrayList<AtendimentoPrivado> listarAtendimentoNaoPago() {
//        ArrayList<AtendimentoPrivado> atendimentos = new ArrayList<>();
//        for (Atendimento aux : listagem) {
//            if(aux instanceof AtendimentoPrivado){
//                AtendimentoPrivado atp = (AtendimentoPrivado) aux;
//                if (!atp.isProcedimentoPago()) {
//                    atendimentos.add(atp);
//
//                }
//            }
//        }
//        return atendimentos;
//    }
//
//    public void salvar(Atendimento atendimento) {
//        System.err.println("oi");
//        atendimento.setId(listagem.size()+1);
//        System.err.println("oi");
//        listagem.add(atendimento);
//        super.salvar();
//    }
//
//    public void atualizar(AtendimentoPrivado atendimento) {
//        int i = 0;
//        AtendimentoPrivado alterar = null;
//        for (Atendimento aux : listagem) {
//            if (aux.getId() == atendimento.getId()) {
//                alterar = atendimento;
//                break;
//            }
//            i++;
//        }
//        listagem.remove(alterar);
//        listagem.add(i,atendimento);
//        super.atualizar();
//    }
//
//    public void remover(AtendimentoPrivado atendimento) {
//        Atendimento remover = null;
//        for (Atendimento aux : listagem) {
//            if (aux.getId() == atendimento.getId()) {
//                remover = aux;
//            }
//        }
//        listagem.remove(remover);
//        super.remover();
//    }
//
//    public Atendimento buscarID(int id) {
//        Atendimento atendimento = null;
//        for (Atendimento aux : listagem) {
//            if (aux.getId() == id) {
//                atendimento = aux;
//            }
//        }
//        return atendimento;
//    }

}
