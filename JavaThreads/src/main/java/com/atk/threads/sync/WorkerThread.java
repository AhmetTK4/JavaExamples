package com.atk.threads.sync;

public class WorkerThread extends Thread{
    private SharedResource resource;
    private String threadName;

    public WorkerThread(SharedResource resource,String threadName){
        this.resource = resource;
        this.threadName = threadName;
    }

    @Override
    public void run(){
        resource.printNumbers(threadName);
    }
}
