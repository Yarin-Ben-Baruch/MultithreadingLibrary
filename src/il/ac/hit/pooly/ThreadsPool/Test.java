package il.ac.hit.pooly.ThreadsPool;
import il.ac.hit.pooly.Task.ITask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    private ExecutorService executorService;

    public Test(int sizeOfThreads) {
        executorService = Executors.newFixedThreadPool(sizeOfThreads);
    }

    public void submit(ITask task) {
        Thread thread = new Thread(() -> task.perform());
        thread.setPriority(getPriority(task));
        executorService.submit(thread);
    }

    private int getPriority(ITask task) {
        if(task.getPriority() > 10)
            return 10;
        else if(task.getPriority() <= 0)
            return 1;
        else
            return task.getPriority();
    }
}
