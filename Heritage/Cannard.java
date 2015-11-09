public class Cannard extends Animal {
    private String couleurPlume;

    public String getCouleurPlume () {
	return this.couleurPlume;
    }
    
    public void setCouleurPlume (String CouleurPlume) {
	this.couleurPlume = CouleurPlume;
    }
    
    public Cannard () {
	super ();
	this.setCouleurPlume (" ");
    }
    
    public Cannard (String Nom, int Poids, String Couleur) {
	super (Nom, Poids);
	this.setCouleurPlume (Couleur);
    }

    @Override
	public void crier () {
	System.out.println(this.getNom() + ", cannard de " + this.getPoids() + "kg aux belles plumes " + this.getCouleurPlume() + " , crie... il cancane.");
    }
}