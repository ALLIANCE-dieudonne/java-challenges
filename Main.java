public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(12);
    person.setName("fils");

    System.out.println("The name is " + person.getName());
    System.out.println("The age is "+ person.getAge());
  }
}
