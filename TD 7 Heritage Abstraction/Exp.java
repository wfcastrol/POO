public class Exp extends ExpUnaire {
    public Exp (ExpAbstraite operande) {
	super.setOperande(operande);
    }
    
    public double evaluer(Env env) {
	return Math.exp(this.getOperande().evaluer(env));
    }
    
    @Override 
	public String toStringInfixe () {
	String s;
	s = "exp (";
	s += super.getOperande().toStringInfixe  ();
	s += " )";
	return s;
    }
}