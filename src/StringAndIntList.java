import java.util.ArrayList;


public class StringAndIntList {

	ArrayList<StringAndInt> wordAndIntList;
	
	public StringAndIntList() {
		wordAndIntList  = new ArrayList<StringAndInt>();
	}
	
	public boolean contains(String str) {
		for(int i = 0; i < wordAndIntList.size(); i++) {
			if(wordAndIntList.get(i).getString().equals(str))
				return true;
		}		
		return false;
	}
	
	public void add(StringAndInt sai) {
		wordAndIntList.add(sai);
	}
	
	public StringAndInt get(int index) {
		return wordAndIntList.get(index);
	}
	
	public void set(int index, StringAndInt sai) {
		wordAndIntList.set(index, sai);
	}
	
	public int size() {
		return wordAndIntList.size();
	}
	
	public void incInt(int index) {
		StringAndInt temp = wordAndIntList.get(index);
		temp.incInt();
		wordAndIntList.set(index, temp);
	}
	
	public int getIndex(String str) {
		for(int i = 0; i < wordAndIntList.size(); i++) {
			if(wordAndIntList.get(i).getString().equals(str))
				return i;
		}
		return 0;
	}
	
	public int maxFrequency() {
		
		int max_frequency = 0;
		
		for(int i = 0; i < wordAndIntList.size(); i++) {
			if(max_frequency < wordAndIntList.get(i).getInt())
				max_frequency = wordAndIntList.get(i).getInt();
		}
		
		if(max_frequency == 0)
			return 1;
		return max_frequency;
	}
	
	public void sortByFrequency() {
		/* Scheiß Algorithmus! Und Fehlerhaft?? */
		ArrayList<StringAndInt> sortedWordAndIntList = new ArrayList<StringAndInt>();
		
		int max_frequency = this.maxFrequency();
		
		for(int i = 0; i < 1000; i++) {
			for(int j = 0; j < wordAndIntList.size(); j++) {
				if(wordAndIntList.get(j).getInt() == i)
					sortedWordAndIntList.add(wordAndIntList.get(j));
			}
		}
		wordAndIntList = sortedWordAndIntList;
	}
} 