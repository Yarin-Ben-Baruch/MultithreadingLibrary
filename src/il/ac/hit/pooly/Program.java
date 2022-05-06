package il.ac.hit.pooly;

import il.ac.hit.pooly.Task.Task;
import il.ac.hit.pooly.ThreadsPool.Test;
//import il.ac.hit.pooly.ThreadsPool.ThreadsPool;

public class Program {
    public static void main(String[] args) {
        Test threadsPool = new Test(2);

        threadsPool.submit(new Task() {
            @Override
            public void perform() {
                for (int i = 10; i > 0; i--) {
                    System.out.println("kaka");
                }
            }
        });


        for (int i = 0; i < 10; i++) {

            Task myTask = new Task() {
                @Override
                public void perform() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Priority is: " + getPriority());
                }
            };
            myTask.setPriority(i);
            threadsPool.submit(myTask);
        }

    }
}
