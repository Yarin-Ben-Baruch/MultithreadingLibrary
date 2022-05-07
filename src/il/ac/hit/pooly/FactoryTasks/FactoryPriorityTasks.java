package il.ac.hit.pooly.FactoryTasks;

public class FactoryPriorityTasks {

    public static PriorityTask createPriorityTask(PriorityType priorityType, Runnable runnable) {
        PriorityTask priorityTaskToReturn = null;

        switch (priorityType) {
            case ascending -> priorityTaskToReturn = new PriorityAscTask(runnable);
            case descending -> priorityTaskToReturn = new PriorityDescTask(runnable);
        }

        return priorityTaskToReturn;
    }
}
