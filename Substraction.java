package day4solidprinciples.ocp.solution;

public class Substraction implements CalculatorOperations {
	private double left;
    private double right;
    private double result;  

    public Substraction() {}
	public Substraction(double left, double right) {
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
		result=left-right;
		return result;
	}
}
