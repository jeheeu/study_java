// java2 9주차, stack trace, throw 실행문, chained exception 예외처리 학습후 활용
// 예외처리를 추가해서 "0을 입력하지마세요:0" -> "제발 0을 입력하지마세요!"
// "0을 입력하지마세요:1" -> "1를 입력했습니다." 결과가 나오게 코드 작성
import java.util.Scanner;
public class EXceptionAssignment {
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
      System.out.print("0을 입력하지 마세요: ");
      String s = input.nextLine();
      try {
         f(s);
      }
      catch (Exception e) {
         System.out.println("제발 0을 입력하지 마세요!");
      }
      System.out.println(s + "를 입력했습니다.");
      input.close();
   }
   static void f(String s) throws Exception {
      Exception e = new Exception();
      if (s.equals("0")) 
         throw new Exception();

}

}
