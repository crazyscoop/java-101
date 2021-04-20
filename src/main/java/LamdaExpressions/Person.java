package LamdaExpressions;

public class Person {

  public enum Sex {
    MALE,FEMALE;
  }

  private Sex sex;

  private int age;

  private String name;

  public Person(final Sex sex, final int age, final String name) {
    this.sex = sex;
    this.age = age;
    this.name = name;
  }

  public Sex getSex() {
    return sex;
  }

  public void setSex(final Sex sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(final int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }


  @Override
  public String toString() {
    return "Person{"
          + "sex=" + sex
          + ", age=" + age
          + ", name='" + name + '\''
          + '}';
  }
}
