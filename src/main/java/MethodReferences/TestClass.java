package MethodReferences;

import LamdaExpressions.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestClass {

  public static void main(String[] args) {
    Person p1 = new Person(Person.Sex.MALE, 20, "P1");
    Person p2 = new Person(Person.Sex.FEMALE, 25, "P2");
    Person p3 = new Person(Person.Sex.MALE, 10, "P3");
    Person p4 = new Person(Person.Sex.FEMALE, 21, "P4");

    List<Person> personList = new ArrayList<>();
    personList.addAll(List.of(p1, p2, p3, p4));

    /**
     * Sorting Using Anonymous Class.
     */
    Collections.sort(personList, new Comparator<Person>() {
      @Override
      public int compare(final Person person, final Person t1) {
        return person.getAge() >= t1.getAge() ? 1 : -1 ;
      }
    });
    System.out.println(personList);

    /**
     * Sorting Using Lambda Expression.
     */
    Collections.sort(personList, (person1, person2) -> person2.comparedTo(person1));
    System.out.println(personList);

    /**
     * Sorting Using Method Reference.
     */
    Collections.sort(personList, Person::comparedTo);
    System.out.println(personList);
  }
}
