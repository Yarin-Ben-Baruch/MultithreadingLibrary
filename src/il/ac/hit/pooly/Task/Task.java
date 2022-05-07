package il.ac.hit.pooly.Task;

/**
 * This class serves as an example and a default implementation for the interface ITask
 */
public class Task implements ITask{
    private String name;
    private int priority;

    /**
     * This ctor is the main ctor that all the ctor call him.
     * In this ctor you can set the name and the priority of the thread.
     * @param name This variable is for the name of the running thread.
     * @param priority This variable is for priority of the thread.
     */
    public Task(String name, int priority){
        setName(name);
        setPriority(priority);
    }

    /**
     * This ctor call the main ctor with default priority and custom name.
     * The default value in the priority is 0.
     * @param name This is the name of the running thread.
     */
    public Task(String name){
        this(name,0);
    }

    /**
     * This ctor call the main ctor with default values for the priority and name.
     * The default values are priority 0 and "No name" for the name.
     */
    public Task(){
        this("No name", 0);
    }

    /**
     * This method is implements the Interface method perform.
     * The method perform is the operation that the user want to perform in the thread.
     * In this implementation we made a default implementation that will help the user
     * understand which thread running before the others.
     */
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

    /**
     * This is basic setter that set the priority to the priority that the user choose.
     * @param level This variable is decided the priority of the thread.
     */
    @Override
    public void setPriority(int level) {
        priority = level;
    }

    /**
     * This is basic getter that return the priority of the thread.
     * @return the priority of the thread.
     */
    @Override
    public int getPriority() {
        return priority;
    }

    /**
     * This is basic setter that set the name to the thread.
     * @param name This variable is decided the name of the thread.
     */
    public void setName(String name){
//        if(name.isEmpty()){
//            throw new ThreadsPoolException("Can't have a empty name");
//        }
        this.name = name;
    }
}
