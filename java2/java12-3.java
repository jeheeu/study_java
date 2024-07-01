// java2 12주차, ReadStudent.java으로 이전 12-2에서 만든 student.out 파일에서의 객체들 활용
// 파일 student.out에 저장되어 있는, 3개의 Student 객체를 읽음
// 화면에 각 학생의 이름, 학번, 전화번호를 출력
import java.io.*;

public class ReadStudent {
public static void main(String[] args) {
      try {
         ObjectInputStream read = new ObjectInputStream(new FileInputStream("student.out"));
         Studentt s1 = (Studentt) read.readObject();
         Studentt s2 = (Studentt) read.readObject();
         Studentt s3 = (Studentt) read.readObject();
         
         read.close();
         
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
         
      }
      catch(Exception e) {
      System.out.println("Error");
      }
}
}
