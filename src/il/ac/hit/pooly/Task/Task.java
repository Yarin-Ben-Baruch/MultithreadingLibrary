package il.ac.hit.pooly.Task;

public abstract class Task implements ITask{
    private int myPriority;

    public Task() {
        myPriority = 0;
    }

    @Override
    public void setPriority(int level) {
        myPriority = level;
    }

    @Override
    public int getPriority() {
        return myPriority;
    }
}
