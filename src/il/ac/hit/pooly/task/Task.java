package il.ac.hit.pooly.task;

/**
 * This interface use for running tasks.
 * The interface includes the action the user want to do in the name "perform".
 * The interface includes set and get priority to allow the user to get and set the variable.
 */
public interface Task extends Runnable{

    /**
     * This method execute the preform action, because the interface extends from Runnable.
     */
    @Override
    default void run(){ perform();}
    /**
     * This method is implements the Interface method perform.
     * The method perform is the operation that the user want to perform in the thread.
     */
    void perform();
    /**
     * This is basic setter that set the priority to the priority that the user choose.
     * @param level This variable is decided the priority of the thread.
     */
    void setPriority(int level);
    /**
     * This is basic getter that return the priority of the thread.
     * @return the priority of the thread.
     */
    int getPriority();
}