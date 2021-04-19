package NestedClasses.MemberInnerClass;

/**
 * Outer Class.
 */
public class OuterClass {

  /**
   * Member Variable private and can not be accessed from the Outer Class.
   */
  private int memberVar = 10;

  /**
   * Member Inner Class.
   */
  public class InnerClass {

    /**
     * Inner Class can access all members (even private) of the Outer Class.
     *
     * @return: int.
     */
    public int getMemberVar() {
      System.out.println("Inside Inner Class");
      return memberVar;
    }
  }
}
