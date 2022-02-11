package Menu;

import java.util.ArrayList;
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
		String semana[] = new String[5];

        semana[0] = "Segunda";
        semana[1] = "Terça";
        semana[2] = "Quarta";
        semana[3] = "Quinta";
        semana[4] = "Sexta";

        for(int i = 0; i<5;i++) {
            System.out.print(semana[i]+"\t");
        }

        String[][] horarios = new String[5][6];
        for (int j = 0;j< 6 ;j++){ // horarios
            for (int i = 0;i < 5;i++){// dias da semana
                if(j == 0) {
                    horarios[i][j] = "8:00";
                    System.out.print(horarios[i][j]+"\t");
                } else if(j == 1){
                    horarios[i][j] = "10:00";
                    System.out.print(horarios[i][j]+"\t");
                } else if(j == 2){
                    horarios[i][j] = "14:00";
                    System.out.print(horarios[i][j]+"\t");
                } else if(j == 3){
                    horarios[i][j] = "16:00";
                    System.out.print(horarios[i][j]+"\t");
                } else if(j == 4){
                    horarios[i][j] = "18:00";
                    System.out.print(horarios[i][j]+"\t");
                } else if(j == 5){
                    horarios[i][j] = "20:00";
                    System.out.print(horarios[i][j]+"\t");
                }
            }
        }
// SEGUNDA TERÇA QUARTA QUINTA SEXTA
//  8    8    8     8       8      8
        System.out.println(

                "Qual dia da semana que deseja realizar a consulta?"
                        + "\n2 - Segunda\t3 - Terça\n4 - Quarta\t5 - Quinta\t6 - Sexta");

        int dia = ent.nextInt();
        System.out.println("Digite o número do melhor horário para você: ");
        int g = ent.nextInt();
        System.out.println("Marcado com sucesso!!!");

        horarios[dia][g] = "IND.";
        System.out.println(horarios[dia][g]);
		
		
	}
}