package outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class outputstream_write {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}
}
