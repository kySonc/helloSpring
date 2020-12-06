package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	

	@Autowired(required = false)
	@Qualifier("exam2")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor"); //필드로 @Autowired를 사용할때 기본생성자가 호출되는지 확인 
	}
	
	public InlineExamConsole(Exam exam) {
		System.out.println("overloaded constructor"); 
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter"); //필드로 @Autowired를 사용할때 호출되는지 확인
		this.exam = exam;
		
	}

}
