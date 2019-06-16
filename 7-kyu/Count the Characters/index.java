public class CC {
    public static int charCount(String str, char c) {
      int b=0;
      String str1 = str.toUpperCase();
      String str2 = str.toLowerCase();
      for(int i=0;i<str.length();i++)
      {
        if(str1.charAt(i) == c || str2.charAt(i) == c ) b++;
      }
      return b;
    }
  }