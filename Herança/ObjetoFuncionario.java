package Herança;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João", "000.000.000-00", "0000000", "TI", "Tecnologia");
		System.out.println("FUNCIONARIO");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salário: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departanento: " + funcionario.getDepartamento());

		Atendente atendente = new Atendente("João", "000.000.000-00", "0000000", "TI", "Tecnologia", 2);
		System.out.println("ATENDENTE");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF: " + atendente.getCpf());
		System.out.println("Salário: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departanento: " + atendente.getDepartamento());
		System.out.println("Ajuda de Custo: " + atendente.getAjudaDeCusto());
		
		Gerente gerente = new Gerente ("João", "000.000.000-00", "0000000", "TI", "Tecnologia", "Salario Alto", 3);
		System.out.println("GERENTE");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departanento: " + gerente.getDepartamento());
		System.out.println("Ajuda de Custo: " + gerente.getBeneficios());
		System.out.println("Premiação: " + gerente.getPremiacao());
	}

}
