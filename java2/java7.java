// java2 7주차, try-catch 블록 활용
// 5개의 실수값을 입력 받아 평균을 계산하여 출력하는 프로그램 박성
// Scanner 클래스의 nextDouble() 메소드를 사용하여 실수값을 입력 받기
// nextDouble() 메소드의 예외를 밑에 조건처럼 처리
// InputMismatchException: 실수값이 아닌 입력이 들어오는 경우 발생. 메시지 (“Try again.”)를 출력하고 다시 입력을 받음
// NoSuchElementException : 입력값의 개수가 부족한 경우, 메시지("Bye")를 출력하고 프로그램을 종료
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Average {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int i;
      int sum = 0;

      for( i=0; i<5; i++) {
         try {
            System.out.print(i+1 + " -th value:");
            double a= scanner.nextDouble();
            sum += a; 
         }
         catch(InputMismatchException e) {
            System.out.println("Try again");
            scanner.next();
            i--;
         }
         catch(NoSuchElementException e) {
            System.out.println("Bye");
            break;
         }
      }
      if(i==5) {
         System.out.println((double)sum/5);
      }
   }
}
