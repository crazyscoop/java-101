package LamdaExpressions;

import java.util.List;

public class TestClass {

  public static void main(String[] args) {

    Person p1 = new Person(Person.Sex.MALE, 20, "P1");
    Person p2 = new Person(Person.Sex.FEMALE, 25, "P2");
    Person p3 = new Person(Person.Sex.MALE, 10, "P3");
    Person p4 = new Person(Person.Sex.FEMALE, 21, "P4");

    List<Person> personList = List.of(p1, p2, p3, p4);

    /**
     * Using Anonymous Inner Class as Argument.
     */
    CheckPerson checkPersonAnon = new CheckPerson() {
      @Override
      public boolean test(final Person p) {
        return p.getSex().equals(Person.Sex.FEMALE);
      }
    };
    printPerson(personList, checkPersonAnon);

    /**
     * Instantiating Interface using Lambda Expression
     * and using it as Argument.
     */
    CheckPerson checkPersonLambda = (Person p) ->
          p.getSex().equals(Person.Sex.FEMALE) && p.getAge() > 18 && p.getAge() < 30;
    printPerson(personList, checkPersonLambda);

    /**
     * Using Lambda Expression.
     */
    printPerson(personList,
                (Person p) ->
                      p.getSex().equals(Person.Sex.MALE) && p.getAge() > 18 && p.getAge() < 25);
  }

  private static void printPerson(List<Person> personList, CheckPerson tester) {
    System.out.println("Printing Persons.....");
    for(Person p : personList) {
      if (tester.test(p)) {
        System.out.println(p);
      }
    }
    System.out.println();
  }
}
