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
		try {
			dao.salvar(p);
			controller.cadastrarPaciente(p);
		} catch (ValidacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
