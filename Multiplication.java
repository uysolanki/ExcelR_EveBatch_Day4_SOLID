package day4solidprinciples.ocp.solution;

public class Multiplication implements CalculatorOperations {
    private double left;
    private double right;
    private double result;  

    public Multiplication() {}
	public Multiplication(double left, double right) {
		this.left = left;
		this.right = right;
	}

	public double getLeft() {
		return left;
	}

	public void setLeft(double left) {
		this.left = left;
	}

	public double getRight() {
		return right;
	}

	public void setRight(double right) {
		this.right = right;
	}

	public double getResult() {
		return result;
	}
	@Override
	public double perform() {
		result=left*right;
		return result;
	}

	
	
	
}
