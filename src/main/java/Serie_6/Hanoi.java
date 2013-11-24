package Serie_6;

import java.util.HashSet;
import java.util.Set;

public class Hanoi {
  public static String A = "A";
  public static String B = "B";
  public static String C = "C";

  public Hanoi() {
  }

  /**
   * @param n
   *          Anzahl Scheiben
   * @return Lösung als String der Art "AB - BC - .. - AC"
   */
  public static String solveHanoi(int n, String startBar, String endBar) {
    if (n < 1) {
      return "";
    }
    return solveHanoi(n - 1, startBar, getMittleBar(startBar, endBar)) + " " + startBar + endBar + " " + solveHanoi(n - 1, getMittleBar(startBar, endBar), endBar);
  }
  
  

  private static String getMittleBar(String startBar, String endBar) {
    Set<String> bars = new HashSet<String>();
    bars.add(startBar);
    bars.add(endBar);
    if (!bars.contains(A)){
      return A;
    } else if (!bars.contains(B)){
      return B;
    } else {
      return C;
    }
  }

}
