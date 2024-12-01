package com.atk.threads.threadrunnable;

public class RunnableExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread-A");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-B");

        thread1.start();
        thread2.start();
    }
}
