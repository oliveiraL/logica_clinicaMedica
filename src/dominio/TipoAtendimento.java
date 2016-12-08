package dominio;

public class TipoAtendimento {

    private /*@ spec_public @*/ int id;

    private /*@ spec_public @*/ String descricao;

    public TipoAtendimento() {
    }

    public TipoAtendimento(String descricao) {
        this.descricao = descricao;
    }
    
    

    public /*@ pure @*/ int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure @*/ String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
