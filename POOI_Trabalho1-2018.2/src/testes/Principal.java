package testes;

import classes.*;

public class Principal {

	public static void main(String[] args) {
		//Criando instancias
		Aluno a1= new Aluno("João da Silva", "12345678", "Niterói", "00001");
		
		Professor p1 = new Professor("Leandro Suarez", "00122334", "Niterói", "D001",3500,"Sistemas de informação");
		
		Coordenador c1 = new Coordenador ("Célio Albuquerque", "45456521", "RJ", "C001",5000,"Tecnologia em Sistemas de informação");
		
		//Invocando métodos
		System.out.println("Imprimiendo dados do Aluno 1:");
		System.out.println("Nome: "+a1.getNome());
		System.out.println("CPF: "+a1.getCpf());
		System.out.println("Endereço: "+a1.getEndereco());
		System.out.println("Matrícula: "+a1.getMatricula());
		
		System.out.println("\nImprimiendo dados do Professor:");
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Salário: "+p1.getSalario());
		System.out.println("Bonificação: "+p1.calcularBonificacao());
		
		System.out.println("\nImprimiendo dados do Coordenador:");
		System.out.println("Nome: "+c1.getNome());
		System.out.println("Salário: "+c1.getSalario());
		System.out.println("Bonificação: "+c1.calcularBonificacao());
	}

}
