public class StringReverse {
  public static void main(String[] args) {
    String str = "HelloWorld!";
    System.out.println(reverseStringWithStringBuilder(str));
    System.out.println(reverseManually("ALLIANCE FILS DIOS"));
  }

  //using string builder
  public static String reverseStringWithStringBuilder(String str) {
    return new StringBuilder(str).reverse().toString();
  }

  //reversing manually by appending to string builder
  public static String reverseManually(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      sb.append(str.charAt(i));
    }

    return sb.toString();
  }

  //first algorithm
  public static String reverseWithoutStringBuilder(String string) {
    char[] chars = string.toCharArray();

    for (int i = 0; i <= string.length() / 2; i++) {
      char temp = chars[i];
      chars[i] = chars[string.length() - i - 1];
      chars[string.length() - i - 1] = temp;

    }

    return new String(chars);
  }

  //second algorithm
  //this is inefficient bcz many instances of string will be created
  public static String reverseString(String str){
    char[] string = str.toCharArray();
    String result = "";
    for( int i = string.length -1; i >= 0; i -= 1){
      result += string[i];
    }
    return result;

  }
}
