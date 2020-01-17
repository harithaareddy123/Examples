package Exception;

import java.io.*;

public class IoEx3 {
	public static void main(String[] args) throws Exception {
		long startTime = System.currentTimeMillis();
		IoEx3 ex = new IoEx3();
		ex.execute();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.print("Execution=" + executionTime);
	}

	public void execute() throws Exception {
		InputStream is = null;
		OutputStream os = null;
		try {
			String path = "D:/ramya/abc.txt";
			File inputFile = new File(path);
			is = new FileInputStream(inputFile);
			File outFile = new File("D:/ram");
			os = new FileOutputStream(outFile);
			int readBytestCount;
			byte[] buffer = new byte[1000];
			BufferedInputStream bis = new BufferedInputStream(is);
			while ((readBytestCount = is.read(buffer)) >= 0) {
				os.write(buffer, 0, readBytestCount);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if ((is != null)) {
				is.close();
			}
			if ((os != null)) {
				os.close();
			}

		}

	}
}
