// java2 5주차, 동아리 참여 명단을 활용해 답을 구하는 프로그램
// 3개 동아리에 모두 참여하는 학생 명단
// 적어도 1개 이상의 동아리에 팜여하는 학생 명단
// soccer 또는 dance에 참여하지만, computer에는 참여하지 않는 학생 명단
import java.util.*;

public class ClubMember {
  public static void main(String[] args) {
    ArrayList<String> computer = new ArrayList<String>(Arrays.asList("대찬","동권","진석","수현","유림","아현","용민","현우","교선","민재","기태"));
    ArrayList<String> soccer = new ArrayList<String>(Arrays.asList("창민","진석","희수","유림","용민","현정","한겅","민재","준영","기태","동권","지선"));
    ArrayList<String> dance = new ArrayList<String>(Arrays.asList("지선","수현","유림","용민","철희","한겅","태환","기태","서연","예린","현우"));
    ArrayList<String> three = new ArrayList<String>();
    ArrayList<String> one = new ArrayList<String>();
    ArrayList<String> ones = new ArrayList<String>();
    
    for(String p: soccer) {
      if(computer.contains(p)&&dance.contains(p)) {
        three.add(p);
      }
    }
    System.out.println("3개동아리 모두 참여하는학생: "+ three);
    
    for(String p:soccer) {
      one.add(p);
      for(String k:computer) {
        if(one.contains(k)) {
        }
        else {
        one.add(k);
        }
      for(String l:dance) {
        if(one.contains(l)) {
        
        }
          else {
          one.add(l);
          }
        }
      }
    }
    System.out.println("적어도 한개 이상의 동아리에 참여하는 학생: "+ one);
    
    for(String p: soccer) {
      ones.add(p);
      for(String k:dance) {
        if(ones.contains(k)) {
          }else {
          ones.contains(k);
        }
      }
    }
    
    ones.removeAll(computer);
    System.out.println("soccer 또는 dance에 참여하지만, computer에는 참여하지 않는 학생: "+ ones);
    
  }

}
