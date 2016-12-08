package dominio;

public abstract class AtendimentoPrivado extends Atendimento {

    protected /*@ spec_public @*/ boolean procedimentoPago;

    protected  /*@ spec_public @*/ PlanoDeSaude planoDeSaude;

    public AtendimentoPrivado() {
    }

    /**
     *
     * @return
     */
    public abstract Double valorAtendimento();

    public /*@ pure @*/ boolean isProcedimentoPago() {
        return procedimentoPago;
    }

    public void setProcedimentoPago(boolean procedimentoPago) {
        this.procedimentoPago = procedimentoPago;
    }

    public /*@ pure @*/ PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }


    
}
