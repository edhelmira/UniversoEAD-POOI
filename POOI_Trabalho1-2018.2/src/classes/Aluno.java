package classes;

public class Aluno extends Pessoa{ //Aplicando heran�a
	//Atributos private, pois a classe n�o ter� descentes  
	private String matricula;
	
	//Construtor
	public Aluno(String nome, String cpf, String endereco, String matricula) {
		super(nome, cpf, endereco); //Chamamos ao construtor da classe pai
		this.matricula = matricula;
	}

	//Getter e setter
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
