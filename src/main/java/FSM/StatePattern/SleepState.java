package FSM.StatePattern;

public class SleepState implements State {

  private static SleepState instance = new SleepState();

  private SleepState() {
  }

  public static SleepState getInstance() {
    return instance;
  }

  @Override
  public void doWork(final Developer dev) {
    System.out.println("GOING TO WORK");
    dev.setCurrentState(CodeState.getInstance());
  }

  @Override
  public void stateInfo() {
    System.out.println("I AM IN SLEEP STATE");
  }
}
