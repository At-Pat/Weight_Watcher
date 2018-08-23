import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {

	private static final String FILENAME = "D:\\Dictionary.txt";
	
	
	public static void doesFileExist() { 
		File f = new File("D:\\Dictionary.txt");

		if(f.exists()){
		    System.out.println("File existed");
		}else{
		    System.out.println("File not found!");
		}
		
	}
	

	public static void main(String[] args) {
		ReadFileExample.doesFileExist();
		BufferedReader br = null;
		FileReader fr = null;

		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		

	}

}