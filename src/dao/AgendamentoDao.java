package dao;



import dominio.AgendamentoAtendimento;
import dominio.Paciente;
import java.util.Date;


public class AgendamentoDao extends GenericDao{

//    public AgendamentoDao(String pacote) {
//        super(System.getProperty("user.dir") + "/src/"+pacote+"/agendamento.xml");
//    }
//    
//    public void salvar(AgendamentoAtendimento agendamento) {
//        agendamento.setId(listagem.size()+1);
//        listagem.add(agendamento);
//        super.salvar();
//    }
//
//    public void atualizar(AgendamentoAtendimento agendamento) {
//        listagem.stream().filter((aux) -> (aux.getId() == agendamento.getId())).forEach((aux) -> {
//            aux = agendamento;
//        });
//        super.atualizar();
//    }
//
//    public void remover(AgendamentoAtendimento agendamento) {
//        listagem.stream().filter((aux) -> (aux.getId() == agendamento.getId())).forEach((aux) -> {
//            listagem.remove(agendamento);
//        });
//        super.remover();
//    }
//
//    
//    public AgendamentoAtendimento buscar(Date dataHora, Paciente paciente){
//        AgendamentoAtendimento agendamentoAtendimento = null;
//        for(AgendamentoAtendimento aux : listagem){
//            if(aux.getPaciente()== null ? paciente == null : aux.getPaciente().equals(paciente) && aux.getDataHora()== null ? dataHora == null : aux.getDataHora().equals(dataHora))
//                agendamentoAtendimento = aux;
//        }
//        
//        return agendamentoAtendimento;
//    }
//    

}
