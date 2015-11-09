public class ExpUnaireSin extends ExpUnaire  {
    public ExpUnaireSin (ExpAbstraite operande) {
	super.setOperande(operande);
    }
   
    public double evaluer(Env env) {
	return Math.sin(this.getOperande().evaluer(env));
    }

    @Override 
	public String toStringInfixe () {
	String s;
	s = "sin( ";
	s += super.getOperande().toStringInfixe  ();
	s += " )";
	return s;
    }
}