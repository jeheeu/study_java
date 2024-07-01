// java2 11주차,JDK의 문자 스트림 클래스 계층 구조를 알기
// FileInputStream과 FileOutputStream 클래스를 사용하여 파일을 복사하는 프로그램을 작성
// 원본 파일로부터 1 byte씩 읽어서, 복사본 파일에 저장
import java.io.*;

public class FileCopy {
  public static void main(String[] args) {
    InputStreamReader in = null;
    FileInputStream fin = null;
    FileInputStream fos = null;
    try {
      fin = new FileInputStream("c:\\Temp\\hangul.txt");
      fos = new FileWriter("c:\\Temp\\h.txt");
      in = new InputStreamReader(fos, "MS949"); 
      int c;
      System.out.println( "인코딩 문자 집합은 " + in.getEncoding() );
    while ( (c = in.read()) != -1 ) {
      System.out.print( (char) c );
    }
    in.close();
    fin.close();
    fos.close();
    } catch (IOException e) {
      System.out.println("입출력 오류");
    }
  }
}
