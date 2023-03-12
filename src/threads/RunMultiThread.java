package threads;

public class RunMultiThread {
    public static void main(String[] args) {
        MultiThread multiThread1 = new MultiThread();
        MultiThread multiThread2 = new MultiThread();
        MultiThread multiThread3 = new MultiThread();

        multiThread1.start();
        multiThread2.start();
        multiThread3.start();


        Runnable runnable1 = () -> System.out.println("thread name: " + Thread.currentThread().getName());
        runnable1.run();

    }
}
