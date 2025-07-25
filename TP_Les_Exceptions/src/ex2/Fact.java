package ex2;

public class Fact {
	public static void main(String[] args)
	throws Cas1_Exception{
		if(args.length==0){
			throw new Cas1_Exception();
		}
		else if(args < 0){
			throw new Cas3_Exception();
		}
		else {
			System.out.println(" Voila la factorielle des "+ args +" premiers entiers : "+  );
		}
	
	}	
}
