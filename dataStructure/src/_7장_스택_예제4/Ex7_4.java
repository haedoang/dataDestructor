package _7장_스택_예제4;

public class Ex7_4 {
	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		int result;
		String exp = "35*62/-";
		System.out.printf("\n후위포기식 : %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n 연산결과 = %d \n",result
		);
		
	}
}
