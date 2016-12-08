package dominio;

public class Responsavel {

    private /* @ spec_public @*/int id;

    private /* @ spec_public @*/String nome;

    private /* @ spec_public @*/ String CPF;

    public Responsavel() {
    }

    public Responsavel(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /* @ pure @*/ String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public /* @ pure @*/ String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
