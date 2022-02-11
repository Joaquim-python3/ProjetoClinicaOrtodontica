package Menu;

public class Agendamento {
	
	static String[][] horarios = new String[5][6];

	public void criarPlanilha() {
        
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 5; i++) {
				if (j == 0) {
					horarios[i][j] = "8:00";
				} else if (j == 1) {
					horarios[i][j] = "10:00";
				} else if (j == 2) {
					horarios[i][j] = "14:00";
				} else if (j == 3) {
					horarios[i][j] = "16:00";
				} else if (j == 4) {
					horarios[i][j] = "18:00";
				} else if (j == 5) {
					horarios[i][j] = "20:00";
				}
			}
		}
	}

	enum diaDaSemana {

		SEGUNDA(2), TERÇA(3), QUARTA(4), QUINTA(5), SEXTA(6);

		int valorDia;

		public int getValorDia() {
			return valorDia;
		}

		diaDaSemana(int valorDia) {
			this.valorDia = valorDia;
		}
	}

	public Agendamento(diaDaSemana mbl) {
		super();
		mbl = diaDaSemana.SEGUNDA;
	}

	public Agendamento() {
		super();
	}

	public void horariosDisponiveis(String[] semana, String[][] horarios) {
		
		for (int i = 0; i < 5; i++) {
			System.out.print(semana[i] + "\t");
		}
		System.out.println("");
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(horarios[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public void agendar(String[] semana, int dia, int g) {

		horarios[dia][g] = "INDIS.";

		System.out.println("Agendado com sucesso!!!");
		System.out.println("____________________________________________________________");

		System.out.println("");
		
		horariosDisponiveis(semana, horarios);

	}

}
