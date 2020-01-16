import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorRemover {
	
	String[] wordList = "a b c a b c a a".split(" ");
	
	ArrayList<String> list = new ArrayList<String>(Arrays.asList(wordList));
	
	String removedWord = "a";
	
	ListIterator<String> iter = list.listIterator();
	
	
	public void removeWords() {
		while (iter.hasNext()) {
			if (iter.next().equals(removedWord)) {
				iter.remove();
			}
		}
		System.out.println(list);
	}
}
