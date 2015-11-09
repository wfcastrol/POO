public class Vache extends Animal {
    private int nombreTaches;

    public int getNombreTaches () {
	return this.nombreTaches;
    }

    public void setNombreTaches (int NombreTaches) {
	if (NombreTaches < 0) {
	    throw new IllegalArgumentException("Taches negatives !");
	}
	else {
	    this.nombreTaches = NombreTaches;
	}
    }
    
    public Vache () {
	super ();
	this.setNombreTaches (0);
    }

    public Vache (String Nom, int Poids, int NombreTaches) {
	super (Nom, Poids);
	this.setNombreTaches (NombreTaches);
    }

    @Override
	public void crier () {
	System.out.println(this.getNom() + ", vache de " + this.getPoids() + "kg a " + this.getNombreTaches() + " taches, crie... il meugle.");
    }

    @Override
	public String toString () {
	return "Le nom de la vache est " + this.getNom () + ", le poids est " + this.getPoids () + "et le nombre de taches est " + this.getNombreTaches ();
    }
}