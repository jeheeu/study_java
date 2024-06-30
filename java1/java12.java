//java1 12주차, 2차방정식의 실수해를 구하는 코드
package ex13;

import java.util.Scanner;



public class ejln {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");

		double a = input.nextDouble();

		double b = input.nextDouble();

		double c = input.nextDouble();



		double Det = Math.pow(b, 2) - 4 * a * c;

		if(Det > 0) {

			double x1 = ( -b + Math.sqrt(Det) ) / (2*a);

			double x2 = ( -b - Math.sqrt(Det) ) / (2*a);

			System.out.printf("x(+)=%f, x(-)=%f\n", x1, x2);

		}

		else if(Det < 0)

			System.out.println("no answer");

		else {

			double x= -b / (2*a);

			System.out.printf("x=%f\n", x);

		}

	}



}
