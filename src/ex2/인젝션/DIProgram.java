package ex2.������;

import java.io.FileNotFoundException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIProgram {

	public static void main(String[] args){
		
		/*
		FileInputStream fis = new FileInputStream("src/ex1/setting.ini");
		Scanner fscan = new Scanner(fis);
		
		String className = fscan.nextLine();
		
		Exam exam = (Exam) Class.forName(className).newInstance();// �ٲ�� �� ��ü new ?Exam();
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ex2/������/config.xml");
		ExamConsole console = context.getBean(ExamConsole.class);		
		//ExamConsole console = (ExamConsole)context.getBean("console");//window.document.getElementById("exam");
		// ������?
		
		
		
		
		//console.input();
		console.print();
	
	}

}
