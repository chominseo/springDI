package ex2.인젝션;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("console")
@Component
public class ExamConsole {
	
	private Exam exam;
	
	public ExamConsole() {
		// TODO Auto-generated constructor stub
	}
		
	public ExamConsole(Exam exam) {
		
		this.exam = exam;
	}
	
	@Autowired
	@Qualifier("exam")
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void input() {		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  입력                  │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
        
        int kor, eng, math;
        
        do {
	        System.out.printf("국어 : ");
	        kor = scan.nextInt();
        
	        if(kor < 0 || 100 < kor)
	        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
	        
        }while(kor < 0 || 100 < kor);
        
        do {
	        System.out.printf("영어 : ");
	        eng = scan.nextInt();
        
	        if(eng < 0 || 100 < eng)
	        	System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
	        
        }while(eng < 0 || 100 < eng);
        
        do {
	        System.out.printf("수학 : ");
	        math = scan.nextInt();
        
	        if(math < 0 || 100 < math)
	        	System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
	    
        }while(math < 0 || 100 < math);
        
        System.out.println("─────────────────────────────");
                
        DefaultExam exam = (DefaultExam)this.exam;
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);
        
	}

	public void print() {
				
		System.out.println("┌───────────────────────────┐");
        System.out.println("│           성적  출력                  │");
        System.out.println("└───────────────────────────┘");
        System.out.println();
        
        DefaultExam exam = (DefaultExam)this.exam;
        
        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath(); 
        
        int total =  exam.total();	    
        float avg = exam.avg();
    	
    	System.out.printf("kor:%d, eng:%d, math:%d, total :%d, avg:%f\n", 
    			kor, eng, math, total,  avg);
               
        System.out.println("─────────────────────────────");
		
	}
}
