// java2 10주차, 파일입출력 
// FileReader 클래스를 이용하여 작성을 하는 프로그램을 작성
// konkuk.txt 파일의 내용을 읽는 다.
// 각 알파벳 문자를 시저 암호화(+3)하여 화면에 출력한다. 숫자와 특수문자는 그대로 출력
import java.util.*;
import java.io.*;
public class Ex10_6 {
   public static void main(String[] args) throws IOException {
      char ch;
      int num;
      try {
         FileReader reader = new FileReader(new File("konkuk.txt"));
         while((num = reader.read()) != -1) {
            if(num >= 65 && num <= 86 || num >= 97 && num <= 119) {
               num =(char)(num + 3);
            }
            
            else if (num == 87) num = 65;
            else if (num == 88) num = 66;
            else if (num == 89) num = 67;
            else if (num == 120) num = 97;
            else if (num == 121) num = 98;
            else if (num == 122) num = 99;
            
            System.out.print((char)num);
         }
         reader.close();
      }
      catch(FileNotFoundException e) {
         System.err.println("cannot open");
         System.exit(1);
      }
   }
}
