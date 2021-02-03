public class Developer {

  private State currentState;

  private int id;

  public Developer(int id) {
    this.id = id;
    this.currentState = IdleState.getInstance();
  }

  public void setCurrentState(final State currentState) {
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
