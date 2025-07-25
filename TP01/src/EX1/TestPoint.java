package EX1;

public class TestPoint {

	public static void main(String[] args) {
		Point a = new Point ('A',2.5);
		a.affiche();
		Point b = new Point('B',5.25);
		b.affiche();
		b.translate(2.25);
		b.affiche();
	}

}
