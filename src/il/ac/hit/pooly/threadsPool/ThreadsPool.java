package il.ac.hit.pooly.threadsPool;

import il.ac.hit.pooly.factorytasks.FactoryPriorityTasks;
import il.ac.hit.pooly.factorytasks.PriorityType;

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
     * @param typeOfPriority type of the sort thread
     */
    public ThreadsPool(int sizeOfThread, PriorityType typeOfPriority) {
        super(1, sizeOfThread, 1, TimeUnit.SECONDS, new PriorityBlockingQueue<>());

        setTypeOfPriority(typeOfPriority);
    }

    /**
     * Creates an executor, with priorities and size for management.
     * with the default descending sort.
     * @param sizeOfThread The maximum size for management.
     */
    public ThreadsPool(int sizeOfThread){
        this(sizeOfThread, PriorityType.descending);
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