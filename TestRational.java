public class TestRational {
    public static void main (String [] args) {
	Vector vec = new Vector ();
	Rational a = new Rational (2, 3);
	vec.set (0, a);
	Rational b = new Rational (3, 2);
	a.mult (b);
	vec.set (1, b);
	System.out.println(vec.toString());
    }
}