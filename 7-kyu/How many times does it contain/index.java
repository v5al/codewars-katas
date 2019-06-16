class StringCounter {
    public static int stringCounter(String inputS, char charS){
    int b=0;
      for(int i=0;i<inputS.length();i++)
      {
        if(inputS.charAt(i) == charS) b++;
      }
      return b;
    }
  }