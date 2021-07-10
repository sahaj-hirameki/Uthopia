package Assignment;

import java.io.File;

public class Make_directory {

	public static void main(String[]args)
	{
		int start = 100;
		int end = 1000;
		
		for(int i=0;i<10;i++)
		{
			double b1 = Math.random();
			int b2 = (int)(b1*(end-start));
			File f1= new File("D:\\Hirameki_Work\\Automation\\Sahaj "+b2);
			f1.mkdir();
			System.out.println(f1);
		}
		System.out.println("Folders Created Successfully");
	}
	
}
