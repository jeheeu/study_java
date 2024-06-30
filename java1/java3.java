// java1 섭씨온도를 화씨온도로 변환하는 코드
package ex1;

import java.util.Scanner;

public class Ex03_09 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner input = new Scanner( System.in );

		double celsius;



		System.out.print("Celsius: ");

		celsius = input.nextDouble();



		System.out.println("Fahrenheit: " + (celsius*1.8 + 32));

	}

}

