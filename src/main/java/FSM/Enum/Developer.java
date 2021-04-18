package FSM.Enum;

public class Developer  {

  private DeveloperEnum currentState;

  public Developer() {
    this.currentState = DeveloperEnum.IDLE;
  }

  public void setCurrentState(final DeveloperEnum currentState) {
    this.currentState = currentState;
  }

  public void doWork() {
    currentState.stateInfo();
    currentState.doWork(this);
    System.out.println();
  }

  public void takeRest() {
    currentState.stateInfo();
    currentState.takeRest(this);
    System.out.println();
  }
}
