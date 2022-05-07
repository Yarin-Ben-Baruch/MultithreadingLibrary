package il.ac.hit.pooly.ThreadsPool;

import il.ac.hit.pooly.Task.ITask;

import java.util.concurrent.FutureTask;


/**
 * A class that inherits and expands FutureTask
 */
class PriorityTask<T> extends FutureTask<T> implements Comparable<PriorityTask<T>> {
    private final ITask task;

    public PriorityTask(Runnable task) {
        super(task, null);
        this.task = (ITask) task;
    }

    /**
     * Sorting the priorities from the highest to the lowest.
     */
    @Override
    public int compareTo(PriorityTask that) {
        return Integer.compare(that.task.getPriority(), this.task.getPriority());
    }
}