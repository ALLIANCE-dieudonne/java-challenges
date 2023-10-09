import java.util.ArrayList;

public class ArrayOfMultipliers {

  public static ArrayList<Integer> findMultipliersEqualsToSecond(int num, int length)
  {
    ArrayList<Integer> multipliers = new ArrayList<>();


    for(int i= 1; i<= length; i++){
      multipliers.add(num*i);

  }
    return multipliers;
  }

  public static void main(String[] args) {
    System.out.println(findMultipliersEqualsToSecond(12, 2));
  }
}
