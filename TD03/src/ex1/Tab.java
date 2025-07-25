package ex1;
import java.util.Scanner;

public class Tab {
public static final int NMAX = 40;
	
	public static void remplir(float t[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez "+t.length+" valeurs :");
		System.out.println("-----------------------------------");
		for(int i=0;i<t.length;i++) {
			System.out.println("Entrez la valeur N°"+(i+1)+" : ");
			t[i] = sc.nextFloat();
		}
		
	}
	public static float somme_element(float t[]) {
		float somme = 0;
		for(int i=0;i<t.length;i++) {
			somme += t[i];
		}
		return somme;
	}
	public static void additionner(float t1[], float t2[]) {
		for(int i = 0;i<t1.length;i++) {
			t2[i] += t1[i];
		}
		lister(t2);
	}
	public static void produit(float x, float t[]) {
		for(int i = 0;i<t.length;i++) {
			t[i] *= x;
		}
		lister(t);
	}
	public static void lister(float t[]) {
		for(int i = 0;i<t.length;i++) {
			String form = String.format("%.2f", t[i]);
			System.out.println("T["+(i+1)+"] : "+form);
		}
	}
	public static void moyenne(float x, float t1[], float t2[]) {
		for(int i = 0;i<t1.length;i++) {
			t1[i] /= x;
			t2[i] = t1[i];
		}
	}
	public static void additionner(float x, float t[]) {
		for(int i = 0;i<t.length;i++) {
			t[i] += x;
		}
	}

}
