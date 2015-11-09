public class ExpBinairePlus extends ExpBinaire {
    public ExpBinairePlus (ExpAbstraite opGauche, ExpAbstraite opDroite) {
	super(opGauche,opDroite, "+");    
    }

    public double evaluer(Env env) {
	return this.getOpGauche().evaluer(env) + this.getOpDroite().evaluer(env);
    }
}