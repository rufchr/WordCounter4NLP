import java.util.ArrayList;


public class TextCounter {
	
	public TextCounter() { }
	
	public int countWords(String text) {
		String[] wordList = null;
		wordList = text.split(" ");
		
		return wordList.length;
	}
	
	public String[] getWords(String text) {
		String[] wordList = null;
		wordList = text.split(" ");
		
		return wordList;
	}
	
	public int countWordFrequency(String text) {
		int index = 0;
		StringAndInt temp;
		
		StringAndIntList wordAndIntList = new StringAndIntList();
		
		text = text.toUpperCase();
		//text = text.replaceAll("[^a-zA-ZüÜäÄöÖ]", " ");
		text = text.replaceAll("[^A-ZÄÖÜ]", " ");
		
		String[] word = getWords(text);
		
		for(int i = 0; i < word.length; i++) {
			if(word[i] == "") { 
				
			}
			else if(!wordAndIntList.contains(word[i])) {

				temp = new StringAndInt(word[i], 1);
				wordAndIntList.add(temp);
			}
			else {
				index = wordAndIntList.getIndex(word[i]);
				wordAndIntList.incInt(index);
			}
				
		}
		
		for(int i = 0; i < wordAndIntList.size(); i++) {
			wordAndIntList.sortByFrequency();
			System.out.println(wordAndIntList.get(i).getString() + ":" + wordAndIntList.get(i).getInt());
		}
		
		return 0;		
	}
	
//	public int countSentences(String text) {
//		String[] wordList = null;
//		//wordList = text.split("\\. ");
//		text = text.replaceAll("[\\w]*[\\.|?|!|:][\\s|\"]", ";;;");
//		System.out.println(text);
//		//wordList = text.split("[\\w]*[\\.|?|!|:][\\s|\"]");
//		wordList = text.split(";;;");
//
//		for(int i = 0; i < wordList.length; i++)
//			System.out.println(wordList[i]);
//		
//		return wordList.length;
//	}
	
}
