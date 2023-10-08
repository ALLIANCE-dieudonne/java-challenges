public class HoMuchIsTrue {

  public static int countTrue(boolean[] array ){

    int count = 0;
    for (boolean value: array){

      if(value){
        count ++;
      }
    }

    return count;

  }

  public static void main(String[] args) {

    boolean[] array1 ={true, false, true};
    boolean[] array2 = {};

    System.out.println(countTrue(array1));
    System.out.println(countTrue(array2));

  }



}
