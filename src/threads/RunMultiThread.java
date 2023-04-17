package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunMultiThread {

    private static final int crunchifyThreads = 3;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(crunchifyThreads);

        MultiThread multiThread1 = new MultiThread();
        MultiThread multiThread2 = new MultiThread();
        MultiThread multiThread3 = new MultiThread();

        List<Thread> lThread = new ArrayList<>();

        lThread.add(multiThread1);
        lThread.add(multiThread2);
        lThread.add(multiThread3);

        for (Thread thread : lThread) {
            executor.execute(thread);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            System.out.println("thread name: " + Thread.currentThread().getName());
        }
        System.out.println("\nFinished all threads");
    }
}

