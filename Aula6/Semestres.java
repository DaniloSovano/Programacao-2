import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Semestres {
	public static void main(String[] args ) throws IOException {
		String mes;
		String primeiro[] = {"janeiro","fevereiro","março","abril","março","junho"};
		String segundo[] = {"julho","agosto","setembro","outubro","novembro","dezembro"};
		int mesInt = 0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o mes: ");
		mes = bf.readLine();
		mes = mes.toLowerCase();
		
		for (int i = 0; i < primeiro.length; i++) {
			if (mes.equals(primeiro[i])) {
				mesInt = 1;
				break;
			}
		}
		if(mesInt ==0) {
		for (int i = 0; i < segundo.length; i++) {
			if (mes.equals(segundo[i])) {
				mesInt = 2;
				break;
			}}}
				
		switch (mesInt){
		case 1:
			System.out.println("Primeiro semestre");
			break;
		case 2:
			System.out.println("Segundo semestre");
			break;
		default:
			System.out.println("Mes invalido");
			
		}	
	}
}
