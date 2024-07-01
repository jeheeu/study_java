// java2 3주차, 문장을 입력 받아 한 글자씩 회전 시켜 출력 시키는 코드 
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
