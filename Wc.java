class Wc{
	public int countLines(String str){
		String[] splited = str.split("\r\n");
		return splited.length;

	}

	public int countWords(String str){
		int wordCount = 0;
		String[] splitedByLines = str.split("\r\n");
		if(splitedByLines.length == 1){
			String[] words = str.split(" ");
			wordCount = words.length;
		}
		else{
			for (int i = 0;i<splitedByLines.length ;i++ ) {
				String[] wordsOfSingleLine = splitedByLines[i].split(" ");
				wordCount = wordCount+wordsOfSingleLine.length;
			}
		}
		return wordCount;
	}

	public int countChar(String str){
		int charCount = 0;
		String[] splitedByLines = str.split("\r\n");
		if(splitedByLines.length == 1){
			charCount = str.length();
		}
		else{
			for (int i = 0;i<splitedByLines.length ;i++ ) {
				System.out.println("length of string"+(splitedByLines[i]).length());
				charCount = charCount+(splitedByLines[i]).length();
			}
		}
		return charCount;
	}
}