package day4solidprinciples.ocp.solution;

public class CalculatorFactory {

	public double calculate(CalculatorOperations calc)
	{
		return calc.perform();
	}
}
