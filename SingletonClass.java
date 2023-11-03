class SingletonClass {
  Abc obj = Abc.getInstance();
}

class Abc {
  static Abc obj= new Abc();
 private Abc() {
  }
  public static Abc getInstance() {
    return obj;
  }


}

