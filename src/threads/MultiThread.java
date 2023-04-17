package threads;

/**
 * Створити класс MultiThread який наслідує Thread і імплементувати метод run
 * який виводить в консоль напис "The task is working" і потім створити 3 екземпляри
 * цього класу і запустити їх один за одним.
 * <p>
 * Зробити потік типу Runnable (використовуючи лямбда вираз) в якому треба отримати з потоку ім'я і вивести
 * його в консоль після слів "thread name: ". Далі треба запустити цей потік.
 * <p>
 * Прочитати про екзекютори і повторити вправу але переписати.
 * https://crunchify.com/how-to-run-multiple-threads-concurrently-in-java-executorservice-approach/
 */

public class MultiThread extends Thread {

    @Override
    public void run() {
        System.out.println("The task is working");
    }
}
