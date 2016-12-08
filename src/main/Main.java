package main;
import clinicaEstetica.dominio.DoctorEstetica;
import clinicaEstetica.dominio.PacienteEstetica;
import dominio.Especialidade;
import dominio.Especialista;
import clinicaEstetica.dominio.PacienteEstetica;
import controller.GerenciarPacienteController;
import dao.PacienteDao;
import dominio.Paciente;
import validacoes.ValidacaoException;

public class Main {

	public static void main(String[] args) {

		GerenciarPacienteController controller = new GerenciarPacienteController();
		PacienteDao dao = new PacienteDao();
		// TODO Auto-generated method stub
		PacienteEstetica p = new PacienteEstetica();
		p.setCPF("qwe");
		p.setEmail("asda");
		p.setIdade(20);
		p.setNome("asd");
		p.setResponsavel(null);
		p.setTelefone("qwe");
		
		PacienteEstetica pp = new PacienteEstetica();
		pp.setCPF("qwe");
		pp.setEmail("asda");
		pp.setIdade(20);
		pp.setNome("asd");
		pp.setResponsavel(null);
		pp.setTelefone("qwe");
		
		
		try {
			controller.cadastrarPaciente(p);
			controller.cadastrarPaciente(pp);
			System.out.println(controller.verificarExistencia(p));
			controller.removerPaciene(p);			
			System.out.println(controller.verificarExistencia(p));
			System.out.println(controller.buscarPaciente(1));
			
		} catch (ValidacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
