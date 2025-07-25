package ex2;

public class MotDico {
	public static int count = 0;
	private int num;
	private String mot, definition;
	
	public MotDico(String mot, String definition) {
		this.mot = mot;
		this.definition = definition;
		num = count++;
	}
	
	public String getMot() {
		return mot;
	} 
	public String getDefinition() {
		return definition;
	} 
	public void setDefinition(String s) {
		definition = s;
	}
	public void setMot(String s) {
		mot = s;
	}
	public boolean synonyme(MotDico m) {
		return this.definition.equalsIgnoreCase(m.definition);
	}
	public void afficher() {
        System.out.println("N°" + num + "=> Mot: " + mot + ", Définition: " + definition);
    }
}
