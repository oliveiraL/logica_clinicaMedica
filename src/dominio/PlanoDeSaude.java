package dominio;

public abstract class PlanoDeSaude {

	private /*@ spec_public @*/ int id;

	private /*@ spec_public nullable @*/ String nome;

	private /*@ spec_public nullable @*/ String registro;

	public abstract void regrasPagamento(Double valor);

}
