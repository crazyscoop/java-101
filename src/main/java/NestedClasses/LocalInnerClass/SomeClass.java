package NestedClasses.LocalInnerClass;

/**
 * Some Outer Class.
 */
public class SomeClass {

  /**
   * Outer Class Member Variable.
   */
  private int someMemberVar = 10;

  /**
   * Outer Class Class Variable.
   */
  private static int someClassVar = 100;


  public void doSomething() {

    int someLocalVar = 40;


    /**
     * Local Inner Class.
     */
    class LocalInnerClass {

      /**
       * Shadowing Outer Class Member Variable.
       */
      private int someMemberVar = 30;

      /**
       * Inner Class Member Variable.
       */
      private  int someInnerMemberVar = 20;

      /**
       * NOTE:
       * 1. Shadowed Field can be accessed by OuterClass.this.variableName .
       * 2. Only Effectively Final Local Variables can be accessed inside Inner Class.
       *    i.e local var that are either
       *    a. declared final
       *    b. if their value remains same throughout method.
       */
      public void doSomething() {
        System.out.println("someInnerMemberVar: " + someInnerMemberVar);
        System.out.println("someLocalVar: " + someLocalVar);
        System.out.println("someMemberVar: " + someMemberVar);
        System.out.println("this.someMemberVar: " + this.someMemberVar);
        System.out.println("SomeClass.this.someMemberVar: " + SomeClass.this.someMemberVar);
      }
    }

    LocalInnerClass localInnerClass = new LocalInnerClass();
    localInnerClass.doSomething();
  }

  /**
   * Outer Class Class Method.
   */
  public static void doSomethingStatic() {
    /**
     * Local Inner Class
     */
    class LocalInnerClass {

      /**
       * Local Inner Class Inside A Static Method,
       * Can Access Only Static Members of Outer Class.
       */
      public void doSomething() {
        System.out.println("someClassVar: " + someClassVar);
      }
    }

    LocalInnerClass localInnerClass = new LocalInnerClass();
    localInnerClass.doSomething();
  }
}
