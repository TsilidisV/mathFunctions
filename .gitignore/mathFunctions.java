
/**
 * various mathematical functions
 * 
 * @blueRose
 */


public class mathFunctions
{

  public static int factorial(int a)
  {
     int c;
     if (a==0)
         return 0;
     else 
         c=1;
         for (int i = 1; i<=a; i=i+1)
         c=c*i; 
         return c;
  }
 
  public static int combinations(int a, int b)
  {
     if (a<b)
         return 0;
     else if (a==b)
         return 1;
     else 
        return factorial(a)/(factorial(b)*factorial(a-b)) ;
 
  }

}
