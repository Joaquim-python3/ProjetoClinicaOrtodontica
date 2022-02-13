package Menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import Menu.Plano.tipoPlano;

public class UsarCliente {

	Scanner ent = new Scanner(System.in);
	Collection<Cliente> listaC = new ArrayList<>();

	int n;
	boolean plano;

	public Cliente cadastrarCliente() {
		
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
			int planoVar = ent.nextInt();

			switch (planoVar) {

			case 1:
				System.out.println("Quantidade de pessoas para o plano familiar: ");
				int qtdPessoas = ent.nextInt();
				Plano p = new Plano(tipoPlano.FAMILIAR, qtdPessoas);
				p.setQuantidadeDePessoas(qtdPessoas);
				p.calcularPlano(qtdPessoas, tipoPlano.FAMILIAR);
				break;

			case 2:
				System.out.println("Quantidade de pessoas para o plano empresarial: ");
				qtdPessoas = ent.nextInt();
				p = new Plano(tipoPlano.EMPRESARIAL, qtdPessoas);
				p.setQuantidadeDePessoas(qtdPessoas);
				p.calcularPlano(qtdPessoas, tipoPlano.EMPRESARIAL);
				break;

			}

		} else if (n == 2) {
			plano = false;
		} else {
			System.out.println("Valor inválido");

		}

		Cliente c = new Cliente(nome, cpf, dataNascimento, comorbidade, plano);

		listaC.add(c); // adicionando objeto cliente
		
		return c;
	}

	public Collection<Cliente> getListaC() {
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

}
