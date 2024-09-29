package Pack2;

public class Point {
	private char id ;
	private double abs ;

	public Point (char c, double x) {
	id = c ;
	abs = x ;
	}
	public void affiche ()
	{System.out.println("Point identifié par "+id+" d'abscisse 2.5");}
	public void translate (double dx)
	{ abs += dx ; }
}
