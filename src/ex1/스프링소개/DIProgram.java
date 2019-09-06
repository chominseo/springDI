package ex1.스프링소개;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIProgram {
	
	public static void main(String[] args){
		
		/*
		 FileInputStream fis = new FileInputStream("src/ex1/setting.ini"); Scanner
		 fscan = new Scanner(fis);
		  
		  
		 String className = fscan.nextLine();
		  
		 Exam exam = (Exam) Class.forName(className).newInstance();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1/config.xml");
		
		Exam exam = (Exam)context.getBean("exam");//window.document.getElementById("exam");
		//다형성?
		exam.input();
		exam.print();

	}

}
