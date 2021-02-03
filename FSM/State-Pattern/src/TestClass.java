import java.util.Arrays;

public class TestClass {

  public static void main(String... args) {
    Developer dev = new Developer(1);

    boolean cont = true;

    int[] action = {1, 0, 0, 0, 1, 1, 1, 1};

    Arrays.stream(action)
          .forEach(i -> {
            if (i == 1) {
              dev.doWork();
            }
            else {
              dev.takeRest();
            }
          });
  }
}
