// java1 7주차, 병렬패리티
package ex13;



public class Ex07_1 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[][] input =  { { 1, 0, 1, 0, 1, 1, 1, 1 },

						{ 1, 0, 0, 0, 0, 0, 1, 1 },

						{ 0, 1, 0, 0, 0, 0, 0, 0 },

						{ 1, 1, 1, 1, 0, 0, 0, 0 },

						{ 1, 0, 1, 1, 1, 0, 0, 1 },

						{ 0, 0, 0, 0, 0, 1, 1, 1 },

						{ 1, 1, 1, 1, 1, 1, 1, 1 },

						{ 0, 1, 1, 1, 1, 0, 0, 0 } };

		for ( int student=0; student < input.length; student++ )

		{

			for( int test=0; test < input[student].length; test++ )

				System.out.printf( "%4d ", input[student][test] );

			System.out.printf( " = %d\n", getAverage( input[student] ));

		}

		for( int test=0; test < input[0].length; test++ )

			System.out.printf( "   %d ", getTestAverage( input, test ) );

		System.out.println();

		}

		public static int getAverage( int[] arr )

		{

			int m = 0;

			for( int d : arr )

				m += d;

			if (m%2 == 0) {

				m = 1;

			}else {

				m=0;

			}

			

			return m;

	}

	public static int getTestAverage( int[][] arr, int test )

	{

		int m = 0;

		for( int student=0; student < arr.length; student++ )

			m += arr[student][test];

		if (m%2 == 0) {

			m = 1;

		}else {

			m=0;

		}

		return m;



	}



}
