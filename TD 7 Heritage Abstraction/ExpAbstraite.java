public abstract class ExpAbstraite {
    public abstract double evaluer(Env env);

    public abstract String toStringInfixe();
    
    public String toString () {
	return "Je suis une expression et me voila en notation infixée : " + this.toStringInfixe();
    }
}