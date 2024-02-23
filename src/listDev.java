public class listDev {
	public static void main ( String[] args ) {
		// List는 배열과 비슷하다.
		// array는 크기가 정해져 있지만 List는 변하고 크기가 제한이 없다는 차이점이 있다

		java.util.ArrayList x = new java.util.ArrayList ( );
		x.add ( "102" ); // [0]
		x.add ( "123" ); // [1]
		x.add ( "132" ); // [2]
		System.out.println ( x.get ( 2 ) );
		// 132
		System.out.println ( x.size ( ) );
		// 3
		System.out.println ( x.contains ( "1233" ) );
		// false
		System.out.println ( x.remove ( "123" ) ); // 객체에 해당하는 항목을 삭제한 뒤 true, false 리턴
		// true
		System.out.println ( x.remove ( 1 ) ); // 인덱스에 해당하는 항목을 삭제한 뒤 그 항목을 리턴
		// 132
		System.out.println ( x );
		// remove하고나서 102만 남아서 102 출력

		String[] a = { "123", "134", "232" };
		java.util.ArrayList b = new java.util.ArrayList ( java.util.Arrays.asList ( a ) );
		System.out.println ( b );
		// 123, 134, 232 
		// 문자열 배열을 이용해 편리하게 생성 가능

		java.util.ArrayList < String > c = new java.util.ArrayList <> ( java.util.Arrays.asList ( "138", "232", "222" ) );
		System.out.println ( c );
		// 138, 232, 222

		// String.join
		String result = "";
		for ( int i = 0 ; i < b.size ( ) ; i++ ) {
			result += b.get ( i );
			result += "::";
		}
		result = result.substring ( 0, result.length ( ) - 2 );
		System.out.println ( result );
		// 123::134::232 마지막 :: 제거
		// b의 요소 개수만큼 루프를 돌면서 반복을 한 뒤 마지막 문자를 제거하는 방식

		result = String.join ( "-", b );
		System.out.println ( result );
		// 123-134-232
		// String.join("구분자", 리스트 객체)를 이용해 각 요소에 구분자를 넣어 하나의 문자열로 간단하게 만들 수 있다.

		b.sort ( java.util.Comparator.reverseOrder ( ) );
		System.out.println ( b ); // 내림차순으로 정렬 232, 134, 123
		// Comparator.reverseOrder : 내림차순
		// Comparator.naturalOrder : 올림차순

	}


}
