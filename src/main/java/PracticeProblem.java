import java.io.*;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		Scanner sc = null;
		String theFile = "";
	
		try{
			sc = new Scanner(new File(filename));
			while (sc.hasNextLine()){
				theFile += sc.nextLine() + "\n";
				
			}
			return theFile;

		}catch(FileNotFoundException e){
			return "cannot read";

		}finally {
			try{
				if (sc != null){
				sc.close();
				}
			}catch(Exception e){
				return "cannot close";
			}
		}

	}

	public static String backwardsReadFile(String filename){
		Scanner sc = null;
		String theRevFile = "";

		try{
			sc = new Scanner(new File(filename));
			while(sc.hasNextLine()){
				String theLine = sc.nextLine();
				String theRevLine = "";

				for(int i = theLine.length() - 1; i >= 0; i--){
					theRevLine += theLine.charAt(i);
				}

				theRevFile = theRevLine + "\n" + theRevFile;
			}
			return "\n"+ theRevFile.trim();

		}catch(FileNotFoundException e){
			return "cannot read";
		}finally{
			try{
				if(sc != null){
					sc.close();
				}
			}catch(Exception e){
				return "cannot close";
			}
		}
	}
}

