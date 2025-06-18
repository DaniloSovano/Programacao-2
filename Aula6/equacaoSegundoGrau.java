package aula;

public class Funcao {

	double a;
	double b;
	double c;
	
	public static double[] calcularRaizes(double a, double b, double c) {
		
		
		double delta = (Math.pow(b, 2)) - (4*a*c);
		double x1 = (-b + Math.sqrt(delta))/ 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2*a;
		
		double[] result = {x1,x2};
		return result;
	}
  
	public static int[] gerarEquacao(int x1, int x2) {
		
		int[] equacao = ;
		
		
	}
	
	
	
}
