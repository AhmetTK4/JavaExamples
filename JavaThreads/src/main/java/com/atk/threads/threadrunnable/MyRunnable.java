package com.atk.threads.threadrunnable;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + " is executing: " + i);
        }
    }
}
