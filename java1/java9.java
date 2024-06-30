// java1 9주차, 성적분석 모의실험
import java.util.Random;



public class Ex09_2 {

   public static void main(String[] args) {

      int n = 0;



      Random r = new Random();

      int[] a = new int[50];



      System.out.printf("score[] : ");

      for (int i = 0; i <a.length; i++) {

         n = r.nextInt(101);

         

         a[i] = n;

         System.out.printf("%d ", n);

      }

      System.out.print("\n");



      int[] rank = new int[11];

      int sum = 0;

      double avg = 0;

      

      for(int num : a) {

         sum += num;

         rank[num/10]++;

      }

      

      avg = sum / array.length;

      System.out.println("Average : " + avg);



      String[] title = {"09-00","19-10","29-20","39-30","49-40","59-50","69-60","79-70","89-80","99-90","  100"};

      for(int i=rank.length-1; i>=0;i--) {

         System.out.printf("%s: %d ",title[i], rank[i]);

         for(int j=0; j<rank[i];j++) System.out.print("*");

         System.out.println();

      }

   }

}

