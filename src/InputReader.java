import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputReader {
	
	private String source;
	
	public InputReader(String source) {
		this.source = source;		
	}
	
	//Unterscheidung ob Textdatei oder Verzeichnis
	
	//Falls source Textdatei:	
	public String readSingleText() {
		String text = "";
		String temp = "";
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(source));
			
			while((temp = in.readLine()) != null) {
				if(text != "")
					text = text + " " + temp;
				else
					text = text + temp;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
}
