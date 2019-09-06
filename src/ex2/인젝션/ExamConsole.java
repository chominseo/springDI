package ex2.������;

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
		
		System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  �Է�                  ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
        
        int kor, eng, math;
        
        do {
	        System.out.printf("���� : ");
	        kor = scan.nextInt();
        
	        if(kor < 0 || 100 < kor)
	        	System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
	        
        }while(kor < 0 || 100 < kor);
        
        do {
	        System.out.printf("���� : ");
	        eng = scan.nextInt();
        
	        if(eng < 0 || 100 < eng)
	        	System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
	        
        }while(eng < 0 || 100 < eng);
        
        do {
	        System.out.printf("���� : ");
	        math = scan.nextInt();
        
	        if(math < 0 || 100 < math)
	        	System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");
	    
        }while(math < 0 || 100 < math);
        
        System.out.println("����������������������������������������������������������");
                
        DefaultExam exam = (DefaultExam)this.exam;
        exam.setKor(kor);
        exam.setEng(eng);
        exam.setMath(math);
        
	}

	public void print() {
				
		System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  ���                  ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
        
        DefaultExam exam = (DefaultExam)this.exam;
        
        int kor = exam.getKor();
        int eng = exam.getEng();
        int math = exam.getMath(); 
        
        int total =  exam.total();	    
        float avg = exam.avg();
    	
    	System.out.printf("kor:%d, eng:%d, math:%d, total :%d, avg:%f\n", 
    			kor, eng, math, total,  avg);
               
        System.out.println("����������������������������������������������������������");
		
	}
}
