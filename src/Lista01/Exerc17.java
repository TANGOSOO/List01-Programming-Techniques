package Lista01;

public class Exerc17 {

	public static void main(String[] args) {
		int b=10, a=9;
		
		if(a>10 || a+b==20) {
			System.out.println("Número válido");
		}else if(a==b) {
			System.out.println("A == B");
		}
		
		if(a!=10 && b!=10 && a<10) {
			System.out.println("A < 10");
		}
		
		if((a>10 || a+b==20)==false && (a==b)==false && (a!=10 && b!=10 && a<10)==false) {
			System.out.println("Número não válido");
		}

	}

}
