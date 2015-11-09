public abstract class ExpBinaire extends ExpAbstraite {
    private ExpAbstraite opGauche;
    private ExpAbstraite opDroite;
    private String operateur;

    public ExpBinaire (ExpAbstraite opGauche, ExpAbstraite opDroite, String operateur) {
	this.opGauche = opGauche;
	this.opDroite = opDroite;
	this.operateur = operateur;
    }

    public ExpAbstraite getOpGauche () {
	return this.opGauche;
    }
    
    public void setOpGauche (ExpAbstraite opGauche) {
	this.opGauche = opGauche;
    }

    public ExpAbstraite getOpDroite () {
	return this.opDroite;
    }
    
    public void setOpDroite (ExpAbstraite opDroite) {
	this.opDroite = opDroite;
    }

    @Override 
	public String toStringInfixe () {
	String s;
	s = "( ";
	s += this.getOpGauche().toStringInfixe ();
	s += " " + this.operateur + " ";
	s += this.getOpDroite().toStringInfixe ();
	s += " )";
	return s;
    }
}