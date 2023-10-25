package superKeyword;

 class Vehicle {
  public int maxSpeed = 120;
}


 class Car extends Vehicle{
  public int maxSpeed = 100;

  public void display(){
    System.out.println(super.maxSpeed);
  }

}


