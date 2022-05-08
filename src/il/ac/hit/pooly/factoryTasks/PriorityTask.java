package il.ac.hit.pooly.factoryTasks;

import il.ac.hit.pooly.task.ITask;

import java.util.concurrent.FutureTask;


/**
 * A class that inherits and expands FutureTask
 */
public abstract class PriorityTask<T> extends FutureTask<T> implements Comparable<PriorityTask<T>> {
    private final ITask task;

    public PriorityTask(Runnable task) {
        super(task, null);
        this.task = (ITask) task;
    }

    /**
     * @return the received task.
     */
    public ITask getTask() {
        return task;
    }
}