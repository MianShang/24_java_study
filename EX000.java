public class EX000 {

	public static void main(String[] args) {
		/*int count = 10;
		final int speed = 60;
		
		count = 11;
		//speed = 60;
		
		System.out.println(count);
		System.out.println("속도는 = "+speed);
		System.out.println();
		System.out.println();*/

		int i = 97;
		String s = "Java";
		double f = 3.14f;
		
		System.out.printf("%d\n", i);
		System.out.printf("%s\n", s); //자릿수가 정해져있는 상태로 정렬할 경우 숫자는 오른쪽 정렬 문자는 왼쪽 정렬
		System.out.printf("%5s\n", s); 
		System.out.printf("%-5s\n", s); 
		System.out.printf("%f\n", f); 
		System.out.printf("%e\n", f); 
		System.out.printf("%4.1f\n", f); //앞의는 자릿수 .뒤에 숫자는 실수부분 몇자리 까지 출력
		System.out.printf("%04.1f\n", f); 
		System.out.printf("%-4.1f\n", f); 
		
		
	}

}
