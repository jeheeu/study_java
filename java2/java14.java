// java2 14주차, 스레드와 멀티태스킹
// 1초 간격으로 두 단어의 배경색을 바꾸기
package ex13;
import java.awt.*;

import javax.swing.*;

 

class FlickeringLabel1 extends JLabel implements Runnable {

    private long delay; 
    public FlickeringLabel1(String text, long delay) {

        super(text); // JLabel 생성자 호출
        this.delay = delay;
        setOpaque(true); // 배경색 변경이 가능하도록 설정
 
        Thread th = new Thread(this);
   
        th.start();  
    }
    

    @Override
    public void run() {
        int n=0;
        
        while(true) {

            if(n == 0)
                setBackground(Color.GREEN);
            else
                setBackground(Color.YELLOW);

            if(n == 0) n = 1;
            else n = 0;
            try {
                Thread.sleep(delay); // delay 밀리초 동안 잠을 잔다.
            }
            catch(InterruptedException e) {
                return;

            }
        }
    }
}
class FlickeringLabel2 extends JLabel
implements Runnable {
private long delay; 
public FlickeringLabel2(String text, long delay) {
   super(text);
   this.delay = delay;
   setOpaque(true);
   Thread th = new Thread(this);
   th.start();
}
@Override
public void run() {
   int n=0;
   while(true) {
      if(n == 0)
         setBackground(Color.YELLOW);
      else
         setBackground(Color.GREEN);
      if(n == 0) n = 1;
      else n = 0;
      try {
         Thread.sleep(delay); 
      }
      catch(InterruptedException e) {
         return;
      }
   }
}
}


public class FlickeringLabelEx2 extends JFrame {

    public FlickeringLabelEx2() {

        setTitle("FlickeringLabelEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

 

        // 깜박이는 레이블 생성
        FlickeringLabel1 fLabel = new FlickeringLabel1("건국대학교", 1000); // 500밀리초 주기로 배경색 변경
        
        
        // 깜박이는 레이블 생성 
        FlickeringLabel2 fLabel2 = new FlickeringLabel2("소프트웨어전공", 1000); // 300밀리초 주기로 배경색 변경
 

        c.add(fLabel);

        c.add(fLabel2);
        

        setSize(300,150);

        setVisible(true);

    }

 

    public static void main(String[] args) {

        new FlickeringLabelEx2();

    }

}
