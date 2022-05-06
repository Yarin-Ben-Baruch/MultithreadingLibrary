package il.ac.hit.pooly.ThreadsPool;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadExecutor {
    private boolean running = true;
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue();
    private List<Thread> runningThreads;
    private int emptyPlace;

    public synchronized void run() {
        while(running) {

            try {
                if(emptyPlace < runningThreads.size()) {
                    Runnable runnable = queue.take();
                    Thread thread = new Thread(runnable);
                    runningThreads.add(thread);
                    thread.run();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
                stop();
            }
        }
    }

    private void updateEmptyPlace(){
        for(Thread currentThread : runningThreads){
            if(!currentThread.isAlive()){
                emptyPlace++;
            }
        }
    }

    private void addThread(Thread thread){

    }

    public void stop() {
        running = false;
    }
}
