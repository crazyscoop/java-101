package FSM.StatePattern;

public interface State {

  default void doWork(Developer dev) {
    System.out.println("I AM WORKING");
  }

  default void takeRest(Developer dev) {
    System.out.println("I AM RESTING");
  }


  void stateInfo();
}
