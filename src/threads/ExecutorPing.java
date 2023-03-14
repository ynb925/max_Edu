package threads;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPing {
    private static final int crunchifyThreads = 30;

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(crunchifyThreads);

        String[] crunchifyList = {
                "https://crunchify.com",
                "https://yahoo.com",
                "https://www.ebay.com",
                "https://google.com",
                "https://www.example.co",
                "https://paypal.com",
                "http://bing.com/",
                "https://techcrunch.com/",
                "http://mashable.com/",
                "https://pro.crunchify.com/",
                "https://wordpress.com/",
                "https://wordpress.org/",
                "https://example.com/",
                "https://sjsu.edu/",
                "https://crunchify.com/",
                "https://test.com.au/",
                "https://www.wikipedia.org/",
                "https://en.wikipedia.org"
        };

        for (int i = 0; i < crunchifyList.length; i++) {

            String url = crunchifyList[i];
            Runnable worker = new MyRunnable(url);

            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
            // empty body
        }
        System.out.println("\nFinished all threads");
    }


    public static class MyRunnable implements Runnable {
        private final String url;

        MyRunnable(String url) {
            this.url = url;
        }

        @Override
        public void run() {

            String result = "";
            int code = 200;
            try {
                URL siteURL = new URL(url);

                HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();

                connection.setRequestMethod("GET");

                connection.setConnectTimeout(3000);


                connection.connect();

                code = connection.getResponseCode();
                if (code == 200) {
                    result = "-> Green <-\t\t" + "Code: " + code;
                    ;
                } else {
                    result = "-> Yellow <-\t\t" + "Code: " + code;
                }
            } catch (Exception e) {
                result = "-> Red <-\t\t" + "Wrong domain - Exception: " + e.getMessage();

            }
            System.out.println(url + "\t\t\t\tStatus:" + result);
        }
    }
}