public class arrayDev {
	public static void main ( String[] args ) {
		int[] odds = { 1, 2, 3, 4, 5, 6 };

		System.out.println ( odds[ 1 ] ); // 2

		String[] weeks = { "월", " 화", "수", "목" };
		String[] weeKs = new String[ 7 ]; // [] 숫자를 넣지 않으면 컴파일 에러가 나옴
		weeKs[ 0 ] = "월";
		weeKs[ 1 ] = "화";
		weeKs[ 2 ] = "수";
		weeKs[ 3 ] = "목";
		weeKs[ 4 ] = "금";
		weeKs[ 5 ] = "토";
		weeKs[ 6 ] = "일";

		System.out.println ( weeKs.length );
		// 7 length > 길이

		System.out.println ( weeKs[ 3 ] );
		// 목

		// 배열의 길이 구하기
		for ( int i = 0 ; i < weeKs.length ; i++ ) {
			System.out.println ( weeKs[ i ] );
		}
		// 반복문으로 배열을 반복
	}
}
