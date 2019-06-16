public class RepeatIt {
    public static String repeatString( Object toRepeat,  int n) {
    if( toRepeat instanceof Integer || toRepeat instanceof Boolean ) return "Not a string";
    else if( toRepeat instanceof String){
    String a = "";
      for(int i=0;i<n;i++){
        a=a+toRepeat;
      }
      return a;
      }
    else return "Not a string";
    } 
  }