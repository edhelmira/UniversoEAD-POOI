package classes;

public class Aluno extends Pessoa{ //Aplicando herança
	//Atributos private, pois a classe não terá descentes  
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
