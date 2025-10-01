package Herança;

public class Atendente extends Funcionario {
	private double AjudaDeCusto;

	public Atendente(String nome, String cpf, String salario, String cargo, String departamento, double AjudaDeCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.AjudaDeCusto = AjudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	}

	public void setAjudaDeCusto(double AjudaDecusto) {
		this.AjudaDeCusto = AjudaDeCusto;
	}
}