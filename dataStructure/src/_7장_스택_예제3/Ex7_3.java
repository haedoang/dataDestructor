package _7장_스택_예제3;

/**
 * 		p.285 예제3
 * 		스택을 이용한 수식의 괄호 검사하기, 중위 표기식을 후위 표기식으로 변환하기
 * */
public class Ex7_3 {
	public static void main(String[] args) {
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		int value;
		System.out.println(exp);
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림");
		
		System.out.printf("\n 후위표기식 : ");
		postfix = opt.toPostfix(exp);
		System.out.println(postfix);
	}
}
