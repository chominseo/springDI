package ex2.¿Œ¡ßº«;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DefaultExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	
	public DefaultExam(){
		this(0,0,0);
	}
	
	@Autowired
	public DefaultExam(@ Value("1") int kor,@ Value("2") int eng,@ Value("3") int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}
	//@Value("2")
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setKor() {
		this.kor = 0;
	}
	
	public int getEng() {
		return eng;
	}
	//@Value("3")
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
}
