package aula6;
// calculo constante e
public class NaperianBase {
	
	public static float fatorial(float num) {
		
		float soma = 1;
		for(int i = 1 ;i <= num; i++) {
			soma *= i;
		}
		
		return soma;
		
	}
	
	public static float constante(float n){
		
		
		float soma = 1;
		for(int i =1 ; i < n ; i++) {
			soma += 1 / fatorial(i);
		}
		return soma;
		
	}
	

	public static void main(String[] args) {
		double teste;
		
		teste = constante(100);
		System.out.println(teste);
		
	
	
	
}
}
