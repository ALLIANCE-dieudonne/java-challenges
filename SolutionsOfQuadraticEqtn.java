public class SolutionsOfQuadraticEqtn {

  public static int NumberOfSolutions(int a, int b, int c) {

    int delta = b * b - 4 * a * c;

    if (delta == 0) {
      return 1;
    } else if (delta > 0) {
      return 2;
    } else {
      return 0;
    }

  }

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = 1;

    System.out.println(NumberOfSolutions(a,b,c));

  }
}
