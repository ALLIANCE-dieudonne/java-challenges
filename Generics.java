import java.util.*;

class Generics<T> {
  private T content;

  public void setContent(T content) {
    this.content = content;
  }

  public T getContent() {
    return content;
  }
}

class Box {
  public static void main(String[] args) {
    Generics<Integer> box1 = new Generics<>();
    box1.setContent(12);

    Generics<String> box2 = new Generics<>();
    box2.setContent("hello");


    List<String> list = new ArrayList<>();
    list.add("fils");
    list.add("alli");

    list.add(1, "dieudonne");
    list.set(3, "kaka");
    list.remove(1);

    Iterator<String>  iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

    Set<String> set = new HashSet<>();
    set.add("fils");
    set.add("fils");

  }

  public static <T> void anyThing(T value) {
    return;
  }


}

