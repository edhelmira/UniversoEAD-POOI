package classes;

public class Coordenador extends Funcionario{ //Aplicando herança
	//Atributos
	protected String curso;

	public Coordenador(String nome, String cpf, String endereco, String codigo, double salario, String curso) {
		super(nome, cpf, endereco, codigo, salario);//Chamamos ao construtor da classe pai
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	//m�todos
	@Override
	public double calcularBonificacao(){//m�todo polim�rfico, pois redefine o comportamento (m�todo calcularBonificacao) do pai
		return salario*0.20;
	}
}
