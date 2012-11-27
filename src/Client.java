
public class Client {


	public static void main(String[] args) {

		String path = "C:/dev/inputreader/";
		String data = "test";
		String suffix = ".txt";
		
		
		InputReader reader = new InputReader(path + data + suffix);
		
		TextCounter counter = new TextCounter();
		//counter.countWords(reader.readSingleText());
		
		counter.countWordFrequency(reader.readSingleText());
		
		//System.out.println("Wörter: " + counter.countWords(reader.readSingleText()));
		//System.out.println("Sätze: " + counter.countSentences(reader.readSingleText()));
		
	}

}
