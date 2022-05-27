package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandling {

	public static void main(String[] args) throws IOException {
	Abc6 obj=new Abc6();
	//obj.takeInputFromAFileNotFromConsole();
	//obj.saveOutputIntoAFile();
	obj.createALogFile();

	}

}
class Abc6 {
	static int a=10;
	
	void takeInputFromAFileNotFromConsole() throws IOException {
		String path = "C:\\Users\\Ankita Singh\\git\\FirstJavaproject\\LearnJavaInDepth\\src\\Unit_03\\input.txt";
		File file = new File(path);
		 
		 BufferedReader br= new BufferedReader(new FileReader(file));
//		 
//		 String st;
//		 while((st=br.readLine())!=null) {   // br returns string till it finds new line character 
//			 System.out.println(st);
//		 }
		 
		 //read char by char
//		 while(c=br.read()!=-1) {   //read () reads only 2 bytes means 1 character at a time  and then covert it into ascii values
//			 System.out.println((char)c);
//		 }
		 
		 //read byte by byte
//		 byte[] bytes=Files.readAllBytes(Paths.get(path));
//		 for(int i=0;i<bytes.length;i++) {
//			 System.out.println(bytes[i]);
//			 System.out.println((char)bytes[i]);
//		 }
		 
		 
		 
		List<String> listOfStrings = new ArrayList<String>();

		// read entire line as string
		String line = br.readLine();

		while (line != null) {
			listOfStrings.add(line);
			line = br.readLine();
		}

		for (String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}
	
	void saveOutputIntoAFile() throws IOException {
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("output.txt",true); // true parameter means output always append not overwrite and stores in log file
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		f_writer.write(text);
		f_writer.close();      //free the thread or memory
		
	}
	void createALogFile() throws IOException {
            
			a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\Ankita Singh\\git\\FirstJavaproject\\LearnJavaInDepth\\src\\Unit_03\\log.txt",true);
			//true is for saving the whole output without overwriting
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f_writer.close();

	}

}