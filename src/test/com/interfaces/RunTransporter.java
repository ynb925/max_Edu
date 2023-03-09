package test.com.interfaces;

/**
 * Зробити інтерфейс Vehicle з методом order() і 2 класи які його імплементують:
 * Car і Bicycle котрі будуть перевизначати (@Override) цей метод
 * і в ньому виводити у консоль повідомлення the car is on the way для машини і the bicycle is on the way для велосипеду.
 *
 * Також треба створити ще один клас Transporter з методом transport
 * який буде приймати в якості аргументу об’єкт типу Vehicle і викликати в ньому метод drive().
 *
 * Далі потрібно в метод main створити об’єкти класу Transporter, Car і Bicycle
 * і викликати метод transport об’єкту Transporter
 * і передати в нього спочатку об’єкт класу Car і потім Bicycle.
 * В консолі повинно бути виведено 2 повідомлення:
 * the car is on the way
 * the bicycle is on the way
 */
public class RunTransporter {
    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        transporter.transport(car);
        transporter.transport(bicycle);
    }
}
