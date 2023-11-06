public class ChainedException {


    public static void main(String[] args) {
      try {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
      } catch (Exception e) {
        throw new CustomException("An error occurred while performing the operation.", e);
      }
    }

    public static int divide(int num1, int num2) {
      try {
        return num1 / num2;
      } catch (ArithmeticException e) {
        throw new ArithmeticException("Division by zero is not allowed.");
      }
    }

    static class CustomException extends RuntimeException {
      public CustomException(String message, Throwable cause) {
        super(message, cause);
      }
    }
  }


