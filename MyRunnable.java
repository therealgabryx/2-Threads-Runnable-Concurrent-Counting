class MyRunnable implements Runnable {
  private int seed;
  private String name;
  private boolean reverse;

  public MyRunnable(int seed, String name) {
    this.seed = seed;
    this.name = name;
    this.reverse = false;
  }

  public MyRunnable(int seed, String name, boolean reverse) {
    this.seed = seed;
    this.name = name;
    this.reverse = reverse;
  }

  @Override
  public void run() {
    if (reverse) {
        seed += 15;
        for(int i = 15; i > 0; i--) {
        System.out.println("-- " + name + " " + seed--);
      }
    } else {
      for (int i = 0; i < 15; i++) {
        System.out.println("++ " + name + " " + seed++);
      }
    }
  }
}