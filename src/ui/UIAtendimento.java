package ui;

import controller.AtendimentoController;
import dominio.Paciente;

public interface UIAtendimento {

	/**
	 *  
	 */
	public void iniciarAtendimento(Paciente paciente);

	/**
	 *  
	 */
	public void preescreverDiagnostico();

	/**
	 *  
	 */
	public void preescreverTratamento();

	/**
	 *  
	 */
	public void finalizarAtendimento();

}
