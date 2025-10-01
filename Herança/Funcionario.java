package Herança;

public class Funcionario {
	private String nome;
	private String cpf;
	private String salario;
	private String cargo;
	private String departamento;

	public Funcionario(String nome, String cpf, String salario, String cargo, String departamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.cargo = cargo;
		this.departamento = departamento;
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

	public String getSalario() {
		return salario;
	}

	public void setSalario(String Salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
