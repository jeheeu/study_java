// java1 5주차, 원의 중첩 판정 
package ex13;
import java.util.Scanner;

public class Ex05_3 {

   public static void main (String[] args) {
    
      Scanner sc = new Scanner(System.in);
      
      int x1, y1;
      int x2, y2;
      double r1, r2, distance;
      
      System.out.print("Enter x1, y1 and r1 : ");
      x1 = sc.nextInt();
      y1 = sc.nextInt();
      r1 = sc.nextDouble();
      System.out.print("Enter x2, y2 and r2 : ");
      x2 = sc.nextInt();
      y2 = sc.nextInt();
      r2 = sc.nextDouble();
      
      distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
      
      if(distance <= r1+r2) {
         System.out.print("--> overlapped");
      }
      else {
         System.out.print("--> not overlapped");
      }
      
      sc.close();
   }

}

