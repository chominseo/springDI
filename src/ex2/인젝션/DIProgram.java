package ex2.인젝션;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIProgram {

	public static void main(String[] args){
		
		/*
		FileInputStream fis = new FileInputStream("src/ex1/setting.ini");
		Scanner fscan = new Scanner(fis);
		
		String className = fscan.nextLine();
		
		Exam exam = (Exam) Class.forName(className).newInstance();// 바꿔야 할 객체 new ?Exam();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex2/인젝션/config.xml");
		ExamConsole console = context.getBean(ExamConsole.class);		
		//ExamConsole console = (ExamConsole)context.getBean("console");//window.document.getElementById("exam");
		// 다형성?
		
		
		
		
		//console.input();
		console.print();
	
	}

}
