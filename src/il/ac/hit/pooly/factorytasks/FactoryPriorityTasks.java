package il.ac.hit.pooly.factorytasks;

/**
 * This class represents an option manufacturing plant of our priority types.
 * So if you want to add a different sort form, we'll just have to build a new class
 * and add its name to the sort options(enum), without changing the rest of the code.
 */
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
