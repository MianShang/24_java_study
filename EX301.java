
public class EX301 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		double c = 2.0;
		
		int n = a+b ,n1 = a-b,n2=a*b, n3=a/b, n4 = a%b; //c를 넣을경우 n은 int형이기 때문에 오류가 뜬다 그러므로 형변환을 해줘야 함
		int j = a%(int)c;
		
		double m = 1+(1/2.0)+(1/3.0)+(1/4.0)+(1/5.0);
		float l = 1+(float)(1/2.0)+(float)(1/3.0)+(float)(1/4.0)+(float)(1/5.0);
		/*System.out.println("a+b= "+(a+b));
		System.out.println("a-b= "+(a-b));
		System.out.println("a*c= "+(a*c));
		System.out.println("a/c= "+(a/c));
		System.out.println("a%c= "+(a%c));
		
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(j);
		*/
		
		/*System.out.println("a+b*c= "+(a+b*c));
		System.out.println("(a+b)*c= "+(a+b)*c);*/
		
		/*
		//관계 연산자
		System.out.println(a==b); 
		System.out.println(a!=b);
		
		//논리 연산자
		System.out.println(a<10 && a<20);
		System.out.println(a<10 || a<20);*/
		
		/*
		//증감 연산자
		System.out.println(a++); //a = a+1
		System.out.println(a);
		
		//실습 1
		//실수형 계산 정수+정수로 계산해서 정수 1/2 = 0로 인식 그래서 형 변환 해줘야 한다.
		System.out.println(m);
		System.out.println(l); //처음부터 float으로 계산을 안할경우 float 범위를 벗어나서 계산이 안된다.
		//형 변환 연산자는 자료형이 아니라 데이터의 앞에 붙여아함 자료형은 데이터 값이 안맞음으로 변환 해주는것뿐임. */
		
		//실습 2
		int ko = 85, en = 79, mt=95;
		double avg = 0;
		avg = (ko+en+mt)/3d; //뒤에 d를 붙이면 double로 먹힌다.
		
		System.out.println(avg);
		
		
		
	}

}
