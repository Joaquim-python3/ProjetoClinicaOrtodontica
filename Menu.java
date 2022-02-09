package Menu;

import java.util.Scanner;

public class Menu {
	
	Scanner ent = new Scanner(System.in);
	int opcao;
	
	public void menuPrincipal() {
		System.out.println("##--MENU PRINCIPAL--##\n\n");
		System.out.println("|---------------------|");
		System.out.println("| 1 - Serviços |"); // mostrar o plano, oque se pode fazer
		System.out.println("| 2 - Cliente |"); // informacoes do cliente
		System.out.println("| 3 - Funcionarios |"); // pegar informações do func // classe abstrata com heranca
		System.out.println("| 4 - Agendamento de consulta |"); // 
		System.out.println("| 5 - Sair |");
		
		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();
		
		switch(opcao) {
			case 1:
				servicos();
				break;
			case 2:
				cliente();
				break;
			case 3:
				funcionarios();
				break;
			case 4:
				agendamentoConsulta();
				break;
		}
	}
	
	// SERVICOS
	public void servicos() {
		
		System.out.println("##--MENU SERVICOS--##\\n\\n\"");
		System.out.println("| 1 - Clareamento |");
		System.out.println("| 2 - Procedimento estético |");
		System.out.println("| 3 - Remoção de cárie |");
		System.out.println("| 4 - Revisão Geral |"); //pergunta oque o paciente quer de especifico e pede um agendamento
		System.out.println("| 5 - Sair |");
		
		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();
		
	}
	
	public void cliente() {
		
		System.out.println("##--MENU SERVICOS--##\\n\\n\"");
		System.out.println("| 1 - Cadastrar Cliente |");
		System.out.println("| 2 - Remover cliente |");
		System.out.println("| 3 - Consultas do cliente|");
		System.out.println("| 5 - Sair");
		
		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();
		
		switch(opcao){
		case 5:
			break;
		}
		
	}
	
	public void agendamentoConsulta() {
		
		System.out.println("Qual dia da semana que deseja realizar a consulta?\n1 - Segunda\t2 - Terça\n3 - Quarta\t4 - Quinta\t5 - Sexta");
		int dia = ent.nextInt();
		
		// essa parte ainda tem que ser definida melhor, pq talvez tenha uma classe de agendamento
		System.out.println("HORÁRIO DA CONSULTA");
		System.out.println("horários disponíveis: "
				+ "8:00\t10:00\t14:00"
				+ "16:00\t18:00\t20:00");
		
		System.out.print("Digite um horario (numero antes dos ':'):");
		int h = ent.nextInt(); 
		Integer.toString(h);
		
	}
	
	public void funcionarios() {
		
		System.out.println("Digite o codigo do funcionario: ");
		String cdgFuncionario = ent.next(); // quando digitar vai aparacer os subopcoes para Funcionario 
		
	}
	
}
