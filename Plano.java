package Menu;

public class Plano extends Cliente {
	
	private int quantidadeDePessoas;
	
	enum tipoPlano {

		FAMILIAR(1), EMPRESARIAL(2);

		private int tipoPlano;

		private tipoPlano(int tipoPlanoEnum) {
			this.tipoPlano = tipoPlano;
		}

		public int getTipoPlano() {
			return tipoPlano;
		}
		
	}
	
	public Plano(String nome, String cpf, String dataNascimento, String comorbidades, boolean plano, tipoPlano s,
			int quantidadeDePessoas) {
		super(nome, cpf, dataNascimento, comorbidades, plano);
		this.quantidadeDePessoas = quantidadeDePessoas;
		s = tipoPlano.FAMILIAR;
		
	}

	// apenas herda
	public Plano(String nome, String cpf, String dataNascimento, String comorbidades, boolean plano) {
		super(nome, cpf, dataNascimento, comorbidades, plano);
		
	}
	
	public Plano(tipoPlano tpPlano, int quantidadeDePessoas) {
		super();
		tpPlano = tipoPlano.FAMILIAR;
		this.quantidadeDePessoas = quantidadeDePessoas;
		
	}
	
	public Plano() {
		super();

	}
	
	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}

	public void calcularPlano(int qtdPessoas, tipoPlano s) {

		if (s == tipoPlano.FAMILIAR) {

			double valorBaseFamilia = 45;

			// ate 3 pessoas sem desconto
			// desconto de 10% - acima de 3
			// desconto de 20% - a partir de 6

			if (qtdPessoas <= 3) { // sem desconto
				valorBaseFamilia = (valorBaseFamilia * qtdPessoas);

			} else if (qtdPessoas > 3 && qtdPessoas <= 5) { // acima de 3
				valorBaseFamilia = (valorBaseFamilia * qtdPessoas) * 0.90;
			} else {
				valorBaseFamilia = (valorBaseFamilia * qtdPessoas) * 0.80;
			}

		} else { // se for empresarial

			double valorBaseEmpresarial = 30;

			// ate 5 pesssoas sem desconto
			// desconto de 8% - acima de 5 ate 20 pessoas
			// desconto de 12% - acima de 20 ate 80 pessoas
			// desconto de 17% - acima de 80 pessoas

			if (qtdPessoas <= 5) { // sem desconto
				valorBaseEmpresarial = (valorBaseEmpresarial * qtdPessoas);
			} else if (qtdPessoas > 5 && qtdPessoas <= 20) { // acima de 3
				valorBaseEmpresarial = (valorBaseEmpresarial * qtdPessoas) * 0.92;
			} else if (qtdPessoas > 20 && qtdPessoas <= 80) {
				valorBaseEmpresarial = (valorBaseEmpresarial * qtdPessoas) * 0.88;
			} else {
				valorBaseEmpresarial = (valorBaseEmpresarial * qtdPessoas) * 0.83;
			}

		}

	}
	
	
}
