package classes;

public class Professor extends Funcionario{ //Aplicando herança
	//Atributos private, pois a classe não terá descentes  
	private String departamento;
	
	//Construtor
	public Professor(String nome, String cpf, String endereco, String codigo, double salario, String departamento) {
		super(nome, cpf, endereco, codigo, salario);//Chamamos ao construtor da classe pai
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	// métodos
	@Override
	public double calcularBonificacao(){ //método polimórfico, pois redefine o comportamento (método calcularBonificacao) do pai
		return salario*0.15;
	}
	
	
}
