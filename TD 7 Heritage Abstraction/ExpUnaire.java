public abstract class ExpUnaire extends ExpAbstraite {
    private ExpAbstraite operande;
    
    public ExpAbstraite getOperande () {
	return this.operande;
    }
    
    public void setOperande (ExpAbstraite operande) {
	this.operande = operande;
    }

}