public class Kata{
    public static String bonusTime(final int salary, boolean bonus) {
    int sal = salary*10;
      if(bonus == true) return "\u00A3"+sal;
      else return "\u00A3"+Integer.toString(salary);
    }
  }