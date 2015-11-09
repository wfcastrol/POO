import java.util.HashMap;

public class Env {
    private HashMap<String, Double> map;

    public Env () {
	this.map = new HashMap<String,Double> ();
    }

    public void associer (String nom, double valeur) {
	this.map.put(nom, valeur);
    }

    public double obtenirValeur(String nom) {
	return this.map.get(nom);
    }

    @Override
    public String toString() {
	String s = "";
	for (String k: this.map.keySet()) {
	    s+=k + "->" + this.map.keySet()+"\n";
	}
	return s;
    }
}