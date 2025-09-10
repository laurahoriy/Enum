package POO.modificadores;

import java.util.Scanner;

public class PessoaAutomovel {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Cria o obj pessoa
		
		Pessoa pessoa = new Pessoa();
		String cor, nome;
		int velocidade;
		
		System.out.println("Informe a cor do carro");
		cor = ler.next();
		
		System.out.println("Informe o nome do carro");
		nome = ler.next();
		
		System.out.println("Informe a velocidade do carro");
		velocidade = ler.nextInt();
		
		//utiliza o meto compraCarro
		pessoa.compracarro(cor, nome, velocidade);
		
		//utiliza para mostrar o carro comprado
		Automovel carro = pessoa.getAutomovel();
		
		System.out.println("O carro comprado foi " + carro.getNome() + " da cor " + carro.GetCor()+ " que atinge a velocidade de " + carro.getVelocidade());
	
		ler.close();
	}
}
