 class TriangularNumber {

  public static int calculateDots(int n) {
    return n * (n + 1) / 2;
  }

  public static void main(String[] args) {
    int triangleNumber = 5;
    int dots = calculateDots(triangleNumber);
    System.out.println("The number of dots for triangle number " + triangleNumber + " is: " + dots);
  }
}
