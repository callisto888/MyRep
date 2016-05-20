
public class Char {
	private char character;
	private Style style;
	
	public Char(char ch, Style st){
		character=ch;
		style=st;
	}
	
	public String charInfo(){
		return "Char info: "+character+" "+style.styleInfoToString();
	}
}
