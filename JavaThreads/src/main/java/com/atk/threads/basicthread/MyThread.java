package com.atk.threads.basicthread;

public class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+ " is running now: " + i);
            try {
                Thread.sleep(1_000);
            }catch (InterruptedException e){
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
