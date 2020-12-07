package spring.aop.entity;

public class KysoncExam implements Exam {
	
	private int kor;	
	private int eng;
	private int math;
	private int com;
	
	public KysoncExam() {
		// TODO Auto-generated constructor stub
	}
		
	public KysoncExam(int kor, int eng, int math, int com) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
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

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public int total() {
		//long start = System.currentTimeMillis();
		
		int result = kor+eng+math+com;
		
		//시간 재우기
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//long end = System.currentTimeMillis();
		
		//String massage = (end-start) + "ms 시간이 걸렸습니다";
		//System.out.println(massage);
		
		return result;
	}

	@Override
	public float avg() {
		
		float result = total() / 4.0f; 
		
		return result;
	}



	@Override
	public String toString() {
		return "KysoncExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}

	
}
