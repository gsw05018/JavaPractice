public class SetDev {
	public static void main ( String[] args ) {
		// Set(집합) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 것으로  HashSet, TreeSet, LinkHashSet 등이 있다.

		// HashSet
		java.util.HashSet < String > set = new java.util.HashSet <> ( java.util.Arrays.asList ( "H", "e", "l", "l", "o" ) );
		System.out.println ( set );  //  [e, H, l, o] 출력
		// 중복 허용 x
		// 순서 x

		// 교집합 구하기
		java.util.HashSet < Integer > a = new java.util.HashSet <> ( java.util.Arrays.asList ( 1, 2, 3, 4, 5, 6, 7 ) );
		java.util.HashSet < Integer > b = new java.util.HashSet <> ( java.util.Arrays.asList ( 5, 6, 7, 8, 9, 10 ) );

		java.util.HashSet < Integer > c = new java.util.HashSet <> ( a ); // a로 객체를 만든다음
		c.retainAll ( b );  // retainAll 을 이용해 b랑 겹치는 부분을 구한다

		System.out.println ( c );
		// 5, 6, 7

		// 합집합 구하기

		java.util.HashSet < Integer > d = new java.util.HashSet <> ( a ); // a로 객체를 만든다음
		d.addAll ( b ); // addAll 로 합집합 구하기
		System.out.println ( d );
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		// 차집합 구하기

		java.util.HashSet < Integer > g = new java.util.HashSet <> ( a ); // a로 객체를 만든다음
		g.removeAll ( b ); // removeAll 로 합집합 구하기
		System.out.println ( g );
		// [1, 2, 3, 4]

	}


}
