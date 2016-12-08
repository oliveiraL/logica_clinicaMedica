package dominio;



public abstract class Notificacao {

    private /*@ spec_public nullable @*/ String mensagem;
    
  /*@ ensures this.mensagem == mensagem;
    @*/
    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract void enviar();

    public /*@ pure nullable @*/ String getMensagem() {
        return mensagem;
    }
    
    //@ ensures this.mensagem == mensagem;
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
