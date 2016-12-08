package controller;

import dominio.Atendimento;
import dominio.AtendimentoPrivado;
import dominio.Paciente;
import dominio.Prontuario;
import dominio.TipoPagamento;
import java.util.ArrayList;

public class PagamentoAtendimentoController {

//    private AtendimentoDao atendimentoDao;
//    private GerenciarProntuarioController gerenciarProntuario;
//    private ArrayList<Atendimento> ats;
//    private Prontuario prontuario;
//    public PagamentoAtendimentoController(String pacote) {
//        gerenciarProntuario = new GerenciarProntuarioController(pacote);
//        atendimentoDao = new AtendimentoDao(pacote);
//        ats = new ArrayList<>();
//    }
//
//    public void realizarPagamento(TipoPagamento pagamento) {
//        pagamento.operacaoPagamento(valorPagamento(prontuario.getPaciente()));
//        for(Atendimento atendimento : prontuario.getAtendimento()){
//            System.err.println(atendimento instanceof AtendimentoPrivado);
//            if(atendimento instanceof AtendimentoPrivado){
//                AtendimentoPrivado at = (AtendimentoPrivado) atendimento;
//                if(!at.isProcedimentoPago()){
//                    at.setProcedimentoPago(true);
//                }
//            }
//        }
//        gerenciarProntuario.atualizarProntuario(prontuario);
//    }
//
//    public Double valorPagamento(Paciente paciente){
//        Double valor = 0.0;
//         for(Atendimento atendimento : prontuario.getAtendimento()){
//            System.err.println(atendimento instanceof AtendimentoPrivado);
//            if(atendimento instanceof AtendimentoPrivado){
//                AtendimentoPrivado at = (AtendimentoPrivado) atendimento;
//                if(!at.isProcedimentoPago()){
//                   valor+=at.valorAtendimento();
//                }
//            }
//        }
//        return valor;
//    }
//    
//    public ArrayList<Atendimento> visualizarAtendimentos(Paciente paciente) {
//        this.prontuario = gerenciarProntuario.buscarProntuario(paciente);
//        ArrayList<Atendimento> atendimentos = new ArrayList<>();
//        for(Atendimento atendimento : prontuario.getAtendimento()){
//            System.err.println(atendimento instanceof AtendimentoPrivado);
//            if(atendimento instanceof AtendimentoPrivado){
//                AtendimentoPrivado at = (AtendimentoPrivado) atendimento;
//                if(!at.isProcedimentoPago()){
//                    atendimentos.add(atendimento);
//                }
//            }
//        }
//        ats = atendimentos;
//        return atendimentos;
//    }

}
