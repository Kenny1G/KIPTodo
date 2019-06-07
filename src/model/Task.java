package model;

import java.time.LocalDate;

public class Task
{
    private String label;
    private boolean isDone;
    private LocalDate date;

    public Task(String label)
    {
        this.label = label;
        this.isDone = false;
    }
    // Have two constructors in case user does not want to set a date when they add task
    public Task(String label, LocalDate date)
    {
        this(label);
        this.date = date;
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
    public LocalDate getDate()
    {
        return date;
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
    public void setDate(LocalDate date)
    {
        this.date = date;
    }

}
