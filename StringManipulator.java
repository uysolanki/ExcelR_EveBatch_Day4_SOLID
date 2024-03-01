package day4solidprinciples.srp;

public class StringManipulator {
	private String text;

	public StringManipulator() {}
	public StringManipulator(String text)  //"Mahendra Singh "
	{
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public void appendText(String surname)  //Mahendra Singh Dhoni
	{
		text=text.concat(surname);
	}
	
	public void replaceText(String newmidname)  //Mahendra Singh Dhoni
	{
		text=text.replace("Singh", newmidname);
	}
	
	
}
