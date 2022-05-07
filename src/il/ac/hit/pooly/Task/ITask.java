package il.ac.hit.pooly.Task;

/**
 * This interface use for running tasks.
 * The interface includes the action the user want to do in the name "perform".
 * The interface includes set and get priority to allow the user to get and set the variable.
 */
public interface ITask extends Runnable{
    @Override
    default void run(){ perform();}
    void perform();
    void setPriority(int level);
    int getPriority();
}