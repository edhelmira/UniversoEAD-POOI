package testes;

import classes.*;

public class Principal {

	public static void main(String[] args) {
		//Criando instancias
		Aluno a1= new Aluno("Jo�o da Silva", "12345678", "Niter�i", "00001");
		
		Professor p1 = new Professor("Leandro Suarez", "00122334", "Niter�i", "D001",3500,"Sistemas de informa��o");
		
		Coordenador c1 = new Coordenador ("C�lio Albuquerque", "45456521", "RJ", "C001",5000,"Tecnologia em Sistemas de informa��o");
		
		//Invocando m�todos
		System.out.println("Imprimiendo dados do Aluno 1:");
		System.out.println("Nome: "+a1.getNome());
		System.out.println("CPF: "+a1.getCpf());
		System.out.println("Endere�o: "+a1.getEndereco());
		System.out.println("Matr�cula: "+a1.getMatricula());
		
		System.out.println("\nImprimiendo dados do Professor:");
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Sal�rio: "+p1.getSalario());
		System.out.println("Bonifica��o: "+p1.calcularBonificacao());
		
		System.out.println("\nImprimiendo dados do Coordenador:");
		System.out.println("Nome: "+c1.getNome());
		System.out.println("Sal�rio: "+c1.getSalario());
		System.out.println("Bonifica��o: "+c1.calcularBonificacao());
	}

}
