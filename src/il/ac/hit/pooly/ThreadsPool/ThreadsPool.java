package il.ac.hit.pooly.ThreadsPool;

import il.ac.hit.pooly.FactoryTasks.FactoryPriorityTasks;
import il.ac.hit.pooly.FactoryTasks.PriorityType;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * A custom single ThreadPoolExecutor executor.
 */
public class ThreadsPool extends ThreadPoolExecutor {
    private PriorityType typeOfPriority;

    /**
     * Creates an executor, with priorities and size for management.
     *
     * @param sizeOfThread The maximum size for management.
     */
    public ThreadsPool(int sizeOfThread, PriorityType typeOfPriority) {
        super(1, sizeOfThread, 1000, TimeUnit.SECONDS, new PriorityBlockingQueue<>());
        setTypeOfPriority(typeOfPriority);
    }

    /**
     * overrides the newTaskFor method to result a Comparable FutureTask instance.
     */
    @Override
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
        return FactoryPriorityTasks.createPriorityTask(typeOfPriority, runnable);
    }

    /**
     * Retains the priority type.
     *
     * @param typeOfPriority Holds the types of priorities.
     */
    private void setTypeOfPriority(PriorityType typeOfPriority) {
        this.typeOfPriority = typeOfPriority;
    }
}