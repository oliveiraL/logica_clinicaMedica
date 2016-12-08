package dominio;

public class Tratamento {

    private /*@ spec_public @*/  int id;

    private /*@ spec_public nullable @*/ String descricao;

    public Tratamento() {

    }

    public /*@ pure @*/ int getId() {
        return id;
    }

    //@ ensures this.id == id;
    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure nullable @*/ String getDescricao() {
        return descricao;
    }
    
    //@ ensures this.descricao == descricao;
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
