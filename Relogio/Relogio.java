
public class Relogio {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Relogio(int hora,int minuto, int segundo) {
		if (hora < 0 || hora >= 24) {
			throw new IllegalArgumentException("Hora está incorreto.");
		}else if (minuto < 0 || minuto >= 60) {
			throw new IllegalArgumentException("minuto está incorreto.");
		}else if (segundo < 0 || segundo >= 60){
			throw new IllegalArgumentException("Segundo está incorreto.");
		}
		
	this.hora = hora;
	this.minuto = minuto;
	this.segundo = segundo;
	
	}
	
	public Relogio(int hora,int minuto) {
		this(hora,minuto,0); 
	
	}
	
	public Relogio(int hora) {
		this(hora,0,0); 
			
	}
	public Relogio(Relogio r) {
		this(r.getHora(),r.getMinuto(),r.getSegundo());
		
		
	}

	public int getHora() {
		return hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void setMinuto(int minuto) {
		this.minuto= minuto;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
		
	}
	
	public String toUniversalString() {
		return String.format("%d:%d:%d",hora,minuto,segundo);
		
	}
	public void fusoHorario(Relogio r ,int fuso) {
		if (fuso > 0) {
			r.setHora(r.getHora() - fuso);
		}else {
			r.setHora(r.getHora() + fuso);
		}
		
		
	}

}
