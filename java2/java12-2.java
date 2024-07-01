// java2 12주차, WriteStudent.java로 Student.java에서 만든 Student 객체를 만듬
// 정보를 가지는 Student 객체를 맊들어 파일 student.out에 저장
import java.io.*;

public class WriteStudent {
public static void main(String[] args) {
      Studentt s1 = new Studentt("홍길동", "2020001", "010-1111-1111");
      Studentt s2 = new Studentt("임꺽정", "2020002", "010-2222-2222");
      Studentt s3 = new Studentt("이순신", "2020003", "010-3333-3333");
      
      try {
         ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("student.out"));
         write.writeObject(s1);
         write.writeObject(s2);
         write.writeObject(s3);
         write.close();
      }
      catch(IOException e) {
      System.err.println("IO error");
      }
}
}
