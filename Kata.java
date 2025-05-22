// Build Tower
public class Kata {
  
  public static String[] towerBuilder(int nFloors) {
    String spaces;
    String[] Pyramid = new String[nFloors];
    
    for (int i = 0; i<nFloors; i++) {
      spaces = " ".repeat(nFloors-i-1);
      Pyramid[i] = spaces + "*".repeat(2*i+1) + spaces;
    }
  return Pyramid;
  }
}
