class Wc{
	public int countLines(String str){
		String[] splited = str.split("\r\n");
		return splited.length;

	}

	public int countWords(String str){
		String[] splited = str.split(" ");
		return splited.length;
	}
}