package Writer_writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample3 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		for(int i = 0; i< data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
	}
}
