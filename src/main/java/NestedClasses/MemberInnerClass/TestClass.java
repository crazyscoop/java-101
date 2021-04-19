package NestedClasses.MemberInnerClass;

public class TestClass {

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    System.out.println(innerClass.getMemberVar());
  }
}
