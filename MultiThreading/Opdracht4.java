package MultiThreading;

public class Opdracht4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('#',100));
        Thread thread2 = new Thread(() -> print('*',100));
        thread2.setDaemon(true);
        thread1.setDaemon(true);
        thread1.start();
        thread2.start();

    }

    public static void print(char c , int count){
        for (int i = 0 ; i < count;i++){
            System.out.println(c);
            Thread.yield();
        }
    }
}
