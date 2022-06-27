package com.question2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("abc.txt");
			int c = fr.read();
			while(c!=(-1))
			{
				System.out.println(c);
				c=fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
