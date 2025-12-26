package Java1;

import java.io.*;

public class FileInputOutput {

	public static void main(String[] args)throws IOException {
		FileWriter fw = new FileWriter("name.txt");
		fw.write("Welcom to Input Output Stream");
		fw.close();
		
		FileReader fr = new FileReader("name.txt");
		int ch;
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		fr.close();
	}

	

}
