package io;
import java.io.*;

public class IoStreamEx {
	public static void main(String[] args) {
		String path="C:\\Users\\admin\\eclipse-workspace\\swathi";
		File file=new File(path);
		boolean isDir=file.isDirectory();
		System.out.println("is dir="+isDir);
		System.out.println("is file="+file.isFile());
		System.out.println("is hidden"+file.isHidden());
		if(isDir) {
			String[] files=file.list();
			for(String f:files) {
				System.out.println(f);
			}
		}
		File dirToBeCreated=new File("C:\\Users\\admin\\eclipse-workspace\\swathi");
		boolean created=dirToBeCreated.mkdir();
		System.out.println("dir created="+created);
		
	}

}
