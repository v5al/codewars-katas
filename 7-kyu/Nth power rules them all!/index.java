public class Kata {
    public static int modifiedSum(int[] array, int power) {
    int sum=0;
    int sum1=0;
    int res;
      for(int i=0; i<array.length;i++)
      {
        sum1 = sum1 + array[i];
        sum = sum + (int) Math.pow(array[i],power);
      }
    res = sum - sum1;
    return res;
    }
  }