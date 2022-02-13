package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import Menu.Plano.tipoPlano;

public class UsarCliente {

	Scanner ent = new Scanner(System.in);
	ArrayList<Plano> lista = new ArrayList<>();
	Cliente c = new Plano();
	
	boolean plano;
	String nomeApoio, cpfApoio, dataNascApoio, comorbidadesApoio;
	int n;
	
	public void cadastrarCliente() {

		System.out.println("Nome completo do cliente: ");
		nomeApoio = ent.next();
		c.setNome(nomeApoio);

		System.out.println("CPF do cliente: ");
		cpfApoio = ent.next();

		System.out.println("Data de nascimento: ");
		dataNascApoio = ent.next();

		System.out.println("Comorbidade:");
		comorbidadesApoio = ent.next();

		System.out.println("O cliente deseja usar plano?\n1 - Sim\t2- Não");
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
		
		Plano c = new Plano(nomeApoio, cpfApoio, dataNascApoio, comorbidadesApoio, plano);
		lista.add(c);
		
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

        ag.agendar(dia,g);
		
	}

	// GETTERS E SETTERS ()
	public boolean isPlano() {
		return plano;
	}

	public void setPlano(boolean plano) {
		this.plano = plano;
	}

	public String getNomeApoio() {
		return nomeApoio;
	}

	public void setNomeApoio(String nomeApoio) {
		this.nomeApoio = nomeApoio;
	}

	public String getCpfApoio() {
		return cpfApoio;
	}

	public void setCpfApoio(String cpfApoio) {
		this.cpfApoio = cpfApoio;
	}

	public String getDataNascApoio() {
		return dataNascApoio;
	}

	public void setDataNascApoio(String dataNascApoio) {
		this.dataNascApoio = dataNascApoio;
	}

	public String getComorbidadesApoio() {
		return comorbidadesApoio;
	}

	public void setComorbidadesApoio(String comorbidadesApoio) {
		this.comorbidadesApoio = comorbidadesApoio;
	}
	
	
}
