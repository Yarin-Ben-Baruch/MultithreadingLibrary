package il.ac.hit.pooly.ThreadsPool;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * A custom single ThreadPoolExecutor executor.
 */
public class ThreadsPool extends ThreadPoolExecutor {

    /**
     * Creates an executor, with priorities and size for management.
     *
     * @param sizeOfThread The maximum size for management.
     */
    public ThreadsPool(int sizeOfThread) {
        super(1, sizeOfThread, 1000, TimeUnit.SECONDS, new PriorityBlockingQueue<>());
    }

    /**
     * overrides the newTaskFor method to result a Comparable FutureTask instance.
     */
    @Override
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
        return new PriorityTask<>(runnable);
    }
}