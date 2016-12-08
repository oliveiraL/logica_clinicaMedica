package dominio;


public class Paciente extends Entidade {

	
      
    protected /*@ spec_public nullable @*/ String nome;

    protected /*@ spec_public nullable @*/  Responsavel responsavel;
    

    public Paciente() {
		// TODO Auto-generated constructor stub
	}
    
    //@ ensures this.nome == nome;
    public Paciente(String nome) {
        this.nome = nome;
    }
    
    

    /*
	 @ 	assignable \nothing;
	 @ 	ensures this.nome == \old(this.nome);
	 @ 	ensures (this.nome != null && this.nome != "") ==> (\result == true);
	 @ 	ensures (this.nome == null || this.nome == "") ==> (\result == false);
	*/
    public /*@ pure @*/ boolean validarPaciente(){
    	if(this.nome == null){
    		return false;
    	}if(this.nome.trim().isEmpty()){
    		return false;
    	}
    	return true;
    }
    

    public /*@ pure @*/ String getNome() {
        return nome;
    }

   
     /*
     @ ensures this.nome = nome;
     */
    public void setNome(/*@ nullable @*/String nome) {
        this.nome = nome;
    }

    public /*@ pure @*/ Responsavel getResponsavel() {
        return responsavel;
    }

    //@ ensures this.responsavel == responsavel;
    public void setResponsavel(/*@ nullable @*/Responsavel responsavel) {
        this.responsavel = responsavel;
    }

}
