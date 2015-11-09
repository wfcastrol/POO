public class TestZoo {
    public static void main (String[] args) {
	
	Zoo Ensimag = new Zoo("Ensimag");
	
	Animal Catherine = new Animal("Catherine", 50);
	Animal Gwen = new Animal("Gwen", 52);
	Animal Nicolas = new Animal("Nicolas", 80);
	
	Ensimag.ajouteAnimal (Catherine);
	Ensimag.ajouteAnimal (Gwen);
	Ensimag.ajouteAnimal (Nicolas);

	Lion Simba = new Lion("Simba", 50);
	Tigre Tony = new Tigre("Tony", 60);
	Vache Matthieu = new Vache("Matthieu", 80, 10);
	Cannard Sylvain = new Cannard("Sylvain", 30, "Blanches");

	Ensimag.ajouteAnimal (Simba);
	Ensimag.ajouteAnimal (Tony);
	Ensimag.ajouteAnimal (Matthieu);
	Ensimag.ajouteAnimal (Sylvain);

	Ensimag.crier();
    }
}