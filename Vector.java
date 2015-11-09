class Vector {
    private Rational [] tab;

    public void setTab (Rational []  tab) {
	this.tab = tab;
    }
    
    public Rational [] getTab () {
	return this.tab;
    }

    public Vector () {
	tab = new Rational [2];
	Rational a = new Rational (0, 1);
	Rational b = new Rational (0, 1);
	tab [0] = a;
	tab [1] = b;
    }

    public Vector (Rational rat1, Rational rat2) {
	tab = new Rational [2];
	tab [0] = rat1;
	tab [1] = rat2;
    }

    public String toString () {
	return "( " + tab[0] + " , " + tab[1] + " )";
    }
    
    public void set (int i, Rational r) {
	if (i < 2) {
	    tab [i] = r;
	}
	else {
	    throw new IllegalArgumentException("Invariant sur num non respecte");
	}
    }
}