package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
				
		long start = System.currentTimeMillis();
		
		Object result = invocation.proceed(); //�־��� ȣ��
		
		long end = System.currentTimeMillis();
		
		String massage = (end-start) + "ms �ð��� �ɷȽ��ϴ�";
		System.out.println(massage);
		
		return result;
	}

}
