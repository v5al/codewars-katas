public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
      name = name.toUpperCase();
      String[] sp = name.split(" ");
      char a = sp[0].charAt(0);
      char b = sp[1].charAt(0);
      
      return a+"."+b;
    }
  }