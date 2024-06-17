package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public static void main(String[] args) {
		
		
		//FileInputStream ips= new FileInputStream("E:\\Testing batch\\API.png");
	
	try
	{
		FileInputStream ips= new FileInputStream("E:\\Testing batch\\API.png");
	}
	catch(Exception e)
	{
		System.out.println("Check the file path and file name");
	}
	

}
}
