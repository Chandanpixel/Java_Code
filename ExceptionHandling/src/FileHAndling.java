import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHAndling {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr = null;
		fr = new FileReader("C:\\Users\\CHANDASA\\Text.txt");
		
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);


	}

}
