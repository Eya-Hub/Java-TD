package ex3;

public class Maison {
	private String type;
	private String adr;
	private int nbchambre;
	private float surface;
	public Maison (String adr, String t, int n) {
		this.adr = adr;
		type = t;
		nbchambre = n;
	} 
	public Maison (String adr, String t, int n, float s) {
		this.adr = adr;
		type = t;
		nbchambre = n;
		surface = s;
	}
	public float setSurface(float s) {
		return surface = s;
	
	}
	public float calculPrix(float pmc) {
		return(pmc*surface);
	}
	public float calculPrix() {
		return(2100*surface);
	} 
	public String toChaine() {
		return ("Un appartement de "+surface+"m² à Sousse avec "+nbchambre+" chambres");
	}
	
	public static void main(String[] args) {
		Maison m1 = new Maison("Tunis","un duplex",4,210);
		Maison m2 = new Maison("Nabeul","une villa",5);
		System.out.println(m1.toChaine());
		System.out.println(m2.toChaine());
		System.out.println("---------------------------------");
		m2.setSurface(230);
		System.out.println("Le prix de maison m1 est "+m1.calculPrix()+"dt");
		System.out.println("Le prix de maison m2 est "+m2.calculPrix()+"dt");
		System.out.println("---------------------------------");
		System.out.println("Le prix de maison m1 est "+m1.calculPrix(5000)+"dt");
		System.out.println("Le prix de maison m2 est "+m2.calculPrix(5000)+"dt");
	}
}
