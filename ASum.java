// Build a pile of Cubes
public class ASum {
	public static long findNb(long m) {
		long check = 0;
		long output = 1;
    	do {
		check += (long)(Math.pow(output, 3));
      		if (check == m){
        		return output;
      		}
        	output++;
      	} while (check < m);
    return -1;
  } 
}

