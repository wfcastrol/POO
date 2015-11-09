public class Tigre extends Animal {
    
    public Tigre () {
	super ();
    }

    public Tigre (String Nom, int Poids) {
	super (Nom, Poids);
    }
    
    @Override
	public void crier () {
	System.out.println(this.getNom() + ", tigre de " + this.getPoids() + "kg crie... il rugi.");
    }
}