package il.ac.hit.pooly.FactoryTasks;

public class PriorityDescTask<T> extends PriorityTask<T>{

    public PriorityDescTask(Runnable task) {
        super(task);
    }
    /**
     * Sorting the priorities from the highest to the lowest.
     */
    @Override
    public int compareTo(PriorityTask that) {
        return Integer.compare(that.getTask().getPriority(), this.getTask().getPriority());
    }
}
