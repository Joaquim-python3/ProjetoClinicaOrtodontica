package Menu;

public class Principal {
	public static void main(String[] args) {
		Agendamento ag = new Agendamento();
		ag.criarPlanilha();

		Menu menu = new Menu();
		
		menu.menuPrincipal();
		
	}
}
