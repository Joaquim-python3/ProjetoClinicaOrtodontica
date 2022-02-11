package Menu;

import java.util.Scanner;

import Menu.Plano.tipoPlano;

public class UsarCliente {
	
	Scanner ent = new Scanner(System.in);
	
	public void cadastrarCliente() {

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

		if (n == 1) {
			cliente.isPlano(true);

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
			cliente.isPlano(false);
		} else {
			System.out.println("Valor inválido");

		}

	}
	
	public void agendarConsulta() {
		
        Agendamento ag = new Agendamento();
        
        String semana[] = new String[5];
        semana[0] = "Segunda";
        semana[1] = "Terça";
        semana[2] = "Quarta";
        semana[3] = "Quinta";
        semana[4] = "Sexta";

        System.out.println("");


        System.out.println("Qual dia da semana que deseja realizar a consulta?"
                + "\n0 - Segunda\n1 - Terça\n2 - Quarta\n3 - Quinta\n4 - Sexta");
        int dia = ent.nextInt();


        System.out.println("Digite o número do melhor horário para você: "
                + "\n0 - 8:00\n1 - 10:00\n2 - 14:00\n3 - 16:00\n4 - 18:00\n5 - 20:00");
        int g = ent.nextInt();

        ag.agendar(semana,dia,g);
		
	}
}
