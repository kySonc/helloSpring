package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.KysoncExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		//���������� �����ϴ� ������� �ڵ带 ����(setting.xml)
//		Exam exam = new KysoncExam();
//		Exam exam = new KysoncExam(10,10,10,10); setting.xml���� constructor(�����ڷ� �������ϱ�)
//		ExamConsole console = new InlineExamConsole(exam);	//DI
//		ExamConsole console = new GridExamConsole(); //�������� ���� �ܺμ������� �ڵ带 �����Ѵ�
		
//		console.setExam(exam);
//		ExamConsole console = ?;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new KysoncExam(1,1,1,1)); settin.xml ����
				
		/*
		 * for(Exam e : exams) { System.out.println(e); }
		 */
		
	}

}
