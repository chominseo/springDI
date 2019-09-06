package ex1.�������Ұ�;

import java.util.Scanner;

public class DefaultExam implements Exam {
   int kor;
   int eng;
   int math;
   
   public DefaultExam(){      
      this(0,0,0);
   }
   
   public DefaultExam(int kor, int eng, int math) {
      this.kor = kor;
      this.eng = eng;
      this.math = math;
   }
   
   public int getKor() {
      return kor;
   }
   public void setKor(int kor) {
      this.kor = kor;
   }
   
   public void setKor() {
      this.kor = 0;
   }
   
   public int getEng() {
      return eng;
   }
   public void setEng(int eng) {
      this.eng = eng;
   }
   public int getMath() {
      return math;
   }
   public void setMath(int math) {
      this.math = math;
   }
   public int total() {
      // TODO Auto-generated method stub
      return kor + eng + math;
   }
   public float avg() {
      // TODO Auto-generated method stub
      return total() / 3.0f;
   }
   
   public void input() {      
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  �Է�                   ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
        
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
                
        
   }

   public void print() {
            
      System.out.println("����������������������������������������������������������");
        System.out.println("��           ����  ���                   ��");
        System.out.println("����������������������������������������������������������");
        System.out.println();
        
        int total =  total();         
        float avg = avg();
       
       System.out.printf("kor:%d, eng:%d, math:%d, total :%d, avg:%f\n", 
             kor, eng, math, total,  avg);
       
        
        System.out.println("����������������������������������������������������������");
      
   }

   
   
}