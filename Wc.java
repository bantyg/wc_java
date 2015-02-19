import java.util.Scanner;
import java.io.*;


class Wc{

	public int countLines(String str){
		String[] splited = str.split("\r\n");
		return splited.length-1;
	}

	public int countWords(String str){
		int wordCount = 0;
		String[] splitedByLines = str.split("\r\n");
		if(splitedByLines.length == 1)
			return countWordsForSingleLine(splitedByLines,str,wordCount);
		else
			return countWordsForMultipleLine(splitedByLines,str,wordCount);
	}

	public static int countWordsForSingleLine(String[] lines,String str,int wordCount){
			String[] words = str.split(" ");
			wordCount = words.length;
			return wordCount;
	}

	public static int countWordsForMultipleLine(String[] lines,String str,int wordCount){
		for (int i = 0;i<lines.length ;i++ ) {
			String[] wordsOfSingleLine = lines[i].split(" ");
			wordCount = wordCount+wordsOfSingleLine.length;
		}
		return wordCount;
	}

	public int countChar(String str){
		return str.length();
	}


	public static void toString(String str,String filename,String option){
		Wc wc = new Wc();
		// if(option.equals("-l")){
		// 	System.out.println("  "+wc.countLines(str)+"   "+filename);
		// }
		switch(option){
			case "-l":System.out.println("  "+wc.countLines(str)+"   "+filename);
						break;
			case "-w":System.out.println("  "+wc.countWords(str)+"   "+filename);
						break;
			case "-c":System.out.println("  "+wc.countChar(str)+"   "+filename);
						break;
			default:System.out.println("      "+wc.countLines(str)+"      "+
			wc.countWords(str)+"      "+wc.countChar(str)+"  "+filename);
		}
	}
	
	public static void main(String[] args) {
	    String fileData = "",option = args[0];
	    int isfile = 1;
	    File f = new File(args[0]);
	    if(f.isFile() == true){
	    	isfile = 0;
	    }
		try{
	      	for (int j = isfile;j<args.length ;j++ ) {
		      	InputStream is = new FileInputStream(args[j]);
		      	int size = is.available();
		      	for(int i=0; i< size; i++){
			    	fileData = fileData.concat((char)is.read()+"");
		      	}
		      	toString(fileData,args[j],args[0]);
	      	}
		}catch(IOException e){
      		System.out.print("Exception");
   		}    
	}
}













