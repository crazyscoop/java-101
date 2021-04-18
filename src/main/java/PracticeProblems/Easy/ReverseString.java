package PracticeProblems.Easy;

public class ReverseString {

  public static void main(String... args) {

    System.out.println(reverse("abcde".toCharArray(), 0));
  }

  private static String reverse(char[] name, int index) {

    if (index < name.length/2) {
      swapAtIndex(name, index);
      return reverse(name, ++index);
    }
    return new String(name);
  }

  private static void swapAtIndex(char[] array, int index) {
    char temp = array[index];
    array[index] = array[array.length - index - 1];
    array[array.length - index - 1] = temp;
  }
}
