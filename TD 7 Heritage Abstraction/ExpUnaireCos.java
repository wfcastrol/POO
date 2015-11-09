public class ExpUnaireCos extends ExpUnaire  {
    public ExpUnaireCos (ExpAbstraite operande) {
	super.setOperande(operande);
    }
    
    public double evaluer(Env env) {
	return Math.cos(this.getOperande().evaluer(env));
    }
    
    @Override 
	public String toStringInfixe () {
	String s;
	s = "cos( ";
	s += super.getOperande().toStringInfixe  ();
	s += " )";
	return s;
    }
}