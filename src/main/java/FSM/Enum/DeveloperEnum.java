package FSM.Enum;

public enum DeveloperEnum {

  IDLE ("IDLE") {
    @Override
    void doWork(Developer dev) {
      System.out.println("GOING TO WORK");
      dev.setCurrentState(CODE);
    }

    @Override
    void takeRest(Developer dev) {
      System.out.println("TAKING REST");
      dev.setCurrentState(SLEEP);
    }

    @Override
    void stateInfo() {
      System.out.println("I AM IN " + this.getState());
    }
  },


  CODE ("CODE") {
    @Override
    void doWork(Developer dev) {
      System.out.println("I AM WORKING");
    }

    @Override
    void takeRest(Developer dev) {
      System.out.println("TAKING REST");
      dev.setCurrentState(IDLE);
    }

    @Override
    void stateInfo() {
      System.out.println("I AM IN " + this.getState());
    }
  },


  SLEEP ("SLEEP") {

    @Override
    void doWork(Developer dev) {
      System.out.println("GOING TO WORK");
      dev.setCurrentState(CODE);
    }

    @Override
    void takeRest(Developer dev) {
      System.out.println("I AM RESTING");
    }

    @Override
    void stateInfo() {
      System.out.println("I AM IN " + this.getState());
    }
  };

  private String state;

  DeveloperEnum(final String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  abstract void doWork(final Developer dev);

  abstract void takeRest(final Developer dev);

  abstract void stateInfo();
}
