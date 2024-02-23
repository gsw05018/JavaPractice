public class StringBufferDev {
	public static void main(String[] args ){
		// StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
		// ex) append insert substring
		// String 자료형은 한번 생성이 되면 변경할 수가 없는데 StringBuffer 자료형은 값을 변경할 수 있으므로
		// 생성된 값으 변경이 가능하다. 다만 String 자료형보다 무거운 편에 속하기 때문에 메모리 사용량도 많고 속도도 느리다.

		// append
		StringBuffer sb = new StringBuffer ();
		sb.append("hello"); // 문자열을 게속 추가 가능
		sb.append("");
		sb.append("jump to java");
		String results = sb.toString (); // toString을 이용해 자료형을 문자열로 변경
		System.out.println ( results );
		// hello jump to java 출력

		String result = "";
		result += "hello";
		result += "";
		result += "jump to java";
		System.out.println ( result );
		// hello jump to java 출력
		// 여기서는 + 연산이 있을 때마다 새로운 String 객체를 생성하므로 총 4개의 String 객체가 생성

		StringBuffer sbs = new StringBuffer();
		sbs.append ( "jump to java" );
		sbs.insert(0, "hello");
		System.out.println ( sb.toString () );
		// insert는 인덱스 번째에 str을 문자열을 추가한다
		// hello jump to java 출력

		System.out.println ( sbs.substring ( 0, 4 ));
		// 인덱스번 ~ 인덱스 번까지 문자열 출력
	}

}
