package histogram;
import java.util.Scanner;
import java.util.Formatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;




public class Histogram {
	private void setScore() {
		while (true) {
			if(score < 0 || score > 100) {
				break;
			}arrIndex = (int)Math.floor(score/10);
			scores[arrIndex] = score;
		}
	}

	
	public void setFile(){
		try {
			Formatter f = new Formatter("banana.txt");
		} catch (Exception e) {
		      System.out.println("Error with creating a file");
		}
	}
	
	public void setFileScanner() {
		try {
			scorelist = new File("Banana.txt");
		}catch (Exception e){
			System.out.println("cannot find file");
		}
		System.out.println("Here is the scorelist"+ scorelist);
		System.out.println(sc);
		try {
			sc = new Scanner(scorelist);
			System.out.println(sc);
		}catch (Exception e) {
			System.out.println(sc);
			System.out.println("Cannot find file object");
		}
	}
	
	private void setArray() {
		while (true) {
			if (sc.hasNextLine()) {
				score = Integer.parseInt(sc.nextLine());
				System.out.println("Score is " + score);
			}else {
				System.out.println("No next line");
				sc.close();
				break;
			} if (score < 0 || score > 100) {
				sc.close();
				break;
			}arrIndex = (int)Math.floor(score/10);
			System.out.println("arrIndex is "+ arrIndex);
			scores[arrIndex] ++;
		}
	}
	
	private int[] getArray() {
		return scores;
	}
	
	private String setString(int num) {
		String stars = "";
		for (int i = 0; i < num; i++) {
			stars = stars +"*";
		}
		return stars;
	}
	
	
	public static void main(String[] args) {	
		Histogram h = new Histogram();
		//h.setFile();
		h.setFileScanner();
		h.setArray();
		//System.out.println(h.getArray());
		for (int i = 0; i < 10; i+=1) {
			String range = Integer.toString(i*10)+
					" to "+Integer.toString((i*10)+9)+
					": "+ h.setString(h.getArray()[i]);
			System.out.println(range);
		}
		System.out.println("100: "+h.setString(h.getArray()[10])); 
	}

	/*private instance variables*/
	private int score = 10;
	private File scorelist;
	private Scanner sc;
	private int arrIndex;
	private int[]scores = new int[11];
}
