package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	ArrayList<Plano> listaPlanos = new ArrayList<>();
	
	Scanner ent = new Scanner(System.in);
	int opcao;
	UsarCliente mCliente = new UsarCliente();
	Agendamento ag = new Agendamento();

	public void menuPrincipal() {

		System.out.println("##--MENU PRINCIPAL--##\n\n");
		System.out.println("|---------------------|");
		System.out.println("| 1 - Serviços |"); // mostrar o plano, oque se pode fazer
		System.out.println("| 2 - Cliente |"); // informacoes do cliente
		System.out.println("| 3 - Funcionarios |"); // pegar informações do func // classe abstrata com heranca
		System.out.println("| 4 - Agendamento de consulta |"); // pedir o nome e selecionar data da consulta 
		System.out.println("| 5 - Sair |");

		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();

		switch (opcao) {
		case 1:
			servicos();
			break;
			
		case 2:
			menuCliente();
			break;
			
		case 3:
			funcionarios();
			break;
			
		case 4:
			mCliente.agendarConsulta();
			menuPrincipal();
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
		System.out.println("| 5 - Sair |");
		
		// esse servicos 
		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();

		switch (opcao) {
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

	public void menuCliente() {

		System.out.println("##--MENU CLIENTE--##\\n\\n\"");
		System.out.println("| 1 - Cadastrar Cliente |");
		System.out.println("| 2 - Remover cliente |");
		System.out.println("| 3 - Consultas de todos os clientes |"); // vai mostrar todas as consultas
		System.out.println("| 4 - Consultar |");
		System.out.println("| 5 - Sair");

		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();

		switch (opcao) {

		case 1:
			
			mCliente.cadastrarCliente();
			menuCliente();
			break;
			
		case 2:
			
			System.out.println("Digite o nome do cliente: ");
			String nomeParaRemover = ent.next();
			
			Plano plano = new Plano();
			
			for (Plano p : listaPlanos) {
				if(p.getNome().equalsIgnoreCase(nomeParaRemover)) {
					plano = p;
				}
			}
			
			listaPlanos.remove(plano);
			menuCliente();
			break;
			
		case 3:
			ag.horariosDisponiveis(null, null);
			break;
			
		case 4:
			
			break;
		}

	}
	
	public void funcionarios() {

		System.out.println("Digite o codigo do funcionario: ");
		String cdgFuncionario = ent.next(); // quando digitar vai aparacer os subopcoes para Funcionario
		
	}

}
