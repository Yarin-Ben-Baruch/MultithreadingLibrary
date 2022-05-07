package il.ac.hit.pooly.ThreadsPool;
import java.util.concurrent.*;

// A custom single ThreadPoolExecutor executor that overrides the newTaskFor method
// to result a Comparable FutureTask instance.

public class ThreadsPool extends ThreadPoolExecutor {

    public ThreadsPool(int sizeOfThread) {
        super(sizeOfThread, sizeOfThread, 1000, TimeUnit.SECONDS, new PriorityBlockingQueue<>());
    }

    @Override
    protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T value) {
        return new CustomFutureTask<>(runnable);
    }


}