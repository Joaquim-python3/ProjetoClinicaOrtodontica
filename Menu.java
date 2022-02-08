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
				cadastrarCliente();
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
		System.out.println("| 4 - Revisão Geral |");//pergunta oque o paciente quer de especifico e pede um agendamento
		System.out.println("| 5 - Sair |");
		
		System.out.println("Digite uma opção: ");
		opcao = ent.nextInt();
	}
	
	public void cadastrarCliente() {
		
		System.out.println("Nome completo do cliente: ");
		String nome = ent.next();
		
		System.out.println("CPF do cliente: ");
		String cpf = ent.next();
		
		System.out.println("Data de nascimento: ");
		String dataNascimento = ent.next();
		
		System.out.println("O cliente deseja usar plano?\n1 - Sim\t2- Não");
		int n = ent.nextInt();
		
		switch(n) {
			case 1:
				
				Plano plano = new Plano(nome);
				
				System.out.println("Cliente com plano");
				System.out.println("Cliente cadastrado com sucesso");
				break;
				
			case 2:
				
				System.out.println("Cliente sem plano");
				System.out.println("Cliente cadastrado com sucesso");
				break;
			
		}
	}
	
	public void agendamentoConsulta() {
		
		System.out.println("Qual dia da semana que deseja realizar a consulta?\n1 - Segunda\t2 - Terça\n3 - Quarta\t4 - Quinta\t5 - Sexta");
		String 
		
		System.out.println("Horário da consulta: ");

	}
	
	public void funcionarios() {
		
		System.out.println("Digite o codigo do funcionario: ");
		String cdgFuncionario = ent.next(); // quando digitar vai aparacer os subopcoes para Funcionario 
		
		
	}
	
}
