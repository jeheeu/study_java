// java1 6주차, 최대값, 최소값, 평균, 분산, 표준편차 구하는 코드
package ex13;



public class Ex06_1 {



        public static void main(String[] args)

        {

                int[] x ={87,68,94,100,83,78,85,91,76,87,55,60,99,63,80};

                int max=x[0], min=x[0],sum=0;

                for(int i=0; i<x.length; i++)

                {

                        if(x[i] > max)max=x[i];

                        if(x[i] < min)min=x[i];

                        sum += x[i];

                }

                System.out.println("max = " + max);

                System.out.println("min = " + min);

                double m = (double)sum / x.length;

                double v = 0.0;

                for(int i=0; i<x.length; i++)

                        v += Math.pow(x[i] - m, 2);

                        v/=x.length;

                double s = Math.sqrt(v);

                System.out.printf("m = %.2f\n", m);

                System.out.printf("v = %.2f\n", v);

                System.out.printf("s = %.2f\n", s);

        }

}

