import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorReplacer {
	
String[] wordList = "a b c a b c".split(" ");
	
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(wordList));
	
	String replacedWord = "a";
	String replacementWord = "+";
	
	ListIterator<String> iter = list.listIterator();
	
	
	public void replaceWords() {
		while (iter.hasNext()) {
			if (iter.next().equals(replacedWord)) {
				iter.set(replacementWord);
			}
		}
		System.out.println(list);
	}
}
