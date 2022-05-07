package il.ac.hit.pooly.FactoryTasks;

public class PriorityAscTask<T> extends PriorityTask<T> {

    public PriorityAscTask(Runnable task) {
        super(task);
    }

    /**
     * Sorting the priorities from the highest to the lowest.
     */
    @Override
    public int compareTo(PriorityTask that) {
        return Integer.compare(this.getTask().getPriority(),that.getTask().getPriority());
    }
}
