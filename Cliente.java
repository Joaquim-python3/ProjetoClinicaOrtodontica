package Menu;

public class Cliente {
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String comorbidades;
	private boolean plano;

	public Cliente(String nome, String cpf, String dataNascimento, String comorbidades, boolean plano) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.comorbidades = comorbidades;
		this.plano = plano;
	}
	
	public Cliente() {
		super();
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

	public boolean isPlano(boolean b) {
		return plano;
	}

	@Override
	public String toString() {
		return "Informações do cliente\nnome=" + nome + "\ncpf=" + cpf + "\ndataNascimento=" + dataNascimento + "\ncomorbidades="+ comorbidades + "\nplano=" + plano + "]";
		// comorbidades é apenas um criterio adicional
	}
	
}
