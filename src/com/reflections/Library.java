package com.reflections;

/**
 * Створити клас Library який містить наступні елементи:
 * <p>
 * Чотири поля з різними модифікаторами доступу: name (public), numberOfBooks (private), isOpen (protected) та address (default).
 * Конструктор з чотирма параметрами.
 * Три методи з різними модифікаторами доступу: addBook() (private), openLibrary() (protected) ,та closeLibrary() (default).
 * Два public методи для отримання значень приватних полів: getNumberOfBooks() та getAddress().
 */
public class Library implements Runnable {

    public String name;
    private int numberOfBooks;
    protected boolean isOpen;
    String address;

    public Library() {
    }

    public Library(String name, int numberOfBooks, boolean isOpen, String address) {
        this.name = name;
        this.numberOfBooks = numberOfBooks;
        this.isOpen = isOpen;
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getAddress() {
        return address;
    }

    private void addBook() {
    }

    protected void openLibrary() {
    }

    void closeLibrary() {
    }

    @Override
    public void run() {
        System.out.println(" class Library implements Runnable --- just print info");
    }
}
