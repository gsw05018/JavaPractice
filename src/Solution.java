public class Solution {

	// solution 메소드를 static으로 선언하여 main에서 직접 호출할 수 있도록 함
	public static int[][] solution ( int n ) {
		int[][] answer = new int[ n ][ n ];
		int value = 1;
		int col = 0;
		int row = 0;
		int direction = 0;

		while ( value <= n * n ) {
			answer[ row ][ col ] = value++;

			if ( direction == 0 ) {
				if ( col == n - 1 || answer[ row ][ col + 1 ] != 0 ) {
					direction = 1;
					row++;
				} else {
					col++;
				}
			} else if ( direction == 1 ) {
				if ( row == n - 1 || answer[ row + 1 ][ col ] != 0 ) {
					direction = 2;
					col--;
				} else {
					row++;
				}
			} else if ( direction == 2 ) {
				if ( col == 0 || answer[ row ][ col - 1 ] != 0 ) {
					direction = 3;
					row--;
				} else {
					col--;
				}
			} else if ( direction == 3 ) {
				if ( row == 0 || answer[ row - 1 ][ col ] != 0 ) {
					direction = 0;
					col++;
				} else {
					row--;
				}
			}
		}
		return answer;
	}

	// main 메소드에서 solution 메소드를 호출하여 결과를 사용하거나 출력할 수 있음
	public static void main ( String[] args ) {
		int n = 4; // 예를 들어 n = 4로 설정
		int[][] result = solution ( n );

		// 결과 배열 출력
		for ( int i = 0 ; i < n ; i++ ) {
			for ( int j = 0 ; j < n ; j++ ) {
				System.out.print ( result[ i ][ j ] + " " );
			}
			System.out.println ( );
		}
	}
}