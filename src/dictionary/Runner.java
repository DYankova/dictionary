package dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I am creating a new objects cat, dog, rabbit;
		Word cat= new Word("cat","animal", "Sisi");
		Word dog= new Word("dog","animal", "Johny");
		Word rabbit= new Word("rabbit","animal","Monio");
		Word cow=new Word("cow","animal","Vera");
		
		//here I am creating my own ArrayList, named words, using its constructor
		ArrayList<Word> words=new ArrayList<Word>();
		Dictionary dict = new Dictionary(words);
		dict.addWord(cat);
		dict.addWord(rabbit);
		dict.addWord(dog);
		dict.addWord(cow);
		//System.out.println(dict.getWords());
		
		//I am using the equals and hashCode to compare words and at the same time I am printing it
		//System.out.println(cat.equals(cow));
		//System.out.println(dog.equals(dog));
		
		//using find-method from runner
		//System.out.println(dict.find("car"));
		//System.out.println(dict.find("dog"));
		
		Scanner in = new Scanner(System.in);//for scanning a system in the console
		//while true= until this is true, endless repeat.Operator
		while(true) {
		System.out.println("enter Word:");
		String wordToFind = in.nextLine();//methods are calling with ()
		System.out.println(dict.find(wordToFind));//when I write down a word  from the Dictionary on the CONSOLE,it will appears
		}
	}
	

}
