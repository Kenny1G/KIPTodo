package model;

import model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoList
{

    public static List<Task> todos;

    public TodoList()
    {
         todos = new ArrayList<Task>();
    }

    public static void addTask(String label)
    {
        Task task = new Task(label);
        todos.add(task);
    }
    public static void addTask(String label, LocalDate date)
    {
        Task task = new Task(label, date);
        todos.add(task);
    }
    public static void removeTask(Task task)
    {
        todos.remove(task);
    }

    public static void toggleDone(Task task)
    {
        task.setDone(!task.getDone());
    }

    public static void displayTodos()
    {
        for(Task task : todos)
        {
            System.out.println(task.getLabel());
            System.out.println(task.getDone());
        }
    }
}
