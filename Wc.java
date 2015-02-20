import java.io.*;
class Wc {

	public int countLines(String str){
		return str.split("\r\n").length-1;
	}

	public int countWords(String str) {
		return str.split("[ \t\n]").length;
	}

	public int countChars(String str){
		return str.length();
	}

	public String getLongestLine(String str){
		String[] splittedByLine = str.split("\r\n");
    	String longestString = "";
    	for (String s : splittedByLine){
      		if (s.length() > longestString.length()){
        		longestString = s;
      		}
    	}
    	return longestString;
	}

	public String getShortestLine(String str){
		String[] splittedByLine = str.split("\r\n");
    	String shortestString = splittedByLine[0];
    	for (String s : splittedByLine){
      		if (s.length() < shortestString.length()){
        		shortestString = s;
      		}
    	}
    	return shortestString;
	}
	public String toString(String str,String filename,String option){
		switch(option){
			case "-l":return "\t"+countLines(str)+" "+filename;
			case "-w":return "\t"+countWords(str)+" "+filename;
			case "-c":return "\t"+countChars(str) + " "+filename;
			case "-L":return "\t"+getLongestLine(str).length() + "  "+getLongestLine(str);
			case "-S":return "\t"+getShortestLine(str).length() + "  "+getShortestLine(str);
			default:return "\t"+countLines(str)+"\t"+ countWords(str)+"\t"+countChars(str)+" "+filename;
		}
	}

	public String showTotal(String allContent,String option) {
		switch(option){
			case "-l":return "\t"+countLines(allContent)+" total";
			case "-w":return "\t"+(countWords(allContent)+1)+" total";
			case "-c":return "\t"+countChars(allContent) + " total";
			default:return "\t"+countLines(allContent)+"\t"+ ((countWords(allContent)+1)) +"\t"+countChars(allContent)+" total";
		}
	}

	public static void main(String[] args) {
	    String fileData = "",option = args[0],allFilesContent="";
	    int isfile = 1;
	    File f = new File(args[0]);
	    Wc wc = new Wc();
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
		      	allFilesContent =allFilesContent.concat(fileData);
		      	System.out.println(wc.toString(fileData,args[j],args[0]));
		      	fileData = "";
	      	}
	      	if(isfile == 0 && args.length > 1){
	      		System.out.println(wc.showTotal(allFilesContent,args[0]));
	      	}
		}catch(IOException e){
      		System.out.print("File Not Found!!");
   		}    
	}
}