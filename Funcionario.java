package Menu;

public class Funcionario {
	
	private int codigo;
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(int codigo,String nome, String cpf, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionario() {
		super();
	}

	public int getCodigo() {
		return codigo;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
