package dao;


import dominio.Especialista;



public class EspecialistaDao extends GenericDao{


//    public EspecialistaDao(String pacote) {
//        super(System.getProperty("user.dir") + "/src/"+pacote+"/especialista.xml");
//        System.out.println(listagem.size());
//        
//    }
//
//    public void salvar(Especialista especialista) {
//        especialista.setId(listagem.size()+1);
//        listagem.add(especialista);
//        super.salvar();
//    }
//
//    public void atualizar(Especialista especialista) {
//        int i = 0;
//        Especialista alterar = null;
//        for (Especialista aux : listagem) {
//            if (aux.getId() == especialista.getId()) {
//                alterar = especialista;                
//            }
//            i++;
//        }
//        listagem.remove(alterar);
//        listagem.add(i,especialista);
//        super.atualizar();
//    }
//
//    public void remover(Especialista especialista) {
//        Especialista remover = null;
//        for (Especialista aux : listagem) {
//            if (aux.getId() == especialista.getId()) {
//                remover = aux;
//                break;
//            }
//        }
//        listagem.remove(remover);
//        super.remover();
//    }
//
//    
//    public Especialista buscar(String CPF){
//        Especialista especialista = null;
//        for(Especialista aux : listagem){
//            if(aux.getCPF() == null ? CPF == null : aux.getCPF().equals(CPF))
//                especialista = aux;
//        }
//        
//        return especialista;
//    }



}
