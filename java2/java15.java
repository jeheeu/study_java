// java2 15주차, wait(), notify()를 이용해 바 채우기
// barSize의 값을 나타내기
// 아무키나 눌러 바를 채우는 코드이다.
package ex13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
  private int barSize = 0;
  private int maxBarSize;
  
  public MyLabel(int maxBarSize) {
    this.maxBarSize = maxBarSize;
  }
  
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    String s = String.valueOf(barSize);
    g.setColor(Color.GRAY);
    g.setColor(Color.MAGENTA);
    int width = (int) (((double)(getWidth()))/maxBarSize*barSize);
    if (width == 0) return;
    g.fillRect(0, 0, width, this.getHeight());
    g.drawString(s, 270, 20);
  }
  
  synchronized void fill() {
    System.out.println(barSize);
    if (barSize == maxBarSize) { 
      try {
        wait(); } 
      catch (InterruptedException e) {
        return;
      }
    }
    barSize++;
    repaint();
    notify();
  }
  
  synchronized void consume() {
    if (barSize == 0) {
      try {
        wait();
      } catch (InterruptedException e) {
        return;
      }
    }
    barSize--;
    repaint();
    notify();
  }
}

class ComsumerThread extends Thread {
  private MyLabel bar;
  
  public ComsumerThread(MyLabel bar) {this.bar = bar; }
  
  @Override
  public void run() {
    while(true) {
      try {
        sleep(100);
        bar.consume();
      } catch (InterruptedException e) {
        return;
      }
    }
  }
}

public class TabAndThreadEx extends JFrame {
  private MyLabel bar = new MyLabel(100);
  
  
  public TabAndThreadEx(String title) {
    super(title);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(null);
    bar.setBackground(Color.orange);
    bar.setOpaque(true);
    bar.setLocation(20, 50);
    bar.setSize(300, 20);
    c.add(bar);
    c.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        bar.fill();
      }
  });
  
    setSize(350, 200);
    setVisible(true);
    
    c.setFocusable(true);
    c.requestFocus();
    ComsumerThread th = new ComsumerThread(bar);
    th.start();
  }
  
  public static void main(String[] args) {
    new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");
  }
}
