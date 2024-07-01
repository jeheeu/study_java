// java2 6주차, 고객의 이름과 포인트 점수를 관리하는 프로그램을 작성(hashMap)
// 고객의 이름과 추가할 포인트를 한 줄에 입력 받으시오
// 기조의 고객이면 기좀 점수에 합산
// 매번 입력을 처리한 다음에 전체 데이터를 출력
import java.util.*;

public class CustomerEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    HashMap<String, Integer> manage = new HashMap<String, Integer>();
    
    while(true) {
      System.out.print("이름과 포인트 입력> ");
      String name = sc.next();
      if(name.equals("그만"))
        break;
      int point = sc.nextInt();
      if(manage.get(name) == null) {
        manage.put(name, point);
      }
      else {
        manage.put(name,  manage.get(name)+point);
      }
      Set<String> key = manage.keySet();
      Iterator<String> it = key.iterator();
      while(it.hasNext()) {
        String x = it.next();
        Integer y = manage.get(x);
        System.out.print("["+x+" " +y+"]");
      }
      System.out.println();
    }
  }
}
