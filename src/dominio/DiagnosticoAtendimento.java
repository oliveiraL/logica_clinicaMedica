package dominio;

public class DiagnosticoAtendimento {

    private /*@ spec_public @*/ int id;

    private /*@ spec_public @*/ String descricao;

    public DiagnosticoAtendimento() {
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

    public /*@ pure @*/ Object getDiagnostico() {
        return null;
    }

    public /*@ pure @*/ Object getDadosAtendimento() {
        return null;
    }

}
