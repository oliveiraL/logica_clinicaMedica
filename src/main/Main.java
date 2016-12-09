package main;
import java.util.Date;

import clinicaEstetica.dominio.DoctorEstetica;
import clinicaEstetica.dominio.PacienteEstetica;
import clinicaEstetica.dominio.ProntuarioEstetica;
import dominio.Especialidade;
import dominio.Especialista;
import clinicaEstetica.dominio.PacienteEstetica;
import controller.GerenciarPacienteController;
import controller.GerenciarProntuarioController;
import dao.PacienteDao;
import dominio.Paciente;
import dominio.Prontuario;
import validacoes.ValidacaoException;

public class Main {

	public static void main(String[] args) {

		DoctorEstetica doctorEstetica = new DoctorEstetica();
		doctorEstetica.setCPF("asdas");
		doctorEstetica.setCrm("asda");
		doctorEstetica.setEspecialidade(new Especialidade());
		doctorEstetica.setNome("asd");
		doctorEstetica.setTempoProfissao(10);
		System.out.println(doctorEstetica.validarEspecialista());
		GerenciarPacienteController controller = new GerenciarPacienteController();
		GerenciarProntuarioController controller2 = new GerenciarProntuarioController();
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
		ProntuarioEstetica ppp = new ProntuarioEstetica(new Date());
		ppp.setPaciente(p);
		
		try {
			controller2.cadastrarProntuario(ppp);
			controller.cadastrarPaciente(p);
			controller.cadastrarPaciente(pp);
			System.out.println(controller.verificarExistencia(p));
			controller.removerPaciente(p);	
			p.setId(0);
			controller.removerPaciente(p);	
			System.out.println(controller.verificarExistencia(p));
			System.out.println(controller.buscarPaciente(1));
			
		} catch (ValidacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
