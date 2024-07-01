// java2 12주차, 1번째 파일, Student.java에 객체들이 가질 틀 정의
// 학생정보를 나타내는 Student 클래스를 선언
// Student 객체는 학생이름, 학번, 전화화번호를 가짐
// toString()을 구현
import java.io.Serializable;
public class Studentt implements Serializable {
private static final long serialVersionUID = 1L;
private String name;
   private String num;
   private String tel;
   
   public Studentt(String name, String num, String tel) {
      this.name = name;
      this.num = num;
      this.tel = tel;
   }
   
   @Override
   public String toString() {
      return String.format("이름 : %s | 학번 : %s | 전화번호 : %s", name, num, tel);
   }
}
