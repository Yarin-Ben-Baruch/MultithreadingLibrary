package il.ac.hit.pooly.Task;

public interface ITask extends Runnable{
    @Override
    default void run(){ perform();}
    void perform();
    void setPriority(int level);
    int getPriority();
}