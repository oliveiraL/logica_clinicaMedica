package dominio;

public abstract class PlanoDeSaude {

	private /* @ spec_public @*/ int id;

	private /* @ spec_public @*/ String nome;

	private /* @ spec_public @*/ String registro;

	public abstract void regrasPagamento(Double valor);

}
