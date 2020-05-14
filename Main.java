import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random rnd = new Random();
    
    int rand_seed1;
    int rand_seed2;
    
    do {
    rand_seed1 = rnd.nextInt(50);
    rand_seed2 = rnd.nextInt(50);
    } while (rand_seed1 == rand_seed2);
    
    Thread thread1 = new Thread(new MyRunnable(rand_seed1, "T#1", false));
    Thread thread2 = new Thread(new MyRunnable(rand_seed2, "T#2", true));
    
    thread1.start();
    thread2.start();
  }
}