package il.ac.hit.pooly;

import il.ac.hit.pooly.Task.Task;
import il.ac.hit.pooly.FactoryTasks.PriorityType;
import il.ac.hit.pooly.ThreadsPool.ThreadsPool;

import java.util.concurrent.ThreadPoolExecutor;

public class Program {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadsPool(1, PriorityType.ascending);

        tpe.submit(new Task("T1", 1));
        tpe.submit(new Task("T7", 7));
        tpe.submit(new Task("T5", 5));
        tpe.submit(new Task("T4", 4));
        tpe.submit(new Task("T3", 3));
        tpe.submit(new Task("T5", 5));
        tpe.submit(new Task("T2", 2));
    }
}
