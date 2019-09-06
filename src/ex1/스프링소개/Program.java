package ex1.스프링소개;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/ex1/setting.ini");
		Scanner fscan = new Scanner(fis);
		
		
		String className = fscan.nextLine();
		
		Exam exam = (Exam) Class.forName(className).newInstance();
		//다형성?
		exam.input();
		exam.print();

	}

}
