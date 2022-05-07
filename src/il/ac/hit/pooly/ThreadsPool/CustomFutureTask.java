package il.ac.hit.pooly.ThreadsPool;
import il.ac.hit.pooly.Task.ITask;
import java.util.concurrent.FutureTask;

// A comparable FutureTask
class CustomFutureTask<T> extends FutureTask<T> implements Comparable<CustomFutureTask<T>> {
    private final ITask task;

    public CustomFutureTask(Runnable task) {
        super(task, null);
        this.task = (ITask) task;
    }

    @Override
    public int compareTo(CustomFutureTask that) {
        return Integer.compare(that.task.getPriority(), this.task.getPriority());
    }
}