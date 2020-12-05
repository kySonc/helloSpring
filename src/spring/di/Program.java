package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import spring.di.entity.Exam;
//import spring.di.entity.KysoncExam;
import spring.di.ui.ExamConsole;
//import spring.di.ui.GridExamConsole;
//import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		//스프링에게 지시하는 방법으로 코드를 변경(setting.xml)
//		Exam exam = new KysoncExam();
//		ExamConsole console = new InlineExamConsole(exam);	//DI
//		ExamConsole console = new GridExamConsole(); //스프링을 통해 외부설정으로 코드를 빼야한다
		
//		console.setExam(exam);
//		ExamConsole console = ?;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
