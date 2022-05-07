package il.ac.hit.pooly.FactoryTasks;

public class FactoryPriorityTasks {

    /**
     * This method is factory of PriorityTask.
     * In This method you can create ascending or descending order for the priorty of your threads.
     *
     * @param priorityType Enum of ascending or descending order.
     * @param runnable     The action that the user want to run.
     * @return PriorityTask (abstract class).
     */
    public static PriorityTask createPriorityTask(PriorityType priorityType, Runnable runnable) {
        PriorityTask priorityTaskToReturn = null;

        switch (priorityType) {
            case ascending -> priorityTaskToReturn = new PriorityAscTask(runnable);
            case descending -> priorityTaskToReturn = new PriorityDescTask(runnable);
        }

        return priorityTaskToReturn;
    }
}
