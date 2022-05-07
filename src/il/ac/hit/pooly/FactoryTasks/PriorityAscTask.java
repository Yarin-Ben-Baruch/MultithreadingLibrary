package il.ac.hit.pooly.FactoryTasks;

/**
 * This class extends the abstract class PriorityTask.
 * The extension is in the Comparison, this class order the tasks in ascending order.
 * @param <T>
 */
public class PriorityAscTask<T> extends PriorityTask<T> {

    /**
     * This is basic ctor that called the super
     *
     * @param task
     */
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
