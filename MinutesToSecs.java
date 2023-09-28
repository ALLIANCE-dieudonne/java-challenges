public class MinutesToSecs {

  public static int ConvertToSecs(int min) {
    return min * 60;
  }

  public static void main(String[] args) {

    int res = ConvertToSecs(5);
    System.out.println(res);

  }
}
