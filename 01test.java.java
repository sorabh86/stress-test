import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.time.Instant;

public class StressTest {

	private static int ONELAKH = 10000000;

	public static void main(String[] args) {

		try {
			long startTime = Instant.now().toEpochMilli();

			File f = new File("test-java.txt");
			FileWriter w = new FileWriter(f);

			for(int i=0; i<ONELAKH; i++) 
				w.write(i+". Java is great \n");

			w.close();
			long endTime = Instant.now().toEpochMilli();
			long time = endTime-startTime;
			System.out.println(time+" milliseconds (Java Language)");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}