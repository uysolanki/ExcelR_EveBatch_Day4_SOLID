package day4solidprinciples.srp;

public class DriverApp {

	public static void main(String[] args) {
	StringManipulator s1=new StringManipulator("Naredra Singh ");
	
	DisplayString d1=new DisplayString(s1);
	d1.displayString();
	
	s1.appendText("Dhoni");
	d1.displayStringInLowerCase();
	s1.replaceText("Kumar");
	d1.displayStringInUpperCase();

		
	}

}
