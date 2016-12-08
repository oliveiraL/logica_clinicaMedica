package main;
import clinicaEstetica.dominio.DoctorEstetica;
import clinicaEstetica.dominio.PacienteEstetica;
import dominio.Especialidade;
import dominio.Especialista;
import clinicaEstetica.dominio.PacienteEstetica;
import controller.GerenciarPacienteController;
import dao.PacienteDao;
import dominio.Paciente;
import dominio.TipoAtendimento;
import validacoes.ValidacaoException;

public class Main {

	public static void main(String[] args) {
		Especialidade especialidade = new Especialidade("descricao", "designacao");
		DoctorEstetica doctor = new DoctorEstetica("crm", especialidade, "teste", "CPF", 15);
		TipoAtendimento tipoAtendimento = new TipoAtendimento("Tipo de Atendimento");
		try {
			especialidade.validarEspecialidade();
			doctor.validarEspecialista();
			tipoAtendimento.validarTipoAtendimento();
		} catch (ValidacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
