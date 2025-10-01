package Herança;

public class ObjetoPessoa {

	public static void main(String[] args) {
		// Criando pessoa
		Pessoa pessoa = new Pessoa("João da Silva", "(11)99999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		// Criando pessoa fisica
		PessoaFisica pessoaFisica = new PessoaFisica("João da Silva", "(11)99999-9999", "000.000.000-11",
				"00.000.000-1");
		System.out.println("Pessoa Física: ");
		System.out.println("Nome:" + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());

		// Criando Pessoa Juridica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("João da Silva", "(11)99999-9999", "XX.XXX.XXX/XXXX-XX");
		System.out.println("Pessoa Jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
	}

}
