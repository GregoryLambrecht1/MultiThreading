package MultiThreading;

public class Opdracht7 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> increment(counter,10000));
        Thread thread2 = new Thread(() -> increment(counter,10000));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());

    }

    public static void increment(Counter counter ,int number){
        for (int i = 0 ; i < number;i++){
            counter.increment();
        }
    }
}
