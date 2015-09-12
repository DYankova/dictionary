package dictionary;

public class Word {
	private String word;
	private String definition;
	private String examples;

	// my class should first has a constructor, before the objects to be created
	// (there is default an empty constructor)
	public Word(String word, String definition, String examples) { // This is a
																	// method,
																	// we use
																	// no; but {
		this.word = word;
		this.definition = definition;
		this.examples = examples;
	}

	public Word(String word) {
		this.word = word;
	}

	// using Getter and Setter
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getExamples() {
		return examples;
	}

	public void setExamples(String examples) {
		this.examples = examples;
	}

	// using toString method, for defining what I want to be print from this
	// method
	@Override
	public String toString() {
		return "Word [word=" + word + ", definition=" + definition + ", examples=" + examples + "]";
	}

	// Using hashcode(source) to compare objects
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

}
