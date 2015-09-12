package dictionary;// the name of the package
//imported ArrayList,after adding it

import java.util.ArrayList;

public class Dictionary {
	private ArrayList<Word> words;// this is a list of many words,they have
									// index(int), created class of java

	// 0 cat, 1 dog, 2 rabbit....
	public Dictionary(ArrayList<Word> words) {// constructor
		this.words = words;
	}

	// method add, adding a new word to the array words
	public void addWord(Word word) {
		words.add(word);
	}

	// getter of ArrayList words
	public ArrayList<Word> getWords() {
		return words;
	}

	// setter
	public void setWords(ArrayList<Word> words) {
		this.words = words;
	}

	// I am creating a new method, named find,which returns Word
	public Word find(String wordToSearch) {
		// I am creating a new word from String wordToSearch, in order to find
		// its index in words(my)
		int index = words.indexOf(new Word(wordToSearch));// using the method
															// indexOf to search
															// the word
		if (index == -1)// -1 means not found result in Java
			return (null);// null=nothing
		else
			return (words.get(index));// returns the word, which is on the
										// index-position
	}

}
