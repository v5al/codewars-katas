public class HQ {
    public static String HQ9(char code) {
      if(code == 'H') return "Hello World!";
      else if(code == 'Q') return "Q";
      else if( code == '9'){
      String a= "";
        for(int i =99; i>0 ; i--)
        {
          if(i==2)
          a=a+ Integer.toString(i) + " bottles of beer on the wall, " + Integer.toString(i) + " bottles of beer.\n" + "Take one down and pass it around, " + Integer.toString(i-1) + " bottle of beer on the wall.\n";
          else if(i>1)
          a=a+ Integer.toString(i) + " bottles of beer on the wall, " + Integer.toString(i) + " bottles of beer.\n" + "Take one down and pass it around, " + Integer.toString(i-1) + " bottles of beer on the wall.\n";
          else if(i==1)
          a=a+ Integer.toString(i) + " bottle of beer on the wall, " + Integer.toString(i) + " bottle of beer.\n" + "Take one down and pass it around, no more bottles of beer on the wall.\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.";
        }
        return a;
      }
      else return null;
    }
  }