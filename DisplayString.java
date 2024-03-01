package day4solidprinciples.srp;

public class DisplayString {
	StringManipulator stringmanip;
	
	
	public DisplayString(StringManipulator stringmanip) {
		this.stringmanip = stringmanip;
	}

	public void displayString()
	{
		System.out.println(stringmanip.getText());
	}
	
	public void displayStringInUpperCase()
	{
		System.out.println(stringmanip.getText().toUpperCase());
	}
	
	public void displayStringInLowerCase()
	{
		System.out.println(stringmanip.getText().toLowerCase());
	}
}
