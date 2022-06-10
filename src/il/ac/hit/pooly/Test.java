package il.ac.hit.pooly;

import il.ac.hit.pooly.factorytasks.PriorityType;
import il.ac.hit.pooly.task.TaskImpl;
import il.ac.hit.pooly.threadsPool.ThreadsPool;

import java.util.concurrent.ThreadPoolExecutor;

public class Test {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor;

        threadPoolExecutor = new ThreadsPool(1, PriorityType.descending);

        threadPoolExecutor.submit(new TaskImpl("Thread-1", 1));
        threadPoolExecutor.submit(new TaskImpl("Thread-7", 7));
        threadPoolExecutor.submit(new TaskImpl("Thread-5", 5));
        threadPoolExecutor.submit(new TaskImpl("Thread-4", 4));
        threadPoolExecutor.submit(new TaskImpl("Thread-3", 3));
        threadPoolExecutor.submit(new TaskImpl("Thread-5", 5));
        threadPoolExecutor.submit(new TaskImpl("Thread-2", 2));

        threadPoolExecutor.shutdown();
    }
}
