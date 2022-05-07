package il.ac.hit.pooly.Task;
import il.ac.hit.pooly.ThreadsPoolException;

import java.util.concurrent.*;


public class Task implements ITask{
    private String name;
    private int priority;

    public Task(String name, int priority){
        setName(name);
        setPriority(priority);
    }

    public Task(String name){
        this(name,0);
    }

    public Task(){
        this("No name", 0);
    }

    @Override
    public void perform() {
        try {
            System.out.println(this.name + " triggered successfully");
            Thread.sleep(2000);
            System.out.println(this.name + " completed successfully");
        } catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(interruptedException);
        }
    }

    @Override
    public void setPriority(int level) {
        priority = level;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public void setName(String name){
//        if(name.isEmpty()){
//            throw new ThreadsPoolException("Can't have a empty name");
//        }
        this.name = name;
    }
}
