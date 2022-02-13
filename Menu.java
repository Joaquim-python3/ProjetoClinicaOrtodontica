package Menu;

import java.util.Scanner;

public class Menu {

	Scanner ent = new Scanner(System.in);
	int opcao;
	UsarCliente mCliente = new UsarCliente();
	UsarFuncionario mFuncionario = new UsarFuncionario();
	Agendamento ag = new Agendamento();
	Plano p = new Plano();

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
			menuFuncionarios();
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

		System.out.println("##--SERVICOS--##\n\n");
		System.out.println("| Diagnóstico|");
		System.out.println("| Prevenção |");
		System.out.println("| Odontopediatria |");
		System.out.println("| Dentística |"); // pergunta oque o paciente quer de especifico e pede um
		System.out.println("| Endodontia |");
		System.out.println("| Periodontia |");
		System.out.println("| Prótese |");
		System.out.println("| Cirurgia |");
		System.out.println("| Ortodontia |");
		System.out.println("| Radiologia |");
		System.out.println("| 1 - Sair |");

		System.out.println("Digite 1 para sair: ");
		opcao = ent.nextInt();
		if (opcao == 1) {
			menuPrincipal();
		}
	}

	public void menuCliente() {

		System.out.println("##--MENU CLIENTE--##\n\n");
		System.out.println("| 1 - Cadastrar Cliente |");
		System.out.println("| 2 - Remover cliente |");
		System.out.println("| 3 - Horários disponíveis |"); // vai mostrar todas as consultas
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
			System.out.println("Cliente removido com sucesso");
			menuCliente();
			break;

		case 3: // mostrar os horarios disponiveis

			ag.horariosDisponiveis();
			menuPrincipal();
			break;

		case 4: // consultar

			System.out.println("Digite um nome: ");
			String nomeConsultar = ent.next();

			for (Plano cliente : mCliente.getListaC()) { // podemos chamar isso de gambiarra?

				if (cliente.getNome().equalsIgnoreCase(nomeConsultar)) {

					System.out.println("nome=" + cliente.getNome());
					System.out.println("cpf=" + cliente.getCpf());
					System.out.println("comorbidades=" + cliente.getComorbidades());

					if (cliente.isPlano() == true) {

						if (mCliente.getPlanoVar() == 1) {

							System.out.println("tipo do plano= familiar");

						} else if (mCliente.getPlanoVar() == 2) {

							System.out.println("tipo do plano= empresarial");

						}

						// isso aqui é um erro, resolver com a professora
						System.out.println("quantidade de pessoas no plano=" + cliente.getQuantidadeDePessoas());

					}
					System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");

				}

			}

			menuPrincipal();
			break;

		case 5:
			menuPrincipal();
			break;
		}

	}

	public void menuFuncionarios() {

		System.out.println("##--MENU FUNCIONARIO--##\n\n");
		System.out.println("| 1 - Cadastrar funcionario |");
		System.out.println("| 2 - Remover funcionario |");
		System.out.println("| 3 - Pagamento em assiduidade |");
		System.out.println("| 4 - Consultar |");
		System.out.println("| 5 - Sair");

		System.out.println("Digite uma opcao: ");
		int opcao = ent.nextInt();

		switch (opcao) {
		case 1:

			mFuncionario.cadastrarFuncionario();
			menuFuncionarios();
			break;

		case 2:

			Funcionario ajudaFunc = new Funcionario();

			System.out.println("Digite um nome para ");
			String nomeRemoverFunc = ent.next();

			for (Funcionario f : mFuncionario.getListaFuncionario()) {

				if (f.getNome().equalsIgnoreCase(nomeRemoverFunc)) {
					ajudaFunc = f;

				}

			}

			mFuncionario.getListaFuncionario().remove(ajudaFunc);
			menuPrincipal();
			break;

		case 3: // assiduidade

			System.out.println("Digite o código do funcionário: ");
			int cdg1 = ent.nextInt();

			for (Funcionario func : mFuncionario.getListaFuncionario()) {

				if (func.getCodigo() == cdg1) {

					System.out.println("Quantidade de dias do funcionário presente no trabalho? \nDias úteis no mês: 20");
					int qtdDias = ent.nextInt();

					System.out.println("Salário líquido do mês: " + mFuncionario.pagamentoAssiduidade(qtdDias));

				} else {
					System.out.println("Valor inválido");
				}

			}

			menuPrincipal();
			break;

		case 4: // consultar

			System.out.println("Digite o código do funcionário: ");
			int cdg = ent.nextInt();

			for (Funcionario func : mFuncionario.getListaFuncionario()) {

				if (func.getCodigo() == cdg) {

					System.out.println("nome=" + func.getNome());
					System.out.println("salario=" + func.getSalario());
					System.out.println("cpf=" + func.getCpf());

				}
			}

			menuPrincipal();
			break;
		case 5:

			menuPrincipal();
			break;
		default:

			System.out.println("erro");
			break;
		}
	}

}
