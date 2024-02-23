public class String {
	public static void main(String[] args ){
		
		String a = "Happy word"; // 리터럴(literal)표기 방식
		
		String b = new String("Happy Java"); // 객체 생성 방식
		//  a와 b는 같은 문자열 값을 갖게 되지만 완전히 동일하지는 않다.
		// literal 방식은 고정된 값을 그대로 대입하는 방식이지만, 
		// b는 항상 새로운 String  객체를 만든다.

		int c  = 1;
		long d = 2;
		char f = 'd';
		double g = 3;
		boolean h = true;
		float j = 4;
		// 원시(primitive) 자료형이라고 하는데 이것은 new 키워드로 값을 생성할 수 없고 literal 방식으로 밖에 안된다. 
		
		// equals : 문자열 2개가 같은지를 비교하여 결과값을 리턴한다.
		
		// indexOf : 문자열에서 특정 문자열이 시작되는 위치값을 리턴한다.
		a.indexOf("Java"); // Happy Java에서 시작이 되는 순서인 6이라는 값이 나온다


		String q = "Hello Java";
		System.out.println(q.contains("Java"));  // contains : 문자열에 특정 문자열이 포함되어 있는지 여부를 리턴(true, false)
		System.out.println ( q.charAt(6) ); // 여섯번 째 인덱스인 J 출력
		System.out.println ( q.replaceAll("Java", "World") ); // 문자열에서 특정 문자열로 교체 Hello World
		System.out.println ( q.subString(0, 4) ); // 문자열에서 특정 문자열을 출력할 때 사용 Hell 출력
		System.out.println ( q.toUpperCase() ); // 모든 문자열을 대문자로 치환 HELLO WORLD 출력

		// 포맷팅
		// String.format을 이용하여 숫자와 문자열을 대입하기
		System.out.println ( "I eat %d apples", 3 ); // I eat 3 apples 출력
		System.out.println ( "I love %s ", "you" ); // I love you 출력

	}
	
	
}
