// java2 13주차, 애국가 가사의 일부를 레이블의 테스트로 나타내기
// 글자가 오른쪽에서 왼쪽으로 이동하는 것처럼 보이게 하기
// 화면에 20글자씩 나오게 하기
//  애국가 가사가 모두 나오면 스레드 종료(run() 메소드를 종료)
//  애국가 가사의 1~4절을 모두 하나의 문자열로 만듬
// 프레임의 크기, 글자의 크기, sleep 간격을 적당히 조절
package ex13;
import java.awt.*;
import javax.swing.*;

class TextMoving2 implements Runnable {
  private JLabel Label;
  private char dex = 20;
  private String Label2 = "동해물과 백두산이 마르고 닳도록하느님이 보우하사 우리나라 만세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세" +
           "남산 위에 저 소나무 철갑을 두른 듯 바람 서리 불변함은 우리 기상일세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세" +
           "가을 하늘 공활한데 높고 구름 없이 밝은 달은 우리 가슴 일편단심일세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세" +
           "이 기상과 이 맘으로 충성을 다하여 괴로우나 즐거우나 나라 사랑하세 무궁화 삼천리 화려 강산 대한 사람 대한으로 길이 보전하세";
  
  public TextMoving2( JLabel Label ) {
    this.Label = Label;
    }
    @Override
    public void run() {
      int i = 0;
      while(true) {
        Label.setText(Label2.substring(i, dex));
        try {
          Thread.sleep( 700 ); 
        }
        catch( InterruptedException e ) {
          return;
        }
      dex++;
      i++;
    }
  }
}


public class MovingText extends JFrame {
  public MovingText() {
    setTitle( "Runnable을 구현한 애국가 출력 스레드 예제" );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
     
    Container c = getContentPane();
    c.setLayout( new FlowLayout() );
    
    JLabel Label = new JLabel();
    
    Label.setFont( new Font("Gothic", Font.ITALIC, 40) );
    c.add( Label );
    
    setSize( 250, 150 );
    setVisible( true );
    
    Thread th = new Thread( new TextMoving2( Label ) );
    th.start();
  }
  public static void main(String[] args) {
    new MovingText();
  }

}
