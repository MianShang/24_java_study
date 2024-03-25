import java.util.Scanner; //스캐너 클래스만 가져온다. 입력시 안나오면 클릭으로 추가해줘야함.

public class EX308 {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); //System.in 키보드 입력 객체 스트림 (객체 생성)
		 * //객체 만들때 마다 new자주나옴 미리 알아둘것 //Scanner 객채명 = new Scanner(System.in);
		 * System.out.println("Your Name : ");
		 *  String name = input.nextLine();//Scanner
		 * 클래스 nextLine()메서드 이용 키보드 한 줄 데이터 입력을 받는다.
		 * System.out.println("Your Name = "+name);
		 */
		 
		Scanner input  = new Scanner(System.in);
		System.out.println("Your Name : ");
		String name = input.nextLine(); //문자형이라 String
		System.out.println("Your Name : "+name);
		
		
		System.out.println("Your Age : ");
		int Age = input.nextInt();//Int 형이라 int
		System.out.println("Your Age : "+Age);
		
		System.out.println("Your WEIGHT : ");
		double weight = input.nextDouble();//실수형이라 Double
		System.out.println("Your WEIGHT : "+weight);
		
		System.out.println();
		System.out.println("<Input Data>");
		System.out.println("Your Name : "+name);
		System.out.println("Your Age : "+Age);
		System.out.println("Your WEIGHT : "+weight);
		
		System.out.println("숫자 3개를 입력하세요");
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
	}

}
