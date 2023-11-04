public class EqualsInStringVsStringBuilder {

  static  String str1 = new String("Hi");
  static String str2 = new String("Hi");

  static StringBuilder strb1 = new StringBuilder("Hi");
  static StringBuilder strb2 = new StringBuilder("Hi");

  public static void main(String[] args) {
    //this returns true
    System.out.println(str1.equals(str2));

    //this returns false because the equals method is not overriden
    System.out.println(strb1.equals(strb2));
  }
}
