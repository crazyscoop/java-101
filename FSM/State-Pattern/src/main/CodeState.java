public class CodeState implements State {

  private static CodeState instance = new CodeState();

  private CodeState() {
  }

  public static CodeState getInstance() {
    return instance;
  }

  @Override
  public void takeRest(final Developer dev) {
    System.out.println("GOING TO REST");
    dev.setCurrentState(IdleState.getInstance());
  }

  @Override
  public void stateInfo() {
    System.out.println("I AM IN CODE STATE");
  }
}
