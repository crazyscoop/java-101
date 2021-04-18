package FSM.Enum;

import java.util.Arrays;

public class TestClass {

  public static void main(String... args) {
    Developer dev = new Developer();

    int[] array = {1, 0, 0, 0, 1, 1, 1, 1};

    Arrays.stream(array)
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
