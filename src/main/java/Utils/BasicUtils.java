package Utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class BasicUtils {

  public static void main(String[] args) {
    System.out.println(round(1.1245,3));
  }

  public static double round(double value, int places) {
    if (places < 0) {
      places = 0;
    }

    BigDecimal bd = new BigDecimal(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }
}
