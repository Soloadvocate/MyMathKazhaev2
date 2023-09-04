package org.example;

public class MyMath {

        public static final double PI = 3.1415926535;
        public static final double E = 2.7182818284;
        public static double Min(double a, double b)
        {
            if(a>b)
            {
                return b;
            }
            else if (a==b)
            {
                System.out.println("Числа равны");
                return a;
            }
            else
            {
                return a;
            }
        }
        public static double arcSin(double x)
        {
            double result = x;
            double term = x;
            double sign =1.0;
            for(int i = 1; i < 100; i += 2)
            {
                term+=(x*x)/((i+1)*(i+2));
                sign = -sign;
                result+=sign*term;
            }
            System.out.println(result);
            return result;
        }
        public static double arcCos(double x)
        {
            double asinResult= arcSin(x);
            double result = PI/2-asinResult;
            System.out.println(result);
            return result;
        }
    public static double arcTan(double x)
    {
        double result = 0;
        double term = x;
        double sign =1.0;
        for(int i = 1; i < 100; i++)
        {
            result +=sign*term/i;
            term +=-x*x;
            sign = -sign;
        }
        System.out.println(result);
        return result;
    }
    public static double pow(double x, double y)
    {
        double answer = x;
        for(int i = 1;i<y;i++)
        {
            answer = answer*x;
        }
        return answer;
    }
    public static double sCircle(double radius)
    {
        double answer = PI*pow(radius,2);
        System.out.println(answer);
        return answer;
    }
    public static double pCircle(double radius)
    {
        double answer = PI*radius*2;
        System.out.println(answer);
        return answer;
    }
}
