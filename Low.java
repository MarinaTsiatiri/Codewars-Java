// Sum of two lowest positive integers

import java.util.Arrays;

class Low{
  public static long sumTwoSmallestNumbers(long[] numbers) {
    numbers = Arrays.stream(numbers)
                      .filter(n -> n >= 0)
                      .toArray();  
    Arrays.sort(numbers);
    return numbers[0] + numbers[1];
  }             
}
