package MultiThreading;

public class Opdracht1 {
    public static void main(String[] args) {

            Thread thread1 = new Thread(new PrintThread('*', 10));
            Thread thread2 = new Thread(new PrintThread('%',10));
            thread1.start();
            thread2.start();

        }
    }

