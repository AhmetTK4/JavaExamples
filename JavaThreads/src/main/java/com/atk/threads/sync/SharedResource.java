package com.atk.threads.sync;

public class SharedResource {
    public synchronized void printNumbers(String threadName){
        for (int i=0;i<=5; i++){
            System.out.println(threadName + " prints: " + i);
            try{
                Thread.sleep(1_000);
            }catch (InterruptedException e){
                System.out.println("Interrupted: "+ e.getMessage());
            }
        }
    }
}
