public class IncrementDecrement {

  public static void main(String[] args) {
    int i = 0;
    int j = i;
    j = i++ +j;
    System.out.println(i + "-" + j);

    /*
    options
      0 - 0
      1 - 0
      0 - 1
      1 - 1
    */

  }
}
