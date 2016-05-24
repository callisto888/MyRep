import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class DocReader {
	
	public static XWPFRun r;

	public void readDocxFile(String fileName) {

		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			XWPFDocument document = new XWPFDocument(fis);
			HWPFDocument doc = new HWPFDocument (fis); 
			
			List<XWPFParagraph> paragraphs = document.getParagraphs();

			FabricStyle fs = new FabricStyle();
			Char ch;
			for (XWPFParagraph para : paragraphs) {
				r = para.createRun();
				System.out.println(r.text());
				char[] charsFromStrings = r.text().toCharArray();
				for (int i = 0; i < charsFromStrings.length; i++) {
					ch = new Char(charsFromStrings[i], fs.getStyle(String.valueOf(charsFromStrings[i])));
					System.out.println(charsFromStrings[i]);
					System.out.println(ch.toString());
				}
			}
			document.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}