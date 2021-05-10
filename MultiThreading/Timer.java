package MultiThreading;

public class Timer {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> getCurrentTime());
        thread.start();
    }
    public static void getCurrentTime(){
        while(true) {
            System.out.println(java.time.LocalTime.now());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
