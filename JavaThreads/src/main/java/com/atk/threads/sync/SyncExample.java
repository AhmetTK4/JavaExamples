package com.atk.threads.sync;

public class SyncExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        WorkerThread thread1 = new WorkerThread(sharedResource, "Thread-1");
        WorkerThread thread2 = new WorkerThread(sharedResource, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
