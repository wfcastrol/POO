public class Variable extends ExpAbstraite {
    private String nom;

    public String getNom () {
	return this.nom;
    }
    
    public void setNom (String nom) {
	this.nom = nom;
    }

    public Variable (String Nom) {
	this.setNom (Nom);
    }

    public double evaluer(Env env) {
	return env.obtenirValeur(this.nom);
    }

    @Override 
	public String toStringInfixe () {
	String s;
	s = nom;
	return s;
	}
}