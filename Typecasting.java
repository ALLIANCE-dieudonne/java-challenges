class Animal {

  double d = 23.5;
  int n = (int) d;

  void makeSound() {
    System.out.println("Some sound!");
  }

}

class Dog extends Animal {
  void makeSound() {
    System.out.println("barks!");
  }

}


public class Typecasting {
  public static void main(String[] args) {
    Animal dog = new Dog();//upcasting casting
    dog.makeSound();

    Dog myActualDog = (Dog) dog;//down-casting upcasting
    dog.makeSound();
  }
}
