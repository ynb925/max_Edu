package threads;


import java.util.TreeMap;

public class RunMultiThreadOriginal {

    public static void main(String[] args) {
        MultiThread multiThread1 = new MultiThread();
        MultiThread multiThread2 = new MultiThread();
        MultiThread multiThread3 = new MultiThread();

        multiThread1.start();
        multiThread2.start();
        multiThread3.start();

        Runnable runnable1 = () -> System.out.println("thread name: " + Thread.currentThread().getName());

        Thread myRun1 = new Thread(runnable1);
        Thread myRun2 = new Thread(runnable1);
        Thread myRun3 = new Thread(runnable1);
        myRun1.start();
        myRun2.start();
        myRun3.start();
    }
}