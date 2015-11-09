public class Puissance extends ExpBinaire {
    public ExpBinairePlus (ExpAbstraite opGauche, ExpAbstraite opDroite) {
	super(opGauche,opDroite, "^");    
    }

    public double evaluer(Env env) {
	return Math.pow(this.getOpGauche().evaluer(env), this.getOpDroite().evaluer(env));
    }
}