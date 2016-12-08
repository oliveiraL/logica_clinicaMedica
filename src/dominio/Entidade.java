package dominio;

public abstract class Entidade {
	
	protected /*@ spec_public  @*/ int id;

    public /*@ pure @*/ int getId() {
        return id;
    }

    //@ ensures this.id == id;
    public void setId(int id) {
        this.id = id;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entidade other = (Entidade) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
    

	
	
}
