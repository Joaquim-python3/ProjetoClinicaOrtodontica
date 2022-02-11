package Menu;

public class Agendamento {
	private boolean horarios=true;
	

	enum diaDaSemana{
		
	    SEGUNDA(2), TERÇA(3), QUARTA(4), QUINTA(5), SEXTA(6);
	    int valorDia;

	    public int getValorDia() {
	        return valorDia;
	    }

	    diaDaSemana(int valorDia) {
	        this.valorDia = valorDia;
	    }
	}
	
	
	public Agendamento(diaDaSemana mbl, boolean horario) {
		super();
		mbl = diaDaSemana.SEGUNDA;
		this.horarios = horarios;
	}
	
	public boolean isHorarios() {
		return horarios;
	}
	
	public void setHorarios(boolean horarios) {
		this.horarios = horarios;
	}
	
}
