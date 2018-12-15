package histogram;

import java.util.Arrays;

public class Histogram {
	
	public class WordcountTest {
		public WordcountTest() {
		}
	}
	public static void main(String[] args) {
			Wordcount t = new Wordcount("leartext.txt");
			t.setFileScanner();
			t.setArray();
			t.getNumberOfLine();
			t.getNumberOfChars();
			t.getNumberOfWords();
			System.out.println("The number of characters is "+t.getNumberOfChars());
			System.out.println("The number of lines is "+t.getNumberOfLine());
			System.out.println("The number of words is "+t.getNumberOfWords());
		}
	}
}
