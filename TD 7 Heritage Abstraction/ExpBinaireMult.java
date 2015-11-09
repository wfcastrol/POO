public class ExpBinaireMult extends ExpBinaire {
    public ExpBinaireMult (ExpAbstraite opGauche, ExpAbstraite opDroite) {
	super(opGauche,opDroite, "*");
    }
    
    public double evaluer(Env env) {
	return super.getOpGauche().evaluer(env) * super.getOpDroite().evaluer(env);
    }
    
}