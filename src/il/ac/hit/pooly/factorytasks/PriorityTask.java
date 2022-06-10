package il.ac.hit.pooly.factorytasks;

import il.ac.hit.pooly.task.Task;

import java.util.concurrent.FutureTask;


/**
 * A class that inherits and expands FutureTask
 */
public abstract class PriorityTask<T> extends FutureTask<T> implements Comparable<PriorityTask<T>> {
    private final Task task;

    public PriorityTask(Runnable task) {
        super(task, null);
        this.task = (Task) task;
    }

    /**
     * @return the received task.
     */
    public Task getTask() {
        return task;
    }
}