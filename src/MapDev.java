public class MapDev {
	public static void main ( String[] args ) {
		// Map은 이름 = 홍길동 이렇게 대응 관계를 쉽게 표현할 수 있게 해주는 자료형
		// Map은 key(키)와 value(값)을 한쌍으로 갖는 자료형

		// HashMap

		// put : key와 value을 추가 가능하다
		java.util.HashMap < String, String > map = new java.util.HashMap <> ( );
		map.put ( "people", "사람" );
		map.put ( "운동", "야구" );
		System.out.println ( map );
		// {people = 사람, 운동 = 야구} 출력

		// get : key에 해당되는 value 값을 얻을 때 사용
		System.out.println ( map.get ( "운동" ) );
		// 야구 출력

		System.out.println ( map.get ( "대학교" ) );
		// 해당되는 값이 없기 때문에 'null'이 나옴

		System.out.println ( map.getOrDefault ( "대학교", "대전과기대" ) );
		// getOrDefault를 이용해 key값하고 defaultValue값을 지정 
		// 대전과기대 출력

		System.out.println ( map.containsKey ( "대학교" ) );
		// map에 해당되는 key가 있는지 false true 값을 반환
		// false 출력

		System.out.println ( map.containsValue ( "야구" ) );
		// map에 해당되는 value가 있는지 false true 값을 반환
		// true 출력


		System.out.println ( map.keySet ( ) );
		// key값을 모아서 리턴
		// people, 운동 출력

		System.out.println ( map.remove ( "운동" ) );
		// key값을 삭제 후 value값을 반환

		System.out.println ( map );
		// 운동  key값을 삭제하여 people=사람 출력이 됨

		System.out.println ( map.size ( ) );
		// 1
	}


}
