import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedMain {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {

      String content;
      while ((content = bufferedReader.readLine()) != null) {
        System.out.println(content);
      }

      String date = "12/4/25";


    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
