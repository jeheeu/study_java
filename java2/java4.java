// java2 4주차, 고객의 이름과 포인트 점수를 관리하는 프로그램(조건)
// 고객의 이름과 추가할 포인트를 한 줄에 입력 받기
// 기존의 고객이면 기존 점수에 합산
// 기존의 고객이 아니면, 새롭게 추가
// 매번 입력을 처리한 다음에 전체 데이터를 출력 
// vector 컬렉션을 사용
import java.util.Scanner;
public class StringRotation {
  public static void main(String[] args) {
    System.out.println("문자열을 입력하세요.");
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    
    System.out.println("<Enter>");
    
    while(true){
      String key = sc.nextLine();
      if(key.equals("")) {
        String first = text.substring(0, 1);
        String last = text.substring(1);
        text = last.concat(first);
        System.out.print(text + " >> ");
      }
      else if(key.equals("q")) {
        break;
      }
      else {
        System.out.print(text + " >> ");
      }
    }
  }

}
