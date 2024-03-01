package day4solidprinciples.ocp.solution;

public class ClientProg {

	public static void main(String[] args) {
		
		CalculatorFactory c1=new CalculatorFactory();
		
		
		CalculatorOperations a1=new Addition(11,5);
		CalculatorOperations s1=new Substraction(10,9);
		CalculatorOperations m1=new Multiplication(10,9);
		
		
		System.out.println("Addition is " +c1.calculate(a1));
		System.out.println("Multiplication is " +c1.calculate(m1));
		

	}

}
