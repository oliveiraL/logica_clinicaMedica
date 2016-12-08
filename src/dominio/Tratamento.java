package dominio;

public class Tratamento {

    private /* @ spec_public @*/  int id;

    private /* @ spec_public @*/ String descricao;

    public Tratamento() {

    }

    public /* @ pure @*/ int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /* @ pure @*/ String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
