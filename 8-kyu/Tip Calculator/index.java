public class TipCalculator {

    public static Integer calculateTip(double amount, String rating) {
      double a = amount;
      rating = rating.toUpperCase();
      switch( rating )
      {
        case "TERRIBLE" : return 0;
        case "POOR" : return (int) Math.ceil(a*0.05);
        case "GOOD" : return (int) Math.ceil(a*0.1);
        case "GREAT" : return (int) Math.ceil(a*0.15);
        case "EXCELLENT" : return (int) Math.ceil(a*0.2);
        default: return null;
      }
    }
  }