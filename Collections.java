
import java.util.ArrayList;
import java.util.Collection;

public class Collections {

  public static void main(String[] args) {
    Collection value = new ArrayList();
    value.add(12);
    value.add(14);

    for (Object object : value){
      int n = (Integer) object;
      System.out.println(n);
    }

  }
}

