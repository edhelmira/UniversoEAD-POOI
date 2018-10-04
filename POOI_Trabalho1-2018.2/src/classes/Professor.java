package classes;

public class Professor extends Funcionario{ //Aplicando heran�a
	//Atributos private, pois a classe n�o ter� descentes  
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
	
	// m�todos
	@Override
	public double calcularBonificacao(){ //m�todo polim�rfico, pois redefine o comportamento (m�todo calcularBonificacao) do pai
		return salario*0.15;
	}
	
	
}
