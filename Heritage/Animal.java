public class Animal {
    private String nom;
    private int poids;

    public void setNom (String Nom) {
	this.nom = Nom;
    }

    public String getNom () {
	return this.nom;
    }
    
    public void setPoids (int Poids) {
	this.poids = Poids;
    }

    public int getPoids () {
	return this.poids;
    }

    public Animal () {
	this.setNom (" ");
	this.setPoids (0);
    }

    public Animal (String Nom, int Poids) {
	this.setNom (Nom);
	this.setPoids (Poids);
    }

    public String toString () {
	return "Le nom de l'animal est " + this.getNom() + " et son poids est " + this.getPoids();
    }

    public void crier () {
	System.out.println(this.getNom() + " crie...");
    }
}