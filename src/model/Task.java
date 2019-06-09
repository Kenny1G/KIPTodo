package model;


public class Task
{
    private String label;
    private boolean isDone;

    public Task(String label)
    {
        this.label = label;
        this.isDone = false;
    }
    // Getters
    public String getLabel()
    {
        return this.label;
    }
    public boolean getDone()
    {
        return this.isDone;
    }
    // Setters
    public void setLabel(String label)
    {
        this.label = label;
    }
    public void setDone(boolean isDone)
    {
        this.isDone = isDone;
    }

}
