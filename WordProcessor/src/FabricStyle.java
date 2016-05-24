import java.util.HashMap;
import java.util.Map;

public class FabricStyle {
	private Map<String, Style> styles = new HashMap<String, Style>();
	
	public Style getStyle(String key){	
		if(styles.containsKey(key))
			return styles.get(key);
		else{
			System.out.println((DocReader.r).getFontName());
			Style newStyle = new Style((DocReader.r).getFontName(), (DocReader.r).getFontSize(), (DocReader.r).getColor());
			styles.put(key, newStyle);
			return newStyle;
		}
	}
	
	public int numberOfStyles(){
		return styles.size();
	}
}
