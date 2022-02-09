package Menu;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String comorbidades;

	public Cliente(String nome, String cpf, String dataNascimento, String comorbidades) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.comorbidades = comorbidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getComorbidades() {
		return comorbidades;
	}

	public void setComorbidades(String comorbidades) {
		this.comorbidades = comorbidades;
	}
	
	
	public void cadastrarCliente() {
		
		Scanner ent = new Scanner(System.in);
		
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
	
}
