import java.time.DayOfWeek;

public class EnumTest {
  public static void main(String[] args) {
    for(Planet d : Planet.values()){
      System.out.println(d);
    }
  }
}
