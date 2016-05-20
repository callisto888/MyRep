
public class Style {
	private String fontName,fontColor;
	private int fontSize;

	public Style(String n, int s, String c){
		fontName = n;
		fontSize=s;
		fontColor=c;
	}
	public String styleInfoToString(){
		return "Font style info: "+fontName+" "+fontSize+" "+fontColor;
	}
}
