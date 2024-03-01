package day4solidprinciples.ocp.problem;

public class Calculation implements CalculatorOperations {
	
    private double left;
    private double right;
    private double result;
   
    public Calculation() {}
	public Calculation(double left, double right) {
		super();
		this.left = left;
		this.right = right;
	}

	
	public double getLeft() {
		return left;
	}
	public void setLeft(double left) {
		this.left = left;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	@Override
	public double perform(char operator) {
		
		switch(operator)
		{
		case '+' : result=left+right; break;
		case '-' : result=left-right; break;
		default : return 0;
		}
		return result;
	}

}
