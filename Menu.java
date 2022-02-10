package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import Menu.Plano.tipoPlano;

public class Menu {
	
	ArrayList<Cliente> listaClientes = new ArrayList<>();
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

		switch (opcao) {
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
		System.out.println("| 4 - Revisão Geral |"); // pergunta oque o paciente quer de especifico e pede um
		System.out.println("| 5 - Outros |");
		System.out.println("| 6 - Sair |");

		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();
		
		switch(opcao) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				menuPrincipal();
				break;
		}

	}

	public void cliente() {

		System.out.println("##--MENU CLIENTE--##\\n\\n\"");
		System.out.println("| 1 - Cadastrar Cliente |");
		System.out.println("| 2 - Remover cliente |");
		System.out.println("| 3 - Consultas do cliente |");
		System.out.println("| 5 - Sair");

		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();

		switch (opcao) {

		case 1:
			
			Cliente cliente = new Cliente();
			Scanner ent = new Scanner(System.in);

			System.out.println("Nome completo do cliente: ");
			cliente.setNome(ent.next());

			System.out.println("CPF do cliente: ");
			cliente.setCpf(ent.next());

			System.out.println("Data de nascimento: ");
			cliente.setCpf(ent.next());
			
			System.out.println("Comorbidade :");
			cliente.setComorbidades(ent.next());

			System.out.println("O cliente deseja usar plano?\n1 - Sim\t2- Não");
			int n = ent.nextInt();
			
			if(n == 1) {
				cliente.isPlano(true);
				
				System.out.println("Qual o tipo de plano?\n1 - Familiar\t2 - Empresarial");
				int planoVar = ent.nextInt();
				
				switch(planoVar) {
					case 1:
						System.out.println("Quantidade de pessoas para o plano familiar: ");
						int qtdPessoas = ent.nextInt();
						Plano p = new Plano(tipoPlano.FAMILIAR, qtdPessoas);
						p.setQuantidadeDePessoas(qtdPessoas);
						p.calcularPlano(qtdPessoas, tipoPlano.FAMILIAR);

						
					case 2:
						System.out.println("Quantidade de pessoas para o plano empresarial: ");
						qtdPessoas = ent.nextInt();
						p = new Plano(tipoPlano.EMPRESARIAL, qtdPessoas);
						p.setQuantidadeDePessoas(qtdPessoas);
						p.calcularPlano(qtdPessoas, tipoPlano.EMPRESARIAL);
				}
				
			}else if(n == 2) {
				cliente.isPlano(false);
			}else {
				System.out.println("Valor inválido");
				
			}

		}

	}

	public void agendamentoConsulta() {

		System.out.println("Qual dia da semana que deseja realizar a consulta?\n1 - Segunda\t2 - Terça\n3 - Quarta\t4 - Quinta\t5 - Sexta");
		int dia = ent.nextInt();

		// essa parte ainda tem que ser definida melhor, pq talvez tenha uma classe de
		// agendamento
		System.out.println("HORÁRIO DA CONSULTA");
		System.out.println("horários disponíveis: " + "8:00\t10:00\t14:00" + "16:00\t18:00\t20:00");

		System.out.print("Digite um horario (numero antes dos ':'):");
		int h = ent.nextInt();
		Integer.toString(h);

	}

	public void funcionarios() {

		System.out.println("Digite o codigo do funcionario: ");
		String cdgFuncionario = ent.next(); // quando digitar vai aparacer os subopcoes para Funcionario

	}

}
