package LamdaExpressions;

import java.util.List;

public class TestClass {

  public static void main(String[] args) {

    Person p1 = new Person(Person.Sex.MALE, 20, "P1");
    Person p2 = new Person(Person.Sex.FEMALE, 25, "P2");
    Person p3 = new Person(Person.Sex.MALE, 10, "P3");

    List<Person> personList = List.of(p1, p2, p3);

    printPerson(personList,
                (Person p) ->
                      p.getSex().equals(Person.Sex.MALE) && p.getAge() > 18 && p.getAge() < 25);
  }

  private static void printPerson(List<Person> personList, CheckPerson tester) {
    for(Person p : personList) {
      if (tester.test(p)) {
        System.out.println(p);
      }
    }
  }
}
