package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.KysoncExam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new KysoncExam(1,1,1,1);
		
		//Proxy.newProxyInstance(loader, interfaces, h)
		Exam proxy = (Exam) Proxy.newProxyInstance(KysoncExam.class.getClassLoader(),
				new Class[] {Exam.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						long start = System.currentTimeMillis();
						
						Object result = method.invoke(exam, args);
																		
						long end = System.currentTimeMillis();
						
						String massage = (end-start) + "ms 시간이 걸렸습니다";
						System.out.println(massage);
						
						return result;
					}
				}
		);
		//System.out.printf("total is %d\n", exam.total());
		System.out.printf("total is %d\n", proxy.total());
		//System.out.printf("avg is %f\n", exam.avg());
		System.out.printf("avg is %f\n", proxy.avg());
	}

}
