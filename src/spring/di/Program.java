package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		//���������� �����ϴ� ������� �ڵ带 ����(setting.xml)
//		Exam exam = new KysoncExam();
//		Exam exam = new KysoncExam(10,10,10,10); setting.xml���� constructor(�����ڷ� �������ϱ�)
//		ExamConsole console = new InlineExamConsole(exam);	//DI
//		ExamConsole console = new GridExamConsole(); //�������� ���� �ܺμ������� �ڵ带 �����Ѵ�
		
//		console.setExam(exam);
//		ExamConsole console = ?;
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml"); //Xml�� �̿�
		ApplicationContext context = new AnnotationConfigApplicationContext(KysoncDIConfig.class); //������̼��� �̿�
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
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
