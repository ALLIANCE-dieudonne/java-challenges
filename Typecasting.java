class Animal {
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
    Animal dog = new Dog();//down casting
    dog.makeSound();

    Dog myActualDog = (Dog) dog;//upcasting
    dog.makeSound();
  }
}
