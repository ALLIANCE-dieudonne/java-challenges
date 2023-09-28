public class SecondStringMachesStringEnding {

  public static boolean maches(String str) {

    char secChar = str.charAt(1);
    char lastChar = str.charAt(str.length() - 1);

    return secChar == lastChar;

  }

  public static void main(String[] args){
    boolean res = maches("ambassador");
    System.out.println(res);
  }

}
