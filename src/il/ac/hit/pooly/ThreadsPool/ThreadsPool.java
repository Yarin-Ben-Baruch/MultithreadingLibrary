//package il.ac.hit.pooly.ThreadsPool;
//
//import il.ac.hit.pooly.Task.ITask;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//public class ThreadsPool {
//    private ArrayList<Thread> runningThreads;
//    private Comparator<ITask> taskComparator;
//    private PriorityQueue<ITask> priorityQueue;
//    private int emptyPlace;
//
//
//    public ThreadsPool(int sizeOfThreads) {
//        emptyPlace = sizeOfThreads;
//        runningThreads = new ArrayList<>(sizeOfThreads);
//        taskComparator = (firstTask, secondTask) -> secondTask.getPriority() - firstTask.getPriority();
////        taskComparator = new Comparator<ITask>() {
////            @Override
////            public int compare(ITask o1, ITask o2) {
////                if(o1 == null || o2 == null)
////                    return 0;
////
////                return o2.getPriority() - o1.getPriority();
////            }
////        };
//        priorityQueue = new PriorityQueue<>(taskComparator);
//
//        Thread thread = new Thread(() -> run());
//        thread.start();
//    }
//
//    public void submit(ITask task) {
//        priorityQueue.add(task);
//    }
//
//    public void run() {
//        while (true) {
//            try {
//                if (emptyPlace > 0 && !priorityQueue.isEmpty()) {
//                    Thread thread = new Thread(priorityQueue.poll());
//                    thread.run();
//                    priorityQueue.remove(thread);
//                    runningThreads.add(thread);
//                    emptyPlace--;
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//            updateEmptyPlace();
//        }
//    }
//
//    private void updateEmptyPlace() {
//        ArrayList<Thread> copyList = (ArrayList<Thread>) runningThreads.clone();
//
//        for (Thread currentThread : copyList) {
//            if (!currentThread.isAlive()) {
//                runningThreads.remove(currentThread);
//                emptyPlace++;
//            }
//        }
//    }
//}
