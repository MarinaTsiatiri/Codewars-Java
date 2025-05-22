// Bit Counting
public class BitCounting {

	public static int countBits(int n){
		String makeBinary = Integer.toBinaryString(n);
    int numOfOne = 0;
    for (int i = 0; i<makeBinary.length(); i++){
      if (makeBinary.charAt(i) == '1'){numOfOne++;}
    }
    return numOfOne;
	}
}
