// Beginner Series #3 Sum of Numbers
public class Sum{
     public int GetSum(int a, int b){
      if(a==b){return a;}
      int min = Math.min(a,b);
      int max = Math.max(a,b);
      int sums = max - min +1;
      return sums * (min + max)/2;
     }
  }
