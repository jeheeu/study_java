// 자바1 2주차 수업 코드 Addition
package java1;

import java.util.Scanner;



public class ex2

{

	public static void main( String[] args )

	{

		Scanner input = new Scanner( System.in );

		int number1;

		int number2;



		System.out.print( "Enter first integer: " );

		number1 = input.nextInt();



		System.out.print( "Enter second integer: " );

		number2 = input.nextInt();



		int sum = number1 + number2;

		System.out.printf( "Sum is %o in octal, ", sum);

		System.out.printf( "%d in decimal, ", sum);

		System.out.printf( "%x in hexadecimal.", sum);

	}

}
