class Student {

  String name;
  int age;

  public Student(String name, int age) {
    this.name = "Fils";
    this.age = 12;
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}





public class Arrays {

  public static void main(String[] args) {

    int[] anArray = new int[10];

    anArray[0] = 100;
    anArray[1] = 150;
    anArray[2] = 170;

    for (int n : anArray) {
//      System.out.println(n);
    }

    int[] array2 = {1, 3, 3, 4};

    System.out.println(array2[2]);

    String[][] names ={
      {"fils", "rem"}, {"keza", "manzi"}
    };

    for (int i = 0; i < names.length; ++i){

      for (int j = 0; j < names[i].length; ++j){
        System.out.println(names[i][j]);

      }
      System.out.println("\n");
    }


//    System.out.println(names[0][0]);

    int[][] nums = {

      {1,3},{4,5}
    };

    System.out.println(nums[1][0]);






  }
}
