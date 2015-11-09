public class Lion extends Animal {
 
    public Lion () {
	super();
    }
    
    public Lion (String Nom, int Poids) {
	super (Nom, Poids);
    }
    
    @Override
	public void crier () {
	System.out.println(this.getNom() + ", lion de " + this.getPoids() + "kg crie... il rugi.");
    }
   
}