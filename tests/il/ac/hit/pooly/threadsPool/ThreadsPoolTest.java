package il.ac.hit.pooly.threadsPool;

import il.ac.hit.pooly.factorytasks.PriorityType;
import il.ac.hit.pooly.task.TaskImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * This class performs due diligence on priority requests.
 */
public class ThreadsPoolTest {
    ThreadPoolExecutor threadPoolExecutor;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        threadPoolExecutor.shutdown();
        threadPoolExecutor = null;
    }

    @Test
    public void checkOrderPriority() {
        threadPoolExecutor = new ThreadsPool(1, PriorityType.ascending);

        threadPoolExecutor.submit(new TaskImpl("T1", 1));
        threadPoolExecutor.submit(new TaskImpl("T7", 7));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T4", 4));
        threadPoolExecutor.submit(new TaskImpl("T3", 3));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T2", 2));
    }

    @Test
    public void checkOrderPriority2() {
        threadPoolExecutor = new ThreadsPool(2,PriorityType.descending);

        threadPoolExecutor.submit(new TaskImpl("T100", 100));
        threadPoolExecutor.submit(new TaskImpl("T1", 7));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T70", 70));
    }

    @Test
    public void checkOrderPriority3() {
        threadPoolExecutor = new ThreadsPool(5,PriorityType.ascending);

        threadPoolExecutor.submit(new TaskImpl("T100", 100));
        threadPoolExecutor.submit(new TaskImpl("T1", 7));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T70", 70));
        threadPoolExecutor.submit(new TaskImpl("T100", 100));
        threadPoolExecutor.submit(new TaskImpl("T1", 7));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T70", 70));
    }

    @Test
    public void checkOrderPriority4() {
        threadPoolExecutor = new ThreadsPool(3,PriorityType.descending);

        threadPoolExecutor.submit(new TaskImpl("T-1", -1));
        threadPoolExecutor.submit(new TaskImpl("T1", 7));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T-70", -70));
        threadPoolExecutor.submit(new TaskImpl("T100", 100));
        threadPoolExecutor.submit(new TaskImpl("T1", 7));
        threadPoolExecutor.submit(new TaskImpl("T5", 5));
        threadPoolExecutor.submit(new TaskImpl("T70", 70));
    }
}