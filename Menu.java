package Menu;

import java.util.Scanner;

public class Menu {

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
		case 5:

			break;
		}
	}

	// SERVICOS
	public void servicos() {

		System.out.println("##--MENU SERVICOS--##\n\n");
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
			menuPrincipal();
			break;

		}

	}

	public void menuCliente() {

		System.out.println("##--MENU CLIENTE--##\n\n");
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
			
			Cliente ajuda = new Cliente();
			
			System.out.println("Digite o nome do cliente: ");
			String nomeParaRemover = ent.next();

			for (Cliente c : mCliente.getListaC()) {
				
				if (c.getNome().equalsIgnoreCase(nomeParaRemover)) {
					ajuda = c;
					
				}
				
			}

			mCliente.getListaC().remove(ajuda);
			menuCliente();
			break;

		case 3: // mostrar os horarios disponiveis

			ag.horariosDisponiveis();
			break;

		case 4: // consultar
			
			
			
			for (Cliente cliente : mCliente.getListaC()) { // podemos chamar isso de gambiarra?
				
				System.out.println("Digite um nome: ");
				String nomeConsultar = ent.next();
				
				if(cliente.getNome().equalsIgnoreCase(nomeConsultar)) {
					
					System.out.println("nome="+cliente.getNome());
					System.out.println("cpf="+cliente.getCpf());
					System.out.println("comorbidades="+cliente.getComorbidades());
					System.out.println("tem plano= "+cliente.isPlano());
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
					
				}else{ 
					
					System.out.println("nenhuma pessoa com esse nome foi cadastrado");
					
				}
				
			}

			menuPrincipal();
			break;

		case 5:
			menuPrincipal();
		}

	}

	public void funcionarios() {

		System.out.println("Digite o codigo do funcionario: ");
		ent.next();

	}

}
