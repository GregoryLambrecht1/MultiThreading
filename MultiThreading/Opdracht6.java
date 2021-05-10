package MultiThreading;

public class Opdracht6 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> print('#',100));
        Thread thread2 = new Thread(() -> print('*',100));
        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();
            Thread.sleep(3000);
            if (Thread.interrupted()){
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println("end");
        }
    }
    public static void print(char c , int count){
        for (int i = 0 ; i < count;i++){
            if (Thread.interrupted()){
                Thread.interrupted();
            }
            System.out.println(c);
            try{
                Thread.sleep(100);
            }catch (InterruptedException ex){
            }
        }
    }
}
