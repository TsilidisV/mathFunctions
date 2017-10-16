
/**
 * various mathematical functions
 * 
 * @blueRose
 */


public class mathFunctions
{

   public static long factorial(int a)
   {
      long c;
      c=1;
      if (a==0)
         return c;
      else
         for (int i = 1; i<=a; i++)
            c=c*i; 
         return c;
   }
 
   public static long comb(int a, int b)
   {
       int c;
       c=a-b;
      if (a<b)
         return 0;
      else if (a==b)
         return 1;
      else 
        return factorial(a)/(factorial(b)*factorial(c)) ;
 
   }
   
   public static long combRep(int a, int b)
   {
       if (a<b)
         return 0;
      else 
        return factorial(a+b-1)/(factorial(b)*factorial(a-1)) ;
   }
}