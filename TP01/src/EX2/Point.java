package EX2;

public class Point {
	private String Nom;//Les attribut doit etres tjrs private.
	private int Abs;
	private int Ord;
	
	public Point() {
    //constructeur par defaut pour initialiser les variables.
		Nom = " ";
		Abs = 0;
		Ord = 0;
	}
	
	public Point (int Abs,int Ord ) {  //constructeur N°1
    //this pour l'attribut de classe courante.
	this.Abs = Abs;
	this.Ord = Ord;

}
	public Point (String Nom ) {  //constructeur N°2
		this.Nom = Nom; 

	}
	
	public Point (String Nom,int Abs,int Ord ) {  //constructeur N°3
		this.Nom = Nom; 
		this.Abs = Abs;
		this.Ord = Ord;

	}
	public void Affiche() {
		System.out.println(Nom+"("+Abs+","+Ord+")");
	}
	
	public void TranslHoriz(int a) {
		this.Abs = a;
	}
	
	public void TranslVert(int a) {
		this.Ord = a;
	}
	
	public void Translation(int a, int b) {
		this.Abs = a;
		this.Ord = b;
	}
	
	public boolean Coincide(Point p) {
		if(this.Abs == p.Abs)
			return true;
		else
			return false;
	}
	
	public String getNom() {
		return this.Nom;
	}
	
	int getAbscisse() {
		return this.Abs;
	}
	
	int getOrdonnee() {
		return this.Ord;
	}
	
	void setNom(String ch) {
		this.Nom = ch;
	}
	
	void setAbscisse(int a) {
		this.Abs = a;
	}
	
	void setOrdonnee(int a) {
		this.Ord = a;
	}
}
