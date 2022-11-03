package br.com.erickfreire.funcionario;

public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private double salario;
	
	
	public Funcionario(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		if(salario < 0.0)
			this.salario = 0.0;
		if(salario >= 0.0)
		    this.salario = salario;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {		
		this.sobrenome = sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
