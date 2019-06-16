public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears( int humanYears) {
      int[] a = new int[3];
      int b = humanYears;
      a[0]=humanYears;
      a[1]=0 ;
      a[2] =0;
        for(int i=0;i<b-2;i++){
        a[1]=a[1]+4;
        a[2]=a[2]+5;
        humanYears--;
      }
        if(humanYears == 2) {
        a[1] =a[1] + 9;
        a[2] =a[2] + 9;
        humanYears--;
      }
        if(humanYears == 1) {
        a[1] =a[1] + 15;
        a[2] =a[2] + 15;
      }
      return a;
    }
  }