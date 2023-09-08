package Lista02;

public class Utilidades {
	
	//Exercicio 1:
	public static float somatorioMenos2(float vet[]) {
		
		float sum=0;
		
		for(int i=2; i<vet.length-2; i++) {
			sum+=vet[i];
		}
		return sum;
	}
	
	//Exercicio 2:
	public static void numerosPares(int inicio, int fim) {
		
		for(int i=inicio+1; i<fim; i++) {
			if(i%2==0) {
				System.out.println(i + " ");
			}
		}
	}
	
	//Exercicio 3:
	public static float media(float vet1[], float vet2[]) {
		return (float)(somatorio(vet1)+somatorio(vet2))/(vet1.length+vet2.length);
	}
	
	//Exercicio 4:
	public static float mediaPonderada(float vet1[], float vet2[]) {
		
		float sum=0;
		
		for(int i=0; i<vet1.length; i++) {
			sum+=vet1[i]*vet2[i];
		}
		
		return sum/somatorio(vet2);
	}
	
	//Exercicio 5:
	public static int contagemDeElementos(int vet1[], int vet2[], int num) {
		
		int sum=0;
		
		for(int i=0; i<vet1.length; i++) {
			if(num==vet1[i]) {
				sum++;
			}
		}
		for(int i=0; i<vet2.length; i++) {
			if(num==vet2[i]) {
				sum++;
			}
		}
		
		return sum;
	}
	
	//Exercicio 6:
	public static float[] copiarVetor(float vet1[]) {
		
		float vet2[]=new float[vet1.length];
		
		for(int i=0; i<vet1.length; i++) {
			vet2[i]=vet1[i];
		}
		
		return vet2;
	}
	
	//Exercicio 7:
	public static float[] ordemCrescente(float vet1[]) {
		
		float vet[]=copiarVetor(vet1);
		
		for(int i=0; i<vet.length-1; i++) {
			for(int j=0; j<vet.length-1; j++) {
				if(vet[j]>vet[j+1]) {
					vet[j]=vet[j]+vet[j+1];
					vet[j+1]=vet[j]-vet[j+1];
					vet[j]=vet[j]-vet[j+1];
				}
			}
		}
		return vet;
	}
	
	//Exercicio 8:
	public static boolean verificarOrdenacao(float vet[]) {
		
		for(int i=0; i<vet.length-1; i++) {
			if(vet[i]>vet[i+1]) {
				return false;
			}
		}
			return true;
	}
	
	//Exercicio 9:
	public static float maiorValor(float vet1[], int k) {
		float vet2[]=ordemDecrescente(vet1);
		return vet2[k-1];
	}
	
	//Exercicio 10:
	public static float menorValor(float vet1[], int k) {
		float vet2[]=ordemCrescente(vet1);
		return vet2[k-1];
	}
	
	//Exercicio 11:
	public static boolean verificarIgualdade(float vet1[], float vet2[]) {
		
		if(vet1.length!=vet2.length) {
			return false;
		}
		
		for(int i=0; i<vet1.length; i++) {
			if(vet1[i]!=vet2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	//Exercicio 12:
	public static float potenciacao(float base, float expoente) {
		
		float potencia=1;
		
		for(int i=0; i<expoente; i++) {
			potencia*=base;
		}
		
		return potencia;
	}
	
	//Exercicios 13 e 17:
	public static boolean primo(int num) {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//Exercicio 14:
	public static float[] ocorrencia(float vet1[], float vet2[]) {
		
		int cont=0;
		for(int i=0; i<vet1.length; i++) {
			for(int j=0; j<vet2.length; j++) {
				if(vet1[i]==vet2[j]) {
					cont++;
					break;
				}
			}
		}
		System.out.println(cont);
		
		float vet3[]=new float[cont];
		
		cont=0;
		int cont2=0;
		for(int k=0; k<vet3.length; k++) {
			cont2=0;
			for(int i=cont; i<vet1.length; i++) {
				for(int j=0; j<vet2.length; j++) {
					if(vet1[i]==vet2[j]) {
						vet3[k]=vet2[j];
						cont2++;
						break;
					}
				}
				cont++;
				if(cont2>0) {
					break;
				}
			}
		}
		return vet3;
	}
	
	//Exercicio 15:
	public static float[] remocaoDeElemento(float vet1[], float num) {
		
		int cont=0;
		
		for(int i=0; i<vet1.length; i++) {
			if(vet1[i]==num) {
				cont++;
			}
		}
		
		float vet2[]=new float[vet1.length-cont];
		
		cont=0;
		for(int i=0; i<vet2.length; i++) {
			for(int j=cont; j<vet1.length; j++) {
				if(vet1[j]!=num) {
					vet2[i]=vet1[j];
					cont++;
					break;
				}
				cont++;
			}
		}
		
		return vet2;
	}
	
	//Exercicio 16:
	
	public static boolean verificacaoPalindromo(String str) {
		
		String strrv=inversaoDeString(str);
		
		if(strrv.equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	
	//Exercicio 18:
	public static String inversaoDeString(String str) {
		
		String strrv="";
		char c;
		
		for(int i=str.length()-1; i>=0; i--) {
			c=str.charAt(i);
			strrv=strrv+c;
		}
		
		return strrv;
	}
	
	//Exercicio 19:
	public static float calcularJuros(float valorinicial, float taxa, float duracao) {
		float tempo=potenciacao(1+taxa, duracao);
		return valorinicial*tempo;
	}
	
	//Exercicio 20:
	public static boolean verificacaoNumeroPerfeito(int num) {
			
		int som=0;
		
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				som+=i;
			}
		}
		if(som==num) {
			return true;
		}else {
			return false;
		}
	}
	
	//Exercicio 21:
	public static int diminuirVetor(int num) {
		int vet[]=new int[num];
		
		System.out.println("Tamanho do vetor: " + vet.length);
		if(num==1) {
			return 0;
		}
		return diminuirVetor(num-1);
	}
	
	//Exercicio 22 A:
	public static void matrizA(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	//Exercicio 22 B:
	public static void matrizB(int n) {
		
		int cont=0;
		boolean par=false;
		
		if(n%2==0) {
			par=true;
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(cont%2==0) {
					System.out.print("@ ");
				}else {
					System.out.print("* ");
				}
				cont++;
			}
			if(par==true) {
				cont++;
			}
			System.out.println();
		}
	}
	
	//Exercicio 22 C:
	public static void matrizC(int n) {
		
		int meio=n/2;
		boolean par=false;
		
		if(n%2==0) {
			par=true;
		}
		
		for(int i=0; i<n; i++) {
			if(i%2!=0 && par==true) {
				meio--;
			}
			if(i%2!=0) {
				for(int j=0; j<n; j++) {
					if(j==meio) {
						System.out.print("@ ");
					}else {
						System.out.print(j + " ");
					}
				}
			}else {
				for(int j=n-1; j>=0; j--) {
					if(j==meio) {
						System.out.print("@ ");
					}else {
						System.out.print(j + " ");
					}
				}
			}
			if(i%2!=0 && par==true) {
				meio++;
			}
			System.out.println();
			if(i==meio-1) {
				for(int k=0; k<n; k++) {
					System.out.print("@ ");
				}
				System.out.println();
				i++;
			}
		}
	}
	
	//Exercicio 22 D:
	public static void matrizD(int n) {
		
		for(int i=0; i<n; i++) {
			if(i==0) {
				for(int j=0; j<n; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
				continue;
			}
			if(i==n-1) {
				for(int j=n-1; j>=0; j--) {
					System.out.print(j + " ");
				}
				break;
			}
			for(int j=0; j<n; j++) {
				if(j==0) {
					System.out.print(i + " ");
				}else if(j!=n-1) {
					System.out.print("* ");
				}else {
					System.out.print(j-i + " ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	//Exercicio 22 E:
	public static void matrizE(int n) {
		
		int meio=n/2;
		
		for(int i=0; i<n; i++) {
			if(i<meio) {
				for(int j=0; j<n; j++) {
					if(j<meio) {
						System.out.print("# ");
					}else if(j==meio) {
						System.out.print("|| ");
					}else {
						System.out.print("! ");
					}
				}
			}
			if(i==meio) {
				for(int j=0; j<n; j++) {
					System.out.print("= ");
				}
			}
			if(i>meio) {
				for(int j=0; j<n; j++) {
					if(j<meio) {
						System.out.print("* ");
					}else if(j==meio) {
						System.out.print("|| ");
					}else {
						System.out.print("% ");
					}
				}
			}
			System.out.println();
		}
	}
	
	//Exercicio 22 F:
	public static void matrizF(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==i) {
					System.out.print(j + " ");
				}else if(j==n-i-1) {
					System.out.print(j+ " ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	//Metodos Auxiliares:
	public static float somatorio(float vet[]) {
		
		float sum=0;
		
		for(int i=0; i<vet.length; i++) {
			sum+=vet[i];
		}
		return sum;
	}
	
	public static float[] ordemDecrescente(float vet1[]) {
			
		float vet[]=copiarVetor(vet1);
			
		for(int i=0; i<vet.length-1; i++) {
			for(int j=0; j<vet.length-1; j++) {
				if(vet[j]<vet[j+1]) {
					vet[j]=vet[j]+vet[j+1];
					vet[j+1]=vet[j]-vet[j+1];
					vet[j]=vet[j]-vet[j+1];
				}
			}
		}
		return vet;
	}
}
