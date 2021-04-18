package FSM.StatePattern;

public class IdleState implements State {

  private static IdleState instance = new IdleState();

  private IdleState() {
  }

  public static IdleState getInstance() {
    return instance;
  }

  @Override
  public void doWork(final Developer dev) {
    System.out.println("GOING TO WORK");
    dev.setCurrentState(CodeState.getInstance());
  }

  @Override
  public void takeRest(final Developer dev) {
    System.out.println("TAKING REST");
    dev.setCurrentState(SleepState.getInstance());
  }

  @Override
  public void stateInfo() {
    System.out.println("I AM IN IDLE STATE");
  }
}
