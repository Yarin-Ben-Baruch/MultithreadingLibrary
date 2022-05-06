package il.ac.hit.pooly.Task;

public interface ITask{
    void perform();
    void setPriority(int level);
    int getPriority();
}