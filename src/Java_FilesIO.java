import java.io.*;
public class Java_FilesIO {
	public static void main(String args[]) {
		try {  
		char [] mystring= {'a','b','c','d'};
		
		OutputStream myfile = new FileOutputStream("/Users/shubha.d/eclipse-workspace/test2.txt");
	    for(int i=0;i<mystring.length;i++) {
	    	myfile.write( mystring[i] );}
	    	myfile.close();
	    	
	    	InputStream is= new FileInputStream("/Users/shubha.d/eclipse-workspace/test2.txt");
	    	int size= is.available();
	    	
	    	for(int j=0;j<size;j++) 
	    	   System.out.print((char)is.read()+" ");
	    	is.close();
	    	
	    	}
	    	catch(Exception e) {
	    		System.out.print("Got an exception");
	    	}
	    	
	    }
	
		
}
