package day4solidprinciples.dip.solution;

public class Car {
	Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void startCar()
	{
		engine.startEngine();
	}
	
	
}
