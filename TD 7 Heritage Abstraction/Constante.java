public class Constante extends ExpAbstraite {
    private double valeur;

    public double getValeur () {
	return this.valeur;
    }
    
    public void setValeur (double valeur) {
	this.valeur = valeur;
    }

    public Constante (double valeur) {
	this.setValeur (valeur);
    }

    public double evaluer(Env env) {
	return this.valeur;
    }

    @Override 
	public String toStringInfixe () {
	String s;
	s = Double.toString(valeur);
	return s;
    }
}