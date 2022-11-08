package org.filee;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
	File f1=new File("C:\\Users\\admin\\eclipse-workspace\\A\\B");
	boolean folder = f1.mkdir();
	System.out.println(folder);
	
	
//	File f2=new File("C:\\Users\\admin\\eclipse-workspace\\deepan");
//	boolean folders = f2.mkdir();
//	System.out.println(folders);
	
   File f2=new File("C:\\Users\\admin\\eclipse-workspace\\FileOPeratioin\\A\\maha");
	boolean folders = f2.mkdirs();	
		System.out.println(folders);
		
	
		File f3=new File("C:\\Users\\admin\\eclipse-workspace\\FileOPeratioin\\A\\B\\C\\E");
		boolean createNewFile = f3.createNewFile();
		System.out.println(createNewFile);
	
		System.out.println("f1.............."+f1.isFile());
		System.out.println("f3..............."+f3.isFile());
		
		System.out.println("f1.............."+f1.isDirectory());
		System.out.println("f3..............."+f3.isDirectory());
		
		
		String Path = f3.getAbsolutePath();
		System.out.println(Path);
		
		
		System.out.println(f3.canRead());
		System.out.println(f3.canWrite());
	System.out.println(f3.exists());
	System.out.println(f3.isHidden());
	
	
	File f4=new File("C:\\Windows");
	
	String[] filename = f4.list();
	for(String x:filename) {
		System.out.println(x);
	}
	System.out.println(".............file location.....................");
	File[] fileloc = f4.listFiles();
	for(File x:fileloc) {
		System.out.println(x);
	}
	
	System.out.println("text1");
	System.out.println("text2");
	}
}