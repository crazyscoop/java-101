package NestedClasses.AnonymousInnerClass;

public class TestClass {

  public static void main(String[] args) {

    /**
     * Traditionally some other class would extend SomeAbstractClass
     * along with implementation of the abstract method,
     * and we would instantiate object of that extended Class,
     * but here we are bypassing that and creating an anonymous class,
     * along with the implementation of the abstract method.
     */
    SomeAbstractClass someAbstractClass = new SomeAbstractClass() {
      @Override
      public void doSomething() {
        System.out.println("Doing something in Some Abstract Class.");
      }
    };

    /**
     * Traditionally some class would implement this Interface
     * along with the implementation of the abstract method,
     * and we would instantiate object of that Class,
     * but instead here we are bypassing that and creating an anonymous class,
     * along with the implementation of the abstract method.
     */
    SomeInterface someInterface = new SomeInterface() {
      @Override
      public void doSomething() {
        System.out.println("Doing something in Some Interface.");
      }
    };

    someAbstractClass.doSomething();
    someInterface.doSomething();
  }
}
