import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  //given an array of integers return indices of two numbers such that they add to a specific target
  //you may assume that each input would have exactly one solution, and you may not use the same element twice

  public static void main(String[] args) {
    int[] numbers = new int[]{1, 2, 3, 5, 6, 7};
    int target = 10;
    int[] result = getTwoSum(numbers, target);
    System.out.println("[" +result[0] + "," + result[1] + "]");
  }

  public static int[] getTwoSum(int[] numbers, int target) {
    Map<Integer, Integer> visitedNumbers = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
      int delta = target - numbers[i];

      if (visitedNumbers.containsKey(delta)) {
        return new int[]{i, visitedNumbers.get(delta)};
      }
      visitedNumbers.put(numbers[i], i);
    }
    return new int[]{-1, -1};

  }


}
