package br.com.erickfreire.funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Joao", "Silva", 1500.00);
		Funcionario func2 = new Funcionario("José", "Fernandes", 3500.00);
		
		System.out.printf("O funcionario: %s %s tem o salario anual de: R$%.2f%n", func1.getNome(), func1.getSobrenome(), func1.getSalario() * 12);
		System.out.printf("O funcionario: %s %s tem o salario anual de: R$%.2f%n%n%n", func2.getNome(), func2.getSobrenome(), func2.getSalario() * 12);
		
		System.out.printf("O funcionario: %s %s tem o salario anual reajustado de: R$%.2f%n", func1.getNome(), func1.getSobrenome(), ((func1.getSalario() * 12) * 0.1) + (func1.getSalario() * 12));
		System.out.printf("O funcionario: %s %s tem o salario anual reajustado de: R$%.2f%n", func2.getNome(), func2.getSobrenome(), ((func2.getSalario() * 12) * 0.1) + (func2.getSalario() * 12));
		
	}

}
