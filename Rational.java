class Rational {
    private int num;
    private int den;

    public void setNum (int num) {
	this.num = num;
    }

    public void setDen (int den) {
	if (den != 0) {
	    this.den = den;
	}
	else {
	    throw new IllegalArgumentException("Invariant sur num non respecte");
	}
    }

    public int getNum () {
	return this.num;
    }
    
    public int getDen () {
	return this.den;
    }

    public Rational (int num, int den) {
	setNum (num);
	setDen (den);
	irreductible ();
    }

    public Rational () {
	setNum (0);
	setDen (1);
    }

    public String toString () {
	return getNum() + "/" + getDen();
    }

    public void mult (Rational rat2) {
	setNum(getNum()*rat2.getNum());
	setDen(getDen()*rat2.getDen());
	irreductible ();
    }

    public void sum (Rational rat2) {
	setNum((getNum()*rat2.getDen()) + (getDen()*rat2.getNum()));
	setDen(getDen()*rat2.getDen());
	irreductible ();
    }

    public int pgcd (int a, int b) {
	if (a == 0)
	    return b;

	while (b != 0) {
	    if (a > b)
		a = a - b;
	    else
		b = b - a;
	}
	return a;
    }

    public void irreductible () {
	while (pgcd (getNum(), getDen()) != 1) {
	    int pgcd = pgcd (getNum(), getDen());
	    setNum (getNum() / pgcd);
	    setDen (getDen() / pgcd);
	}
    }
    
}