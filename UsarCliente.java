package Menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Menu.Plano.tipoPlano;

public class UsarCliente {

	Scanner ent = new Scanner(System.in);
	Collection<Plano> listaC = new ArrayList<>();

	int n;
	boolean plano;
	int planoVar;
	int qtdPessoas;

	public void cadastrarCliente() {
		
		Scanner ent = new Scanner(System.in);

		System.out.print("Nome do cliente: ");
		String nome = ent.nextLine();

		System.out.print("CPF do cliente: ");
		String cpf = ent.next();
		
		System.out.print("Data de nascimento: ");
		String dataNascimento = ent.next();

		System.out.print("Comorbidade:");
		String comorbidade = ent.next();

		System.out.println("O cliente deseja usar plano?\n1 - Sim\t2 - Não");
		n = ent.nextInt();

		if (n == 1) {

			plano = true;

			System.out.println("Qual o tipo de plano?\n1 - Familiar\t2 - Empresarial");
			planoVar = ent.nextInt();
			
			switch (planoVar) {
			
			//instancias caso tenha plano
			case 1:
				System.out.println("Quantidade de pessoas para o plano familiar: ");
				qtdPessoas = ent.nextInt();
				
				Plano p = new Plano(nome, cpf, dataNascimento, comorbidade, plano,tipoPlano.FAMILIAR, qtdPessoas);
				p.calcularPlano(qtdPessoas, tipoPlano.FAMILIAR);
				break;

			case 2:
				System.out.println("Quantidade de pessoas para o plano empresarial: ");
				qtdPessoas = ent.nextInt();
				
				p = new Plano(nome, cpf, dataNascimento, comorbidade, plano, tipoPlano.EMPRESARIAL, qtdPessoas);
				p.calcularPlano(qtdPessoas, tipoPlano.EMPRESARIAL);
				break;
				
			default:
				System.out.println("Erro");
				break;
			}

		} else if (n == 2) {
			
			plano = false;
			
		} else {
			
			System.out.println("Valor inválido");

		}
		
		// instancia caso nao tenha plano
		Plano c = new Plano(nome, cpf, dataNascimento, comorbidade, plano);

		listaC.add(c); // adicionando objeto cliente
		
	}
	
	// get collection do cliente para ser usado na classe menu
	public Collection<Plano> getListaC() {
		return listaC;
		
	}

	public void agendarConsulta() {

		Agendamento ag = new Agendamento();

		System.out.println("");

		System.out.println("Qual dia da semana que deseja realizar a consulta?"
				+ "\n0 - Segunda\n1 - Terça\n2 - Quarta\n3 - Quinta\n4 - Sexta");
		int dia = ent.nextInt();

		System.out.println("Digite o número do melhor horário para você: "
				+ "\n0 - 8:00\n1 - 10:00\n2 - 14:00\n3 - 16:00\n4 - 18:00\n5 - 20:00");
		int g = ent.nextInt();

		ag.agendar(dia, g);

	}
	
	public int getPlanoVar() {
		return planoVar;
	}
	
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
}
