package dominio;

public class Responsavel {

    private /*@ spec_public nullable @*/int id;

    private /*@ spec_public nullable @*/String nome;

    private /*@ spec_public nullable @*/ String CPF;

    public Responsavel() {
    }

    public Responsavel(/*@ nullable @*/String nome,/*@ nullable @*/ String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public /*@ pure @*/ String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public /*@ pure @*/ String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
