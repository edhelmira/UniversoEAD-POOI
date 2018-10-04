package classes;

public class Funcionario extends Pessoa{//Aplicando herança
	//Atributos protected, pois serão usados pelas classes descendentes
	protected String codigo;
	protected double salario;
	
	//Construtor
	public Funcionario(String nome, String cpf, String endereco, String codigo, double salario) {
		super(nome, cpf, endereco);//Chamamos ao construtor da classe pai
		this.codigo = codigo;
		this.salario = salario;
	}
	//Getter e setter
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// métodos
	public double calcularBonificacao(){
		return salario*0.1;
	}
}
