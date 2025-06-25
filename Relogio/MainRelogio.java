
public class MainRelogio {
	public static void main(String[] args) {
		Relogio Brasilia = new Relogio(3,45);
		
		System.out.println("Horario de Brasília");
		System.out.println(Brasilia.toUniversalString());
		
		Relogio Washington = new Relogio(Brasilia);
		
		System.out.println("Horario de Washington antes de definir fuso horario");
		System.out.println(Washington.toUniversalString());
		

		Washington.fusoHorario(Washington,1);
		System.out.println("Horario de Washington após definir fuso horario");
		System.out.println(Washington.toUniversalString());
		
	}
}
